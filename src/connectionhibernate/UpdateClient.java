package connectionhibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateClient {
	
	// --------------------------------------------------------------------------------------------------------------- Update 1
	/*
	public static void main(String[] args) {
		
		// create session factory
		SessionFactory myFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Client.class).buildSessionFactory();
		
		// create session
		Session mySession = myFactory.openSession();
		
		try {
			
			// client to update
			int clientId = 9;
			
			// start a transaction
			mySession.beginTransaction();
			
			// create a client object to modifier
			Client clientU = mySession.get(Client.class, clientId);
			
			// Change field :)
			clientU.setNombre("Steve");
			
			// commit transaction
			mySession.getTransaction().commit();
			
			System.out.println("Registration correctly updated in the DB");
						
			mySession.close();
			
		} finally {
			
			myFactory.close();
			
		}
	}
	
	*/
	
	// --------------------------------------------------------------------------------------------------------------- Update 2
	
	/*
	public static void main(String[] args) {
		
		// create session factory
		SessionFactory myFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Client.class).buildSessionFactory();
		
		// create session
		Session mySession = myFactory.openSession();
		
		try {
			
			// start a transaction
			mySession.beginTransaction();
			
			// 
			mySession.createQuery("update Client set Apellidos='Winchester' where Apellidos LIKE 'H%'").executeUpdate();
			
			// commit transaction
			mySession.getTransaction().commit();
			
			System.out.println("Registration correctly updated in the DB");
						
			mySession.close();
			
		} finally {
			
			myFactory.close();
			
		}
	}

	*/
	
	// --------------------------------------------------------------------------------------------------------------- Delete 2
	
	/*
	public static void main(String[] args) {
		
		// create session factory
		SessionFactory myFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Client.class).buildSessionFactory();
		
		// create session
		Session mySession = myFactory.openSession();
		
		try {
			
			// start a transaction
			mySession.beginTransaction();
			
			// 
			mySession.createQuery("delete Client where Id='10'").executeUpdate();
			
			// commit transaction
			mySession.getTransaction().commit();
			
			System.out.println("Registration correctly deleted in the DB");
						
			mySession.close();
			
		} finally {
			
			myFactory.close();
			
		}
	}
	

	*/
	
	// --------------------------------------------------------------------------------------------------------------- Delete 1
	
	public static void main(String[] args) {
		
		// create session factory
		SessionFactory myFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Client.class).buildSessionFactory();
		
		// create session
		Session mySession = myFactory.openSession();
		
		try {
			
			// client to update
			int clientId = 1;
			
			// start a transaction
			mySession.beginTransaction();
			
			// create a client object to modifier
			Client clientU = mySession.get(Client.class, clientId);
			
			// Change field :)
			mySession.delete(clientU);
			
			// commit transaction
			mySession.getTransaction().commit();
			
			System.out.println("Registration correctly deleted in the DB - F2");
						
			mySession.close();
			
		} finally {
			
			myFactory.close();
			
		}
	}
	
}
