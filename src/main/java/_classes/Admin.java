package _classes;


public class Admin {
	private String logindf="admin";
	private String passdf="admin";
	
	
	public Admin(java.lang.String logindf, java.lang.String passdf) {
		super();
		this.logindf = logindf;
		this.passdf = passdf;
	}
	public String getLogindf() {
		return logindf;
	}
	public void setLogindf(String logindf) {
		this.logindf = logindf;
	}
	public String getPassdf() {
		return passdf;
	}
	public void setPassdf(String passdf) {
		this.passdf = passdf;
	}
	
	public boolean verifierAdmin(String login, String password) {

		  if(login.equals(logindf) &&  password.equals(passdf)) {
			  return true;
		  } 
		  else {
			  return false;
		  }
	}
	public Admin() {
		
	}
	

}
