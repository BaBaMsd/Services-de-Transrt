package _classes;

public class Transfer {
	private long id ;
	private long idDeb;
	private long idCred;
	private long idServiceDeb;
	private double montant;
		
	
	
	public Transfer() {
	}


	public Transfer(long id, long idDeb, long idCred, long idServiceDeb) {
		this.id = id;
		this.idDeb = idDeb;
		this.idCred = idCred;
		this.idServiceDeb = idServiceDeb;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public long getIdDeb() {
		return idDeb;
	}


	public void setIdDeb(long idDeb) {
		this.idDeb = idDeb;
	}


	public long getIdCred() {
		return idCred;
	}


	public void setIdCred(long idCred) {
		this.idCred = idCred;
	}


	public long getIdServiceDeb() {
		return idServiceDeb;
	}


	public void setIdServiceDeb(Long idServiceDeb) {
		this.idServiceDeb = idServiceDeb;
	}


	public double getMontant() {
		return montant;
	}


	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	
	
	

}
