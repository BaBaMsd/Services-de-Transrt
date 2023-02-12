package SR;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import _classes.*;
import Data.*;

public class ServiceCompte {

	private static Map<Long, Compte> compte = Database.getCompte();

	public ServiceCompte() {

	}


	public static ArrayList<Compte> ListComptes(){
		return new ArrayList<Compte>(compte.values());
	}
	/*public static ArrayList<Compte> getComptes() {
		return new ArrayList<Compte>(compte.values());
	}*/
	
	public static Compte getCompte(long id) {
		return compte.get(id);
	}

	public static Compte addCompte(Compte c) {
		c.setId(compte.size() + 1);
		c.setClient(servicesClients.getClient(c.getClient().getId()));
		c.setService(Servces_SrTransf.getSR(c.getService().getId()));	
		compte.put(c.getId(), c);
		return c;
	}

	public static Compte updateCompte(Compte c) {
		if (c.getId() <= 0) {
			return null;
		}
		c.setClient(servicesClients.getClient(c.getClient().getId()));
		c.setService(Servces_SrTransf.getSR(c.getService().getId()));
		compte.put(c.getId(), c);
		System.out.println("Updated");
		return c;
	}

	public static Compte deleteCompte(long id) {
		System.out.println("removed");
		return compte.remove(id);
	}

}
