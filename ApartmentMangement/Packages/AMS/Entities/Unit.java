/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AMS.Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Mozhi
 */
@Entity
public class Unit extends IdBasedModel {

    
    private String name;
    private boolean occupyable;
    private boolean isOccupied;
    private Apartment apartment;

    public boolean isOccupyable() {
        return occupyable;
    }

    public void setOccupyable(boolean occupyable) {
        this.occupyable = occupyable;
    }

    public boolean isIsOccupied() {
        return isOccupied;
    }

    public void setIsOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

   @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "AMS.Entities.Unit[ id=" + ((getId() != null )? getId() : 0) + " ]";
    }
    
}
