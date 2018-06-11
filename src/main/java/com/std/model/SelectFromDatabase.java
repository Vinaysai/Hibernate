package com.std.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectFromDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration con = new Configuration().configure("hibernate.cfg.xml");

		SessionFactory sf = con.buildSessionFactory();

		Session s = sf.openSession();

		Transaction t = s.beginTransaction();
		// Student sn = new Student();

		// Get Example
		Student se = (Student) s.get(Student.class, new Integer(2));
		System.out.println("Student get called");
		System.out.println("Student ID= " + se.getId());
		System.out.println("Student Get Details:: " + s + "\n");

		// load Example
		Student se1 = (Student) s.load(Student.class, new Integer(2));
		System.out.println("Student load called");
		System.out.println("Student ID= " + se1.getId());
		System.out.println("Student load Details:: " + se1 + "\n");

		// Close resources

		t.commit();
		s.close();

	}
}
