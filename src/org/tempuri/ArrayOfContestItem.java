
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
import org.jinouts.xml.bind.annotation.XmlElement;
import org.jinouts.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfContestItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfContestItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContestItem" type="{http://tempuri.org/}ContestItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfContestItem", propOrder = {
    "contestItem"
})
public class ArrayOfContestItem {

    @XmlElement(name = "ContestItem", nillable = true)
    protected List<ContestItem> contestItem;

    /**
     * Gets the value of the contestItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contestItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContestItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContestItem }
     * 
     * 
     */
    public List<ContestItem> getContestItem() {
        if (contestItem == null) {
            contestItem = new ArrayList<ContestItem>();
        }
        return this.contestItem;
    }

}
