package SR;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//import jakarta.ws.rs.core.MediaType;
//import jakarta.ws.rs.core.Response;

import Data.Database;
import _classes.Responsable;

public class serviceRespo {
	
	private static Map<Long, Responsable> responsable = Database.getResponsable();

	public serviceRespo() {
	
	}
	
	public ArrayList<Responsable> verifrespo(){
		return new ArrayList<Responsable>(responsable.values());
	}
	
	public static List<Responsable> getResponsables(){
		return new ArrayList<Responsable>(responsable.values());
	}
	
	public static Responsable getRespo(long id) {
		return responsable.get(id);
	}
	
	public static  Responsable addResponsable(Responsable R){
        R.setId(responsable.size()+1);
	        responsable.put(R.getId(),R); 
	        return R;
	}
	
	public static Responsable updateRespo(Responsable R) {
		if(R.getId() <= 0) {
			return null;
		}
		responsable.put(R.getId(),R);
		System.out.println("Updated");
		return R;
		
	}
	
	public static Responsable supRespo(long id) {
		System.out.println("removed");
		return responsable.remove(id);
	}
	
	
	

}
