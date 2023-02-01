package Controller;


//_authentification_admin


import _classes.Admin;
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
	
	@POST
	@Path("/login")
	public String login(@QueryParam("login") String login,@QueryParam("password") String password) {
		
		HttpSession session = req.getSession();
		if(login.equals(Admin.getLogindf()) && password.equals(Admin.getPassdf())) {
			session.setAttribute("adminSession",login);
			return "HEllo Admin";
		}
		else {
			return "Vous n'etes pas admin";
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
