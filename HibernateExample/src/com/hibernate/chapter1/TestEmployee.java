package com.hibernate.chapter1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(Employee.class);
		config.configure("myHibernateConfig.xml");
		
		//new SchemaExport(config).create(true, true);
		
		SessionFactory factory = config.buildSessionFactory();
		Session sess = factory.getCurrentSession();
		
		sess.beginTransaction();
		
		{
			Employee emp = new Employee();
			emp.setEmpName("Karthik");
			emp.setAge(30);
			
			sess.save(emp);
		}

		{
			Employee emp = new Employee();
			emp.setEmpName("Deepak");
			emp.setAge(25);
			
			sess.save(emp);
		}

		{
			Employee emp = new Employee();
			emp.setEmpName("Paul");
			emp.setAge(45);
			
			sess.save(emp);
		}

		sess.getTransaction().commit();
		
	}
}
