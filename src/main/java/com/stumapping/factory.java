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
    
        location loc1=new location();
        loc1.setLocationId(103);
        loc1.setLocationName("Hyd");
        loc1.setLocationState("TS");
        
        location loc2=new location();
        loc2.setLocationId(104);
        loc2.setLocationName("Vizag");
        loc2.setLocationState("AP");
        
        
        worker w1=new worker();
        w1.setWorkerId(4);
        w1.setWorkerName("john");
        w1.setWorkerField("Networking");
        w1.setLoc(loc2);
        
        worker w2=new worker();
        w2.setWorkerId(5);
        w2.setWorkerName("Alexa");
        w2.setWorkerField("Data analysis");
        w2.setLoc(loc2);
        
        ses.save(loc2);
        ses.save(loc1);
        ses.save(w1);
               ses.save(w2);
               tx.commit();
        
        Query qu=ses.createQuery("from worker");
        
        List<worker> workerlist=qu.getResultList();
        
        for(worker w:workerlist)
        System.out.println(w.getWorkerName()+" from "+w.getLoc().getLocationName());
        
        
        
        
        
     
        
        
        
        
	
	}

}
