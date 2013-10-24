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
public class Contact extends IdBasedModel {
    private String name;
    private String primaryMobileNo;
    private String alternativeMobileNo;
    private String primaryMailId;
    private String alternativeMailId;
    private Address currentAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrimaryMobileNo() {
        return primaryMobileNo;
    }

    public void setPrimaryMobileNo(String primaryMobileNo) {
        this.primaryMobileNo = primaryMobileNo;
    }

    public String getAlternativeMobileNo() {
        return alternativeMobileNo;
    }

    public void setAlternativeMobileNo(String alternativeMobileNo) {
        this.alternativeMobileNo = alternativeMobileNo;
    }

    public String getPrimaryMailId() {
        return primaryMailId;
    }

    public void setPrimaryMailId(String primaryMailId) {
        this.primaryMailId = primaryMailId;
    }

    public String getAlternativeMailId() {
        return alternativeMailId;
    }

    public void setAlternativeMailId(String alternativeMailId) {
        this.alternativeMailId = alternativeMailId;
    }

    public Address getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    public Address getPermanantAddress() {
        return permanantAddress;
    }

    public void setPermanantAddress(Address permanantAddress) {
        this.permanantAddress = permanantAddress;
    }
    private Address permanantAddress;

  @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "AMS.Entities.Contact[ id=" + ((getId() != null )? getId() : 0) + " ]";
    }
}
