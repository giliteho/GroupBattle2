
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
 *         &lt;element name="GetContestInfoResult" type="{http://tempuri.org/}Contest" minOccurs="0"/>
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
    "getContestInfoResult"
})
@XmlRootElement(name = "GetContestInfoResponse")
public class GetContestInfoResponse {

    @XmlElement(name = "GetContestInfoResult")
    protected Contest getContestInfoResult;

    /**
     * Gets the value of the getContestInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link Contest }
     *     
     */
    public Contest getGetContestInfoResult() {
        return getContestInfoResult;
    }

    /**
     * Sets the value of the getContestInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contest }
     *     
     */
    public void setGetContestInfoResult(Contest value) {
        this.getContestInfoResult = value;
    }

}
