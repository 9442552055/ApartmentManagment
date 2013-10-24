/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AMS.Entities;

import java.util.List;
import java.util.Set;

/**
 *
 * @author Mozhi
 */
//@Entity
public class Apartment extends IdBasedModel {

    private String name;
    private Address apartmentAddress;
    private Set<Unit> units;
    private Contact ownerContact;
    private long apartmentAddressId;
    private long ownerContactId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getApartmentAddress() {
        return apartmentAddress;
    }

    public void setApartmentAddress(Address apartmentAddress) {
        this.apartmentAddress = apartmentAddress;
    }

    public Set<Unit> getUnits() {
        return units;
    }

    public void setUnits(Set<Unit> Units) {
        this.units = Units;
    }

    public Contact getOwnerContact() {
        return ownerContact;
    }

    public void setOwnerContact(Contact ownerContact) {
        this.ownerContact = ownerContact;
    }

    public long getApartmentAddressId() {
        return apartmentAddressId;
    }

    public void setApartmentAddressId(long apartmentAddressId) {
        this.apartmentAddressId = apartmentAddressId;
    }

    public long getOwnerContactId() {
        return ownerContactId;
    }

    public void setOwnerContactId(long ownerContactId) {
        this.ownerContactId = ownerContactId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "AMS.Entities.Apartment[ id=" + ((getId() != null )? getId() : 0) + " ]";
    }
}
