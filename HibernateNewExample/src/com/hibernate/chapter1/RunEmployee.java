package com.hibernate.chapter1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
import com.hibernate.chapter1.Salary;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate.HibernateTemplate;

public class RunEmployee {
     
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(employee.class);
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
    //employee employee = new employee();
// employee employee = (employee)session.load(employee.class, 2);
// salary salary = (salary)session.load(salary.class, 4);
// employee.setSalary(salary);
//  employee.setName("sumonNW");
// employee.setRoll("987");
 //salary salary = session.load(salary,);
// salary salary = (salary)session.load(salary.class, 3);
 
 //employee.setSalary(salary);
//  session.update(employee);
//  session.getTransaction().commit();
  //System.out.println("object is==========="+salary.getAmount());
  
// config = new AnnotationConfiguration();
//	config.addAnnotatedClass(salary.class);
//	config.configure("hibernate.cfg.xml");
//  new SchemaExport(config).create(true, true);
//   factory = config.buildSessionFactory();
//   session =factory.getCurrentSession();
//  session.beginTransaction();
  
//  salary salary = new salary();
//  salary.setId(3);
//  salary.setName("HABIB");
//  salary.setAmount(40000);
//  session.save(salary);
 	    

       System.out.println("--------->OUTPUT:"+session.find("FROM salary WHERE id>1").size());


        session.getTransaction().commit();

	}

}
