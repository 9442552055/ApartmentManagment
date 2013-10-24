/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AMS.DB;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author arunmozhi
 */
public class DBRepository {

    public static RepositoryBase getRepositoryBase(SessionFactory factory) {
        if(repositoryBase == null)
        {
            if(factory==null)
                factory = getFactory();
            repositoryBase= new RepositoryBase(factory);
        }
        return repositoryBase;
    }

    public static SessionFactory getFactory() {
       try {
           if(factory==null)
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
       finally
       {
           return factory;
       }
    }


    private static RepositoryBase repositoryBase;
    private static SessionFactory factory;

    private DBRepository() {
    }
}
