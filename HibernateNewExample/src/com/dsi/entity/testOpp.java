package com.dsi.entity;

import com.hibernate.chapter1.*;
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

public class testOpp {
     
	/**
	 * @param args
	 */
	public static void main(String[] args) {
myClass myClass1 = new myClass();
myClass myClass2 = new myClass();
myClass1.setName("habib");
myClass2.setName("habib rahman");
       System.out.println("--------->from object 1:"+myClass1.getName());
       System.out.println("--------->from object 2:"+myClass2.getName());
myClass1.setName("this is new name");
System.out.println("--------->from object 1:"+myClass1.getName());
       System.out.println("--------->from object 2:"+myClass2.getName());

	}

}
