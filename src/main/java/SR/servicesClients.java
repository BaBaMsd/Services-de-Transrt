package SR;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Data.Database;
import _classes.Client;

public class servicesClients {
	private static Map<Long, Client> cli = Database.getClient();

	public servicesClients() {
	
	}
	
	public ArrayList<Client> verifclient(){
		return new ArrayList<Client>(cli.values());
	}

	
	public static List<Client> getClis(){
		return new ArrayList<Client>(cli.values());
	}
	
	public static Client getClient(long id) {
		return cli.get(id);
	}
	
	public static  String addClient(Client C){
		
        C.setId(cli.size()+1);
	        cli.put(C.getId(),C);
	        return C.getNom()+" a ete ajouter avec succes";
	}
	
	public static String updateClient(Client C) {
		if(C.getId() <= 0) {
			return null;
		}
		cli.put(C.getId(),C);
		System.out.println("Updated");
		return C.getNom()+" a ete modifierer avec succes";
		
	}
	
	public static String supClient(long id) {
		System.out.println("removed");
		cli.remove(id);
		return "supprimer avec succes";
	}
	
	
	
}

