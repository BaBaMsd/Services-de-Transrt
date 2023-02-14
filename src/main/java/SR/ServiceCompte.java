package SR;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Controller.RespoController;
import _classes.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.ws.rs.core.Context;
import Data.*;

public class ServiceCompte {
	

	private static Map<Long, Compte> compte = Database.getCompte();
	private static Map<Long, Transfer> mem = Database.getMemoireT();

	public ServiceCompte() {

	}
	
	


	public static ArrayList<Compte> ListComptes(){
		return new ArrayList<Compte>(compte.values());
	}
	
	public static Compte getCompte(long id) {
		return compte.get(id);
	}

	public static Compte addCompte(Compte c) {
		c.setId(compte.size() + 1);
		c.setBalance(0);
		c.setClient(servicesClients.getClient(c.getClient().getId()));
		c.setService(Servces_SrTransf.getSR(c.getService().getId()));	
		compte.put(c.getId(), c);
		return c;
	}

	public static Compte updateCompte(Compte c) {
		if (c.getId() <= 0) {
			return null;
		}
		c.setClient(servicesClients.getClient(c.getClient().getId()));
		c.setService(Servces_SrTransf.getSR(c.getService().getId()));
		compte.put(c.getId(), c);
		System.out.println("Updated");
		return c;
	}

	public static Compte deleteCompte(long id) {
		System.out.println("removed");
		return compte.remove(id);
	}
	

	public static String verser(long id, double montant){
		Compte c = compte.get(id);
		c.setBalance(c.getBalance()+montant);
		return c.getClient().getLogin()  + " a debuter son compte avec un montant de " + montant;
		
	}

	public static String retrait(long id, double montant){
		Compte c = compte.get(id);
		c.setBalance(c.getBalance() - montant);
		return c.getClient().getLogin() + " a retrait "+ montant +" son compte avec un montant de " + montant;
		
	}
	
	public static String transfert(long id_debiteur, long id_crediteur, double montant){
		Compte debit =compte.get(id_debiteur);
		Compte credit = compte.get(id_crediteur);
		
		if(credit.getBalance()< montant){
			return "le montant que vous voulez transferer est superieur au solde";
		}
		
		Transfer t = new Transfer();
		
		t.setId(mem.size() + 1);
		t.setIdCred(id_crediteur);
		t.setIdDeb(id_debiteur);
		t.setIdServiceDeb(Servces_SrTransf.getSR(debit.getService().getId()).getId());
		t.setMontant(montant);
		
		mem.put(t.getId(), t);
		debit.setBalance(debit.getBalance() + montant);
		credit.setBalance(credit.getBalance() - montant);
		return credit.getClient().getNom() + "a transferer" + montant + "de son Compte" + credit.getId() + "vers" + debit.getId();
	}
	
	public static ArrayList<Transfer> ListTr(){
		return new ArrayList<Transfer>(mem.values());
	}
	

	
	public static String anullé(long id) {
		Transfer tr = mem.get(id);
		Compte debit =compte.get(tr.getIdDeb());
		Compte credit = compte.get(tr.getIdCred());
		
		debit.setBalance(debit.getBalance() - tr.getMontant());
		credit.setBalance(credit.getBalance() + tr.getMontant());
		
		mem.remove(id);
		
		return "L'operation a bien Anullé";
		
	}
		
	}
	

