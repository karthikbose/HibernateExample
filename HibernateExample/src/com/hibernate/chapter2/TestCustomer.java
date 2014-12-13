package com.hibernate.chapter2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestCustomer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(Customer.class);
		config.configure("myHibernateConfig.xml");
		
		new SchemaExport(config).create(true, true);
		
		SessionFactory factory = config.buildSessionFactory();
		Session sess = factory.getCurrentSession();
		
		sess.beginTransaction();
		
		Customer cus = new Customer();
		cus.setAddress("TR.Nagar");
		cus.setCity("Bangalore");
		cus.setCusName("Karthik");
		cus.setPhoneNo("99872");
		
		sess.save(cus);
		
		sess.getTransaction().commit();
		
	}

}
