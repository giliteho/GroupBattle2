
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
 *         &lt;element name="RenewFacebookAccessTokenResult" type="{http://tempuri.org/}BasicResponse" minOccurs="0"/>
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
    "renewFacebookAccessTokenResult"
})
@XmlRootElement(name = "RenewFacebookAccessTokenResponse")
public class RenewFacebookAccessTokenResponse {

    @XmlElement(name = "RenewFacebookAccessTokenResult")
    protected BasicResponse renewFacebookAccessTokenResult;

    /**
     * Gets the value of the renewFacebookAccessTokenResult property.
     * 
     * @return
     *     possible object is
     *     {@link BasicResponse }
     *     
     */
    public BasicResponse getRenewFacebookAccessTokenResult() {
        return renewFacebookAccessTokenResult;
    }

    /**
     * Sets the value of the renewFacebookAccessTokenResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicResponse }
     *     
     */
    public void setRenewFacebookAccessTokenResult(BasicResponse value) {
        this.renewFacebookAccessTokenResult = value;
    }

}
