package com.hibernate.chapter4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestAccounts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(Accounts.class);
		config.configure();
		
		new SchemaExport(config).create(true, true);
		
		SessionFactory fa = config.buildSessionFactory();
		Session ses = fa.getCurrentSession();
		ses.beginTransaction();
		
		AccountsPK pk = new AccountsPK();
		pk.setAccId(100);
		pk.setUserId(1001);
		Accounts accounts = new Accounts();
		accounts.setAccountsPK(pk);
		accounts.setBalance(1000);
		
		ses.save(accounts);
		
		ses.getTransaction().commit();
		
	}

}
