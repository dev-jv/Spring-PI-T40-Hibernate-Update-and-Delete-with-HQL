package connectionhibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SaveClient {
	
	public static void main(String[] args) {
		
		// create session factory
		SessionFactory myFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Client.class).buildSessionFactory();
		
		// create session
		Session mySession = myFactory.openSession();
		
		try {
			
			// create a client object
//			Client client1 = new Client("Samuel", "Sloan", "Av. Kaede Tree, Somewhere City");
//			Client client1 = new Client("Sara", "Houss", "Av. Deshojo Tree, Somewhere City");
//			Client client1 = new Client("Esteban", "Heek", "Av. Three Trees, Somewhere City");
			Client client1 = new Client("Steven", "Strange", "Av. Juniper Trees, Somewhere City");
			
			// start a transaction
			mySession.beginTransaction();
			
			// save the object
			mySession.save(client1);
			
			// commit transaction
			mySession.getTransaction().commit();
			
			System.out.println("Registration correctly inserted in the DB");
			
			
			// Read register
			
			mySession.beginTransaction();
			
			System.out.println("Reading the record with Id : " + client1.getId());
			
			Client clientX = mySession.get(Client.class, client1.getId());
			
			System.out.println("Register: " + clientX);
			
			mySession.getTransaction().commit();
			
			System.out.println("Terminated!");
			
			mySession.close();
			
		} finally {
			
			myFactory.close();
			
		}
	}
}
