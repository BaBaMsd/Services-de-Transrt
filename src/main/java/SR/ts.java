package SR;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import _classes.Admin;
import _classes.Client;
import _classes.Responsable;

public class ts extends HttpServlet {
	
	serviceRespo rs = new serviceRespo();
	servicesClients sc = new servicesClients();
	
	private int verifierespo( String login,String password){
		  ArrayList<Responsable> listRespo = rs.verifrespo();
		   for(int i=0;i< (int)listRespo.size();i++){
			if(login.equals((String) listRespo.get(i).getLogin()) && password.equals((String) listRespo.get(i).getPassword() ) ){
				System.out.println(i+1);
				return i+1;
			}
		}
		return -1;
	}
	
	private int verifierclient( String login,String password){
		 ArrayList<Client> listClient = sc.verifclient();
		 for(int i=0;i< (int)listClient.size();i++){
			 if(login.equals((String) listClient.get(i).getLogin()) && password.equals((String) listClient.get(i).getPassword() ) ){
				 
				 return i+1;
			 }
		 }
		 return -1;
	}  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Authentfication</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<H1>Centre De Transfert D'argent</H1>");
		out.println("<form action=\"ss\" method=\"post\">");
		out.println("<input type=\"text\" name=\"login\" placeholder=\"login\"><br>");
		out.println("<br><input type=\"password\" name=\"password\" placeholder=\"password\"><br>");
		out.println("<br><input type=\"submit\" value=\"Connecter\">");
		out.println("</form>");
		out.println("</BODY></HTML>");
		out.close();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 
		 
		HttpSession session = request.getSession();
		String lg = request.getParameter("login");
		String pd = request.getParameter("password");
		PrintWriter out = response.getWriter();
		
		if(lg.equals(Admin.getLogindf()) && pd.equals(Admin.getPassdf())) {
			session.setAttribute("adminSession",lg);
			out.println("<H1>Bienvenue Admin</H1>");
			
			
		}
		else if(verifierespo(lg,pd)>=0){	
			session.setAttribute("responsableSession",lg);
            out.println("<H1>Bienvenue Responsable</H1>");
			
		}else if(verifierclient(lg,pd)>=0){ 
			session.setAttribute("clientSession",lg);
			 out.println("<H1>Bienvenue Client</H1>");
		}else {
			out.println("<H1>Vous n'etes Pas Admin ni respo </H1>");
		}
	}	
	

	
}
