package com.stumapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.*;
public class factory {

	public static void main(String[] args) {
		
		Configuration con=new Configuration().configure()
        		.addAnnotatedClass(worker.class).addAnnotatedClass(location.class);
        
        SessionFactory sf=con.buildSessionFactory();
        
        Session ses=sf.openSession();
        Transaction tx=ses.beginTransaction();
        
//        location l1=new location();
//        
//        l1.setLocationId(101);
//        l1.setLocationName("Pune");
//        l1.setLocationState("Maharastra");
//        
//        location l2=new location();
//        l2.setLocationId(102);
//        l2.setLocationName("Mumbai");
//        l2.setLocationState("Maharastra");
//	
//        
//        worker w1=new worker();
//        w1.setWorkerId(1);
//        w1.setWorkerName("Rupali");
//        w1.setWorkerField("Mobilizer");
//        w1.setLoc(l1);
//	
//        worker w2=new worker();
//        w2.setWorkerId(2);
//        w2.setWorkerName("sarath");
//        w2.setWorkerField("counsellor");
//        w2.setLoc(l1);
//        
//        worker w3=new worker();
//        w3.setWorkerName("Alex");
//        w3.setWorkerField("Accounts");
//        w3.setLoc(l2);
//        
//        ses.save(l1);
//        ses.save(l2);
//        ses.save(w1);
//        ses.save(w2);
//        ses.save(w3);
        
        Query qu=ses.createQuery("from worker");
        
        List<worker> workerlist=qu.getResultList();
        
        for(worker w:workerlist)
        System.out.println(w.getWorkerName()+" from "+w.getLoc().getLocationName());
        
        
        
        
        
        
        
        tx.commit();
        
        
        
        
	
	}

}
