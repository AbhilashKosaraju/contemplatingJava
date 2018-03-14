package org.abhi.jdbc.co;

import org.abhi.jdbc.dao.JdbcDAOImpl;
import org.abhi.jdbc.model.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcDemo {

	public static void main(String args[]) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		JdbcDAOImpl dao = ctx.getBean("jdbcDAOImpl",JdbcDAOImpl.class);  //passing inorder to avaoid casting
		
		Circle circle = dao.getCircle(1);
		System.out.println(circle.getName());
		
	}
}
