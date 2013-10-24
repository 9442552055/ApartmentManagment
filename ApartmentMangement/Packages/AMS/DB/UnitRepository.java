/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AMS.DB;

import AMS.Entities.Unit;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;

/**
 *
 * @author arunmozhi
 */
public class UnitRepository {

    public static long addUnit(Unit unit, SessionFactory factory) {
        Session session = factory.openSession();
        Transaction tx = null;
        long unitId = 0;
        try {
            tx = session.beginTransaction();
            unitId = (Long) session.save(unit);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return unitId;
    }

    /* Method to  READ all the units */
    public static List<Unit> listUnits(SessionFactory factory) {
        Session session = factory.openSession();
        Transaction tx = null;
        List units = null;
        try {
            tx = session.beginTransaction();
            units = session.createQuery("FROM Unit").list();
            for (Iterator iterator =
                    units.iterator(); iterator.hasNext();) {
                Unit unit = (Unit) iterator.next();
                System.out.print("Unit Name: " + unit.getName());
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();

        } finally {
            session.close();
            return units;
        }
    }

    /* Method to DELETE an employee from the records */
    public static void deleteUnit(Long UnitId, SessionFactory factory) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Unit unit =
                    (Unit) session.get(Unit.class, UnitId);
            session.delete(unit);
            System.out.print("Deleted Unit: " + unit.getName());
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
