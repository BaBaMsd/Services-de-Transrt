package Controller;

import java.util.List;

import _classes.*;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import SR.*;

@Path("/reponsable")
@Produces("application/json")
public class RespoController {
	
// 
    
//    @GET
//	@Path("/assignClient")
//	public List<Client> getClients(){
//    	return ServiceTransf.getServicetransfer().getclients();
//	}
//    
//    @GET
//	@Path("/client")
//	public Client getClient(@QueryParam("id") long id){
//		return ServiceClient.getClient(id);
//	}
    @GET
	@Path("/comptes")
	public List<Compte> getComptes(){
		return ServiceCompte.ListComptes();
	}
    
    @GET
	@Path("/compte")
	public Compte getCompte(@QueryParam("id") long id){
		return ServiceCompte.getCompte(id);
	}
    
    /*@PUT
    @Path("/newCompte")
    public Compte newCompte(Compte C) {
    	ServiceCompte.addCompte(C);
    	return C; 	
    }*/
    
    
    @DELETE
	@Path("/deleteCompte")
	public Compte deleteCompte(@QueryParam("id") long id){
		return ServiceCompte.deleteCompte(id);
	}
     
    @PUT 
    @Path("/addCompte")
    public Compte ajouterCompte( Compte c) {
    	ServiceCompte.addCompte(c);
    	return c ;
    }
  

}
