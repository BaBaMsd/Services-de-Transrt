package Controller;


import java.util.List;
import _classes.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import jakarta.ws.rs.*;
//import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import SR.*;
import _classes.Transfer;

@Path("/reponsable")
@Produces("application/json")
public class RespoController {
	
	
	@Context HttpServletRequest req;
	
	@GET
  	@Path("/deconect")
     
      public String logout(){
          HttpSession session = req.getSession();
          session.invalidate();
          return "Responsable Déconnecté";
     }
	
	
	
	
	@GET
	@Path("/ListTr")
	public List<Transfer> ListTr(){
		return ServiceCompte.ListTr();
	}
	
	@GET
	@Path("/anulleTR/{id}")
	public String anullé(@PathParam("id") long id) {
		return ServiceCompte.anullé(id);	
	}
    @GET
	@Path("/comptes")
	public List<Compte> getComptes(){
		return ServiceCompte.ListComptes();
	}
    
   
   
    
   
    
  

}
