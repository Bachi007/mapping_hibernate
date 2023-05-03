package com.stumapping;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
public class company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con=new Configuration().configure()
        		.addAnnotatedClass(employee.class).addAnnotatedClass(projects.class);
        
        SessionFactory sf=con.buildSessionFactory();
        
        Session ses=sf.openSession();
        Transaction tx=ses.beginTransaction();
        
//		projects p1=new projects();
//		p1.setProjectId(1);
//		p1.setProjectName("Java Banking project");
//		
//		projects p2=new projects();
//		p2.setProjectId(2);
//		p2.setProjectName("Angular payment project");
//		
//		projects p3=new projects();
//		p3.setProjectId(3);
//		p3.setProjectName("Nodejs project");
//		
//		List<projects> projectlist=new ArrayList<projects>();
//		
//		projectlist.add(p1);
//		projectlist.add(p2);
//		
//		List<projects> projectlist2=new ArrayList<projects>();
//		
//		projectlist2.add(p3);
//		
//		employee e1=new employee();
//		e1.setEmpId(101);
//		e1.setEmpName("Bhaskara");
//		e1.setEmpLocation("Hyd");
//		e1.setProject(projectlist);
//		
//		
//		employee e2=new employee();
//		e2.setEmpId(102);
//		e2.setEmpName("suresh");
//		e2.setEmpLocation("canada");
//		e2.setProject(projectlist2);
//		
//		ses.save(p1);
//		ses.save(p2);
//		ses.save(p3);
//		ses.save(e1);
//		ses.save(e2);
//		
        
        Query qu=ses.createQuery("from employee");
        
        //to get list of employees
        List<employee> emplist=qu.getResultList();
        
        for(employee emp:emplist)
        {
        	
        	//to get list of projects of a employee
        	List<projects> pp=emp.getProject();
        	for(projects p:pp)
        	System.out.println(emp.getEmpName()+" is working in "+p.getProjectName());
        	
        }
        
        
        tx.commit();
		
	}

}
