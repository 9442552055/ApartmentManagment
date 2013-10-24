/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AMS.DB;

import AMS.Entities.*;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;


import java.util.Set;
import org.hibernate.SessionFactory;

import java.util.Date;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;



/**
 *
 * @author Mozhi
 */
public class DBInitializer {

    private static SessionFactory factory;
    private static RepositoryBase repository;

    public static void main(String args[]) throws ClassNotFoundException, SQLException {

        factory = DBRepository.getFactory();
        repository = DBRepository.getRepositoryBase(factory);

//        Address address = new Address();
//        address.setAddressLine1("1/16 SOUTH STREET,");
//        address.setAddressLine2("THIRUNAGESWARAM, KUMBAKONAM T.K");
//        address.setZipCode(612204);
//        address.setStateName("Tamilnadu");
//        address.setCountry("India");
//
//        List addresses = repository.GetEntityList("Address");
//        for (Iterator iterator =
//                addresses.iterator(); iterator.hasNext();) {
//            Address addressDeletion = (Address) iterator.next();
//            repository.deleteEntity(addressDeletion.getId(), Address.class);
//        }
//        long addressId = repository.addEntity(address);
//        address.setId(addressId);
//
//        Contact contact = new Contact();
//        contact.setName("ARUNMOZHI SRINIVASAN");
//        contact.setPrimaryMobileNo("919442552055");
//        contact.setAlternativeMobileNo("919894363523");
//        contact.setPrimaryMailId("arunmozhi@live.in");
//        contact.setAlternativeMailId("sririshi.5@gmail.com");
//        contact.setCurrentAddress(address);
//
//        List contacts = repository.GetEntityList("Contact");
//        for (Iterator iterator =
//                contacts.iterator(); iterator.hasNext();) {
//            Contact contactDeletion = (Contact) iterator.next();
//            repository.deleteEntity(contactDeletion.getId(), Contact.class);
//        }
//        repository.addEntity(contact);
//
//        Apartment apartment = new Apartment();
//        apartment.setApartmentAddress(address);
//        apartment.setName("RWD Palm");
//        apartment.setOwnerContact(contact);
//
//        List apartments = repository.GetEntityList("Apartment");
//        for (Iterator iterator =
//                apartments.iterator(); iterator.hasNext();) {
//            Apartment apartmentDeletion = (Apartment) iterator.next();
//            repository.deleteEntity(apartmentDeletion.getId(), Apartment.class);
//        }
//        repository.addEntity(apartment);
//
//        long unitId = 1;
//        Unit unit = new Unit();
//        unit.setId(unitId);
//        unit.setName("63A");
//        unit.setIsOccupied(true);
//        unit.setOccupyable(true);
//        unit.setApartment(apartment);
//
//
//        List units = repository.GetEntityList("Unit");
//        for (Iterator iterator =
//                units.iterator(); iterator.hasNext();) {
//            Unit unitDeletion = (Unit) iterator.next();
//            repository.deleteEntity(unitDeletion.getId(), Unit.class);
//        }
//        repository.addEntity(unit);


//        List apartments1 = repository.GetEntityList("Apartment Ap fetch all properties");
//        for (Iterator iterator =
//                apartments1.iterator(); iterator.hasNext();) {
//            Apartment apartmentDeletion = (Apartment) iterator.next();
//           // Contact contact=apartmentDeletion.getOwnerContact();
//            // System.out.print("Contact: " + contact.getName());
//             Set<Unit> units = apartmentDeletion.getUnits();
//             for(Iterator unitObj=units.iterator();unitObj.hasNext();){
//                  System.out.print("Unit: " +((Unit) unitObj).getName());
//             }
//        }

         Session session = factory.openSession();
        Transaction tx = null;
        List entities = null;
        try {
            tx = session.beginTransaction();
            entities = session.createQuery("FROM Apartment").list();
            for (Iterator iterator =
                    entities.iterator(); iterator.hasNext();) {
               Apartment apartment = (Apartment) iterator.next();
               Contact contact=apartment.getOwnerContact();
               System.out.print("Contact: " + contact.getName());
               Set<Unit> units = apartment.getUnits();
               for(Iterator unitObj=units.iterator();unitObj.hasNext();){
                System.out.print("Unit: " +((Unit) unitObj.next()).getName());
               }
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


//        Set<Unit> unitsSet=new HashSet<Unit>();
//        unitsSet.add(unit);
//        apartment.setUnits(unitsSet);
    }
}
