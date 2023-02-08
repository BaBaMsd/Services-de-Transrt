package _classes;

public class Client {
	
	private  long id ;
	private String login ;
	private String nom ;
	private String prenom ;
	private String password ;
	private int nni;
	
	public Client(long id, String login, String nom, String prenom, String password, int nni) {
		super();
		this.id = id;
		this.login = login;
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.nni = nni;
	}
	
	
	public Client() {
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getNni() {
		return nni;
	}
	public void setNni(int nni) {
		this.nni = nni;
	}

}
