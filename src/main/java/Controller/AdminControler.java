package Controller;

//importer_les_package_et_bibliotheque_necessite

import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.*;

import java.util.List;

import SR.Servces_SrTransf;
import SR.serviceRespo;
import SR.servicesClients;
import _classes.Admin;
import _classes.Client;
import _classes.Responsable;
import _classes.ServiceTrensfer;
import jakarta.ws.rs.QueryParam;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

//Definer_les_url_des_services_admin

@Path("/admin")
@Produces("application/json")
public class AdminControler {
	
	//Modifier_le_password d'Admin
    @PUT
    @Path("/pass")
    //@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String changepassword(@QueryParam("password") String password){
        Admin.setPassdf(password);
        System.out.println("change mot de pass");
        return "password changed ";
    }
    
    //Liste_Les_responsables
    @GET
	@Path("/Respos")
	public List<Responsable>getResponsables(){
		return serviceRespo.getResponsables();
	}
    
    @GET
	@Path("/Respo")
	public Responsable getResponsable(@QueryParam("id") long id){
		return serviceRespo.getRespo(id);
	}
    
    //ajouter_un_respo
    @PUT
    @Path("/nouveauRespo")
    public Responsable nouveauRespo(Responsable R) {
    	serviceRespo.addResponsable(R);
    	return R; 	
    }
    
    //Modifier_un_responsable
    @POST
    @Path("/modifRespo")
    public Responsable modiRespo(Responsable R) {
    	serviceRespo.updateRespo(R);
    	return R; 	
    }
    
    //Supprim_respo
    @DELETE
	@Path("/supRespo")
	public Responsable supResponsable(@QueryParam("id") long id){
		return serviceRespo.supRespo(id);
	}
    
    @GET
	@Path("/client")
	public List<Client>getClient(){
		return servicesClients.getClis();
	}
    
    @GET
	@Path("/cli")
	public Client getClient(@QueryParam("id") long id){
		return servicesClients.getClient(id);
	}
    
    @PUT
    @Path("/nouveauclient")
    public Client nouveauClient(Client C) {
    	servicesClients.addClient(C);
    	return C; 	
    }
    
    @POST
    @Path("/modifclient")
    public Client modiClient(Client C) {
    	servicesClients.updateClient(C);
    	return C; 	
    }
    
    @DELETE
	@Path("/supclient")
	public Client supClient(@QueryParam("id") long id){
		return servicesClients.supClient(id);
	}
    
    
    
    @GET
	@Path("/sr")
	public List<ServiceTrensfer>getServices(){
		return Servces_SrTransf.getServicetransfer();
	}
    
    
    @PUT
    @Path("/nouvelleSR")
    public ServiceTrensfer nouvelleDRt(ServiceTrensfer SR) {
    	Servces_SrTransf.addResponsable(SR);
    	return SR; 	
    }
    
    

}

    
    
    
    
    
  
