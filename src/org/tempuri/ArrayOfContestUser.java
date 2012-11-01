
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
import org.jinouts.xml.bind.annotation.XmlElement;
import org.jinouts.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfContestUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfContestUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContestUser" type="{http://tempuri.org/}ContestUser" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfContestUser", propOrder = {
    "contestUser"
})
public class ArrayOfContestUser {

    @XmlElement(name = "ContestUser", nillable = true)
    protected List<ContestUser> contestUser;

    /**
     * Gets the value of the contestUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contestUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContestUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContestUser }
     * 
     * 
     */
    public List<ContestUser> getContestUser() {
        if (contestUser == null) {
            contestUser = new ArrayList<ContestUser>();
        }
        return this.contestUser;
    }

}
