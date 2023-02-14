package Controller;

import SR.ServiceCompte;
import _classes.Compte;
import jakarta.ws.rs.*;

@Path("/cli")

public class ClientControler {
	
	
	
	
	@GET
	@Path("{idSender}/transfer/{montant}/to/{idReceiver}")
	public String transfertArgent(@PathParam("idSender") long idSender, @PathParam("idReceiver") long idReceiver, @PathParam("montant") double montant){
		return ServiceCompte.transfert(idReceiver, idSender, montant);
	}
	
	@GET
	@Path("compte/{id}/versement/{montant}")
	public String verser(@PathParam("id") long id, @PathParam("montant") double montant){
		return ServiceCompte.verser(id, montant);
	}
	
	
	 @GET
	 @Path("/compte/{id}")
	 public Compte getCompte(@PathParam("id") long id){	 
		 return ServiceCompte.getCompte(id);
	}
	 
	@GET
	@Path("compte/{id}/retrait/{montant}")
	public String retrait(@PathParam("id") long id, @PathParam("montant") double montant){
		return ServiceCompte.retrait(id, montant);
	}
	

	

}
