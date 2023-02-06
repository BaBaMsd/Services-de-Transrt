package Controller;




//_authentification_admin


import _classes.*;

import java.util.ArrayList;


import SR.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Context;

@Path("/")
public class Auth {
	
	@Context HttpServletRequest req;
	
	//Sevice_controle_connexion
	Responsable R = new Responsable();
	
	serviceRespo rs = new serviceRespo();
	
	
	 private int verifierespo( String login,String password){
		  ArrayList<Responsable> listRespo = rs.verifrespo();
		   for(int i=0;i< (int)listRespo.size();i++){
			if(login.equals((String) listRespo.get(i).getLogin()) && password.equals((String) listRespo.get(i).getPassword() ) ){
				System.out.println(i+1);
				System.out.println("Oui");
				return i+1;
			}
		}
		System.out.println("Non");
		return -1;
	}
	   
	
	
	
	@POST
	@Path("/auth")
	public String login(@QueryParam("login") String login,@QueryParam("password") String password) {
		
		HttpSession session = req.getSession();
		if(login.equals(Admin.getLogindf()) && password.equals(Admin.getPassdf())) {
			session.setAttribute("adminSession",login);
			return "HEllo Admin";
		}
		else if(verifierespo(login,password)>=0){	
			session.setAttribute("responsableSession",login);
            return "Hello Responsable  : "+login;
			
		}
		else {
			return "Vous n'etes pas admin ni Responsable";
		}
				
		
	}
	
	//Sevice_de_connexion
	@GET
	@Path("/logout")
   
    public String logout(){
        HttpSession session = req.getSession();
        session.invalidate();
        return "logged out";
    }
	
	

}
