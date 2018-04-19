package com.hibernate.chapter1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.hql.ast.util.SessionFactoryHelper;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class first {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	AnnotationConfiguration config = new AnnotationConfiguration();
	config.addAnnotatedClass(Salary.class);
	config.configure("hibernate.cfg.xml");
	//new SchemaExport(config).create(true, true);
    SessionFactory factory = config.buildSessionFactory();
    Session session =factory.getCurrentSession();
    session.beginTransaction();
    
    /*SessionFactory	sessionFactory = new  Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    Session session = sessionFactory.openSession();
    session.beginTransaction();
    */
     Salary salary = new Salary();
     salary.setId(1);
     salary.setName("uuuuu");
     salary.setAmount(16000);
    session.save(salary);
     
     session.getTransaction().commit();
	}

}
