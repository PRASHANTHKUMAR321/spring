package com.nareshit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.nareshit.dao.StudentDao;
import com.nareshit.model.Student;

public class Test
{
	//ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		StudentDao dao=ctx.getBean("dao",StudentDao.class);
		Student st = new Student(142, "Murty-1", "Murty-2");	
		dao.saveStudent(st);
		System.out.println("Success!!");

	}

	
		
	}


