package _classes;

public class ServiceTrensfer {
	private long id;
	private String nom;
	private Responsable responsable ;
	
	public ServiceTrensfer(long id, String nom, Responsable respo) {
		this.id = id;
		this.nom = nom;
		this.responsable = respo;
	}
	public ServiceTrensfer() {
		
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

	public Responsable getResponsable() {
		return responsable;
	}

	public void setResponsable(Responsable respo) {
		this.responsable = respo;
	}
	
	

}
