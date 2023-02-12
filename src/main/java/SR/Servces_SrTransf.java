package SR;

import java.util.ArrayList;
import java.util.Map;

import Data.Database;
import _classes.Responsable;
import _classes.ServiceTrensfer;


public class Servces_SrTransf {
	
	private static Map<Long, ServiceTrensfer> serviceTR = Database.getServicetransfer();
	
	public Servces_SrTransf() {
		
	}
	
	public static ArrayList<ServiceTrensfer> getServicetransfer(){
		return new ArrayList<ServiceTrensfer>(serviceTR.values());
	}
	
	public static  ServiceTrensfer addServicTransfer(ServiceTrensfer SR){
		
		SR.setId(serviceTR.size()+1);
		SR.setResponsable(serviceRespo.getRespo(SR.getResponsable().getId()));
		serviceTR.put(SR.getId(),SR);
	        return SR;
	}
	
	public static ServiceTrensfer UpdateServicTransfer(ServiceTrensfer SR) {
		if(SR.getId() <=0) {
		return null;
		}
		SR.setResponsable(serviceRespo.getRespo(SR.getResponsable().getId()));
		serviceTR.put(SR.getId(),SR);
		System.out.println("Modifier");
		return SR;
	}
	
	public static ServiceTrensfer getSR(long id) {
		return serviceTR.get(id);
	}

	

}
