package com.hibernate.chapter3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestSchool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(School.class);
		config.configure();
		
		new SchemaExport(config).create(true, true);

		SessionFactory factory = config.buildSessionFactory();
		Session ses = factory.getCurrentSession();
		
		ses.beginTransaction();
		
		SchoolDetail sd = new SchoolDetail();
		sd.setAddress("DDD");
		sd.setCity("Chennai");
		
		School s = new School();
		s.setSchoolDetail(sd);
		s.setSchoolName("Poorvika");
		
		ses.save(s);
		
		ses.getTransaction().commit();
	}

}
