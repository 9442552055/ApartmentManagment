/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AMS.DB;

import AMS.Entities.IdBasedModel;
import java.util.Date;
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
public class RepositoryBase {

    SessionFactory factory = null;

    public RepositoryBase(SessionFactory sessionFactory) {
        factory = sessionFactory;
    }

    public List<IdBasedModel> GetEntityList(String EntityName) {
        Session session = factory.openSession();
        Transaction tx = null;
        List entities = null;
        try {
            tx = session.beginTransaction();
            entities = session.createQuery("FROM " + EntityName).list();
            for (Iterator iterator =
                    entities.iterator(); iterator.hasNext();) {
                IdBasedModel IdBasedModel = (IdBasedModel) iterator.next();
                System.out.print("Id: " + IdBasedModel.getId());
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();

        } finally {
            session.close();
            return entities;
        }
    }

    public IdBasedModel getEntity(Long Id, Class entityClass) {
        Session session = factory.openSession();
        Transaction tx = null;
        IdBasedModel entity = null;
        try {
            tx = session.beginTransaction();
            entity = (IdBasedModel) session.get(entityClass, Id);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
            return entity;
        }
    }

    public long addEntity(IdBasedModel entity) {
        Session session = factory.openSession();
        Transaction tx = null;
        long Id = 0;
        try {
            Date now = new Date();
            tx = session.beginTransaction();
            entity.setCreatedBy("RepBase");
            entity.setCreatedDate(now);
            entity.setModifiedBy("Creation");
            entity.setModifiedDate(now);
            Id = (Long) session.save(entity);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return Id;
    }

    public void updateEntity(IdBasedModel entity, Class entityClass) {
        Session session = factory.openSession();
        Transaction tx = null;
        Date now = new Date();
        try {
            tx = session.beginTransaction();
            IdBasedModel entityOld =
                    (IdBasedModel) session.get(entityClass, entity.getId());
            if (entityOld != null) {
                entity.setModifiedBy("RepoBase");
                entity.setModifiedDate(now);
                session.update(entity);
            } else {
                entity.setCreatedBy("RepBase");
                entity.setCreatedDate(now);
                entity.setModifiedBy("Creation");
                entity.setModifiedDate(now);
                entity.setId((Long) session.save(entity));
            }
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

    public void deleteEntity(Long UnitId, Class entityClass) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            IdBasedModel entity =
                    (IdBasedModel) session.get(entityClass, UnitId);
            session.delete(entity);
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
