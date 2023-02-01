package _classes;

//classe_admin_avec_password_par_defaut
public class Admin {
	private static String logindf="admin";
	private static String passdf="admin";
	
	
	public Admin(java.lang.String logindf, java.lang.String passdf) {
		Admin.logindf = logindf;
		Admin.passdf = passdf;
	}
	public static String getLogindf() {
		return logindf;
	}
	public void setLogindf(String logindf) {
		Admin.logindf = logindf;
	}
	public static String getPassdf() {
		return passdf;
	}
	public static void setPassdf(String passdf) {
		Admin.passdf = passdf;
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
