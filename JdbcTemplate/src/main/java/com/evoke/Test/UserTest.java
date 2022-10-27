package com.evoke.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.evoke.Dao.UserDao;
import com.evoke.model.UserDemo;

public class UserTest {

	public static void main(String[] args) {  
	    ApplicationContext ctx=new ClassPathXmlApplicationContext("com/evoke/Test/ApplicationContext.xml");  
	      
		
		  UserDao dao=(UserDao)ctx.getBean("udao",UserDao.class); 
			/*
			 * int status=dao.saveUser(new UserDemo(234,"Sri",47));
			 * System.out.println(status);
			 */
			 
	          
			
			  int status1=dao.updateUser(new UserDemo(103,"Srinidhi",40));
			  System.out.println(status1);
			 
	          
			/*
			 * UserDemo e = new UserDemo(); e.setId(102); int status = dao.deleteUser(e);
			 * System.out.println(status);
			 */

		  }
		 
}  


