package com.javahash.hibernate;

import java.util.Date;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
public class Run {


  
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Session session = HibernateSessionManager.getSessionFactory().openSession();
		ApplicationContext appContext = 
		    	  new ClassPathXmlApplicationContext("config/BeanLocations.xml");
		SessionFactory sessionFactory=(SessionFactory)appContext.getBean("sessionFactory");
		  if(sessionFactory!=null){
			  System.out.println("Hiberante template is not null");
		  }else{
			  System.out.println("The hibernate tempalte is  null");
		  }
		//session.beginTransaction();
		Session	session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		User user = new User();
 
		user.setUsername("James5");
		user.setCreatedBy("Application");
		user.setCreatedDate(new Date());
		sessionFactory.getCurrentSession().save(user);
	
		session.save(user);
		session.getTransaction().commit();

	}
}
