/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AMS.Entities;

import javax.persistence.Entity;

/**
 *
 * @author Mozhi
 */
//@Entity
public class Address extends IdBasedModel{
    private String addressLine1;
    private String addressLine2;
    private long zipCode;
    private String stateName;
    private String country;

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

   @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "AMS.Entities.Address[ id=" + ((getId() != null )? getId() : 0) + " ]";
    }
}
