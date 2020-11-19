package connectionhibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryClients {
	
	public static void main(String[] args) {
		
		// create session factory
		SessionFactory myFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Client.class).buildSessionFactory();
				
		// create session
		Session mySession = myFactory.openSession();
/*			
		try {
			
			// start a transaction
			mySession.beginTransaction();
			
						
			// --------------------------------------------------------------------------------------------------------------------------------------------------- query all 
			List<Client> allClients = mySession.createQuery("from Client").getResultList();
			
			// show clients
			for(Client aClient:allClients) {
				System.out.println(aClient);
			}
			
			// ------------------------------------------------------------------------------------------------------------------------------------------------ query: Strange
			allClients = mySession.createQuery("from Client cl where cl.apellidos='Strange'").getResultList();
			
			// show Strange
			for(Client aClient:allClients) {
				System.out.println(aClient);
			}
			
			// ---------------------------------------------------------------------------------------------------------------------------------- query: Av. Deshojo Tree / Heek
			allClients = mySession.createQuery("from Client cl where cl.direccion='Av. Deshojo Tree, Somewhere City'" + "or cl.apellidos='Heek'").getResultList();
			
			// show direccion / apellido
			for(Client aClient:allClients) {
				System.out.println(aClient);
			}
			
			
			mySession.getTransaction().commit();
			
			mySession.close();
			
		} finally {
			
			myFactory.close();
			
		}
		
*/
		try {
			
			// start a transaction
			mySession.beginTransaction();
			
						
			// --------------------------------------------------------------------------------------------------------------------------------------------------- query all 
			List<Client> allClients = mySession.createQuery("from Client").getResultList();
			
			// show clients
			queryClientsIterator(allClients);
			
			// ------------------------------------------------------------------------------------------------------------------------------------------------ query: Strange
			allClients = mySession.createQuery("from Client cl where cl.apellidos='Strange'").getResultList();
			
			queryClientsIterator(allClients);
			
			// ---------------------------------------------------------------------------------------------------------------------------------- query: Av. Deshojo Tree / Heek
			allClients = mySession.createQuery("from Client cl where cl.direccion='Av. Deshojo Tree, Somewhere City'" + "or cl.apellidos='Heek'").getResultList();
			
			queryClientsIterator(allClients);
			
			
			mySession.getTransaction().commit();
			
			mySession.close();
			
		} finally {
			
			myFactory.close();
			
		}
    
	}

	private static void queryClientsIterator(List<Client> allClients) {
		for(Client aClient:allClients) {
			System.out.println(aClient);
		}
	}
	
}
