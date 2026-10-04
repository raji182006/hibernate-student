package com.example1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.entity.Student;

public class App {

	public static void main(String[] args) {

	    SessionFactory factory =
	            new Configuration()
	            .configure("hibernate.cfg.xml")
	            .buildSessionFactory();

	    Session session = factory.openSession();

	    session.beginTransaction();

	    Student student = session.get(Student.class, 1);

	    student.setCourse("Computer Science");

	    session.getTransaction().commit();

	    System.out.println("Student updated successfully!");

	    session.close();
	    factory.close();
	}
}