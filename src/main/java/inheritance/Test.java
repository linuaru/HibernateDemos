package inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Configuration configuration = new Configuration().configure("/inheritance/hibernate.cfg.xml");
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction  tx = session.beginTransaction();
		
		Employee e1=new Employee(3,"pqr");  
	    
	      
		Regular_Emp e2=new Regular_Emp(1,"abc",5000,50);  
	     
	      
		Contract_Emp e3=new Contract_Emp(2,"xyz",500,3);  
	   
	  session.persist(e1);  
	    session.persist(e2);  
	    session.persist(e3);  
	      
	    tx.commit();  
	    session.close();  
	    System.out.println("success");  
	}

}
