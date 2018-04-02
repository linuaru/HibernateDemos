package com.scp.HibernateDemos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpHibDemos_Test {

	public static void main(String[] args) {
		
		EmpHibDemos e = new EmpHibDemos(1,"abc");
	
	 	
		Configuration configuration = new Configuration().configure("HibernateDemos.cfg.xml");
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction  tx = session.beginTransaction();
		
		session.save(e);
		tx.commit();
	
		session.flush();
	}
	
}
