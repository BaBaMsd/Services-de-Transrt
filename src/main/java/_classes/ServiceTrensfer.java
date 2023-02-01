package _classes;

public class ServiceTrensfer {
	private long id;
	private String nom;
	private Responsable respo ;
	
	public ServiceTrensfer(long id, String nom, Responsable respo) {
		super();
		this.id = id;
		this.nom = nom;
		this.respo = respo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Responsable getRespo() {
		return respo;
	}

	public void setRespo(Responsable respo) {
		this.respo = respo;
	}
	
	

}
