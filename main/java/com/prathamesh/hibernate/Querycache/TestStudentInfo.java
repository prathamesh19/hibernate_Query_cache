package com.prathamesh.hibernate.Querycache;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestStudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1= new Student(101, "abc");
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session s1= sf.openSession();
		Transaction tr = s1.beginTransaction();

		Query query=s1.createQuery(" from Student st1 where st1.studRollNo=:studRollNo");     
		
        query.setCacheable(true);
        

	}

}

