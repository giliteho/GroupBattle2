
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
 *         &lt;element name="GetListOfGlobalContestsResult" type="{http://tempuri.org/}ArrayOfContest" minOccurs="0"/>
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
    "getListOfGlobalContestsResult"
})
@XmlRootElement(name = "GetListOfGlobalContestsResponse")
public class GetListOfGlobalContestsResponse {

    @XmlElement(name = "GetListOfGlobalContestsResult")
    protected ArrayOfContest getListOfGlobalContestsResult;

    /**
     * Gets the value of the getListOfGlobalContestsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContest }
     *     
     */
    public ArrayOfContest getGetListOfGlobalContestsResult() {
        return getListOfGlobalContestsResult;
    }

    /**
     * Sets the value of the getListOfGlobalContestsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContest }
     *     
     */
    public void setGetListOfGlobalContestsResult(ArrayOfContest value) {
        this.getListOfGlobalContestsResult = value;
    }

}
