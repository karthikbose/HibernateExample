package com.hibernate.chapter5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestInheritance {

	public static void main(String[] arg) {
		
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(Employee.class);
		config.addAnnotatedClass(RegularEmployee.class);
		config.addAnnotatedClass(ContractEmployee.class);
		
		config.configure();
		
		new SchemaExport(config).create(true, true);
		
		
		SessionFactory factory = config.buildSessionFactory();
		Session ses = factory.getCurrentSession();
		
		ses.beginTransaction();
		
		Employee emp = new Employee();
		emp.setEmpName("Karthik");
		
		RegularEmployee rEmp = new RegularEmployee();
		rEmp.setEmpName("Deepak");
		rEmp.setPfAccNo(9862646);
		rEmp.setSalary(50000);

		ContractEmployee cEmp = new ContractEmployee();
		cEmp.setEmpName("Suman");
		cEmp.setContactPeriod(5);
		cEmp.setCostPerHour(100);
		
		ses.save(emp);
		ses.save(rEmp);
		ses.save(cEmp);
		
		ses.getTransaction().commit();

	}
}
