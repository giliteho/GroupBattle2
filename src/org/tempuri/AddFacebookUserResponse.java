
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
 *         &lt;element name="AddFacebookUserResult" type="{http://tempuri.org/}BasicResponse" minOccurs="0"/>
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
    "addFacebookUserResult"
})
@XmlRootElement(name = "AddFacebookUserResponse")
public class AddFacebookUserResponse {

    @XmlElement(name = "AddFacebookUserResult")
    protected BasicResponse addFacebookUserResult;

    /**
     * Gets the value of the addFacebookUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link BasicResponse }
     *     
     */
    public BasicResponse getAddFacebookUserResult() {
        return addFacebookUserResult;
    }

    /**
     * Sets the value of the addFacebookUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicResponse }
     *     
     */
    public void setAddFacebookUserResult(BasicResponse value) {
        this.addFacebookUserResult = value;
    }

}
