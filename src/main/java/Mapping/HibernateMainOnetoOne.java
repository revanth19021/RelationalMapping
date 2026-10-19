package Mapping;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMainOnetoOne {

	public static void main(String[] args) {
		  Configuration cfg = new Configuration()
	                .configure("hibernate.cfg.xml");

	        SessionFactory factory = cfg.buildSessionFactory();
	        Session session = factory.openSession();
	        Transaction tx = null;
	        try {
	        	tx=session.beginTransaction();
	        	Person p=new Person(2,"revanth");
	        	Passport pp=new Passport(102,"P1234");
	        	pp.setPerson(p);
	        	p.setPassport(pp);
	        	session.persist(p);
	        	session.persist(pp);
	        	tx.commit();
	        	System.out.println("Person and Passport inserted successfully");
	        }
	        catch(Exception e) {
	        	if(tx!=null && tx.isActive()) {
	        		tx.rollback();
	        	}
	        	e.printStackTrace();
	        }

	}

}
