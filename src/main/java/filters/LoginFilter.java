package filters;


import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;
import java.io.PrintWriter;

import _classes.Admin;



public class LoginFilter extends HttpFilter implements Filter {
    private boolean Ad = false;
    public LoginFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter ();
		response.setContentType("text/html");
	    String login= request.getParameter("login" );  
        String password =request.getParameter("password"); 
       
        Admin ad = new Admin();
        Ad = ad.verifierAdmin(login,password);
        
        if (Ad == true) {
        	chain.doFilter(request, response);
        } 
        else{ out.print ("erreur login ou mot de passe incorrect" );
	   }  
        out.close();
         

		// pass the request along the filter chain
		
	}

}
