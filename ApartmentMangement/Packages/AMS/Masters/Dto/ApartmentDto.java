/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AMS.Masters.Dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mozhi
 */
@XmlRootElement
public class ApartmentDto extends MasterDto {

    private String apartmentName;

    public String getApartmentName() {
        return apartmentName;
    }

    public void setApartmentName(String value) {
        apartmentName = value;
    }
}
