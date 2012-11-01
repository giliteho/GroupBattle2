
package org.tempuri;

import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
import org.jinouts.xml.bind.annotation.XmlElement;
import org.jinouts.xml.bind.annotation.XmlRootElement;
import org.jinouts.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetListOfUserContestsResult" type="{http://tempuri.org/}ArrayOfContest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getListOfUserContestsResult"
})
@XmlRootElement(name = "GetListOfUserContestsResponse")
public class GetListOfUserContestsResponse {

    @XmlElement(name = "GetListOfUserContestsResult")
    protected ArrayOfContest getListOfUserContestsResult;

    /**
     * Gets the value of the getListOfUserContestsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContest }
     *     
     */
    public ArrayOfContest getGetListOfUserContestsResult() {
        return getListOfUserContestsResult;
    }

    /**
     * Sets the value of the getListOfUserContestsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContest }
     *     
     */
    public void setGetListOfUserContestsResult(ArrayOfContest value) {
        this.getListOfUserContestsResult = value;
    }

}
