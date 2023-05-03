package com.empmng;



import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
public class App 
{
    public static void main( String[] args )
    {
    	
    	//to create data 
    	
    	
//        employee e1=new employee();
//        e1.setEmpId(103);
//        e1.setEmpName("teju");
//        e1.setEmpProject("c");
//        e1.setEmpLocation("pak");

       // System.out.println(e1.getEmpId());
        //to store above values in db
        Configuration con=new Configuration().configure().addAnnotatedClass(employee.class);
        SessionFactory sf=con.buildSessionFactory();
        Session ses=sf.openSession();
        
        Transaction tx=ses.beginTransaction();
//        ses.save(e1);
//        
        employee e2=new employee();
        
        //to read data through primary key
        
       // employee e5
//       e2 =ses.get(employee.class,101);//retrived data from db and stored in e1
//        System.out.println(e2);
        
        
        //to read data through non primary key
//        String loc="pak";
//        e2=(employee) ses.createQuery("from employee where empLocation=:location").setParameter("location",loc).uniqueResult();
//        System.out.println(e2);
//        
        
        //to read all employers details from employee table 
//        Query qu=ses.createQuery("from employee");
//        List<employee> li=qu.list();
//        for(employee e:li)
//        {
//        	System.out.println(e.getEmpId() +":"+e.getEmpName());
//        }
        
        //to update data
//        String add="pune";
//        int idd=101;
//        Query qu=ses.createQuery("update employee set empLocation=:loc where empId=:id").setParameter("loc",add).setParameter("id",idd);
//        int status=qu.executeUpdate();
//        System.out.println(status);
        
        //to delete
        Query qu=ses.createQuery("delete employee where empId=:id").setParameter("id",103);
        System.out.println(qu.executeUpdate());
        
        tx.commit();
        
        
//     System.out.println(e1.getEmpId());
        
    }
    
}
