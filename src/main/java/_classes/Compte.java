package _classes;

public class Compte {
	private long id;
	private double balance;
	private ServiceTrensfer service;
	private Client client ;
	
	
	
	public Compte(long id, double balance, ServiceTrensfer service, Client client) {
		this.id = id;
		this.balance = balance;
		this.service = service;
		this.client = client;
	}
	
	
	public Compte() {
		
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public ServiceTrensfer getService() {
		return service;
	}
	public void setService(ServiceTrensfer service) {
		this.service = service;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	

}
