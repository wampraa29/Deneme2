package org.subhro.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OracleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Maven + Hibernate + Oracle");
		UserDetails usr = new UserDetails();
		usr.setUserId(3);
		usr.setUserName("deneme");
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(usr);
		session.getTransaction().commit();	}

}
