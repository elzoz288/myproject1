package org.example;
import org.hibernate.Criteria;
import org.hibernate.QueryException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
    Userdetails userdetails =new Userdetails();
        Userdetails userdetails2 =new Userdetails();
    SessionFactory sessionFactory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    Session session1 = sessionFactory.openSession();
    session1.beginTransaction();
    Query q1=session1.createQuery("from Userdetails where userid=4");
  //  q1.setCacheable(true);
    userdetails= (Userdetails) q1.uniqueResult();
    session1.close();
    System.out.println(userdetails);

    /*  Session session2=sessionFactory.openSession();
    session2.beginTransaction();
    Query q2=session2.createQuery("from Userdetails where userid=4");
    q2.setCacheable(true);
    userdetails2= (Userdetails) q2.uniqueResult();
    session2.getTransaction().commit();
    session2.close();
    System.out.println(userdetails2);
*/
    }
}