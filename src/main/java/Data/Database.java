package Data;

import java.util.HashMap;
import java.util.Map;

import _classes.Client;
import _classes.Responsable;
import _classes.ServiceTrensfer;
import _classes.Compte;


public class Database {
	private static Map<Long, Client> client = new HashMap<>();
	private static Map<Long, Responsable> responsable = new HashMap<>();
	private static Map<Long, ServiceTrensfer> servicetransfer = new HashMap<>();
	private static Map<Long, Compte> compte = new HashMap<>();
	
	public static Map<Long, Compte> getCompte() {
		return compte;
	}
	
	public static Map<Long, Client> getClient() {
		client.put(1L, new Client(1,"Client1","medvall","ahmed","123400",12345678));
		return client;
	}
	
	public static Map<Long, Responsable> getResponsable() {
		responsable.put(1L, new Responsable(1,"respo","medvall","ahmed","1234",12345678));
		return responsable;
	}
	public static Map<Long, ServiceTrensfer> getServicetransfer() {
		return servicetransfer;
	}

}
