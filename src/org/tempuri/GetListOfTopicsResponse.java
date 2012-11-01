
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
 *         &lt;element name="GetListOfTopicsResult" type="{http://tempuri.org/}ArrayOfTopic" minOccurs="0"/>
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
    "getListOfTopicsResult"
})
@XmlRootElement(name = "GetListOfTopicsResponse")
public class GetListOfTopicsResponse {

    @XmlElement(name = "GetListOfTopicsResult")
    protected ArrayOfTopic getListOfTopicsResult;

    /**
     * Gets the value of the getListOfTopicsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTopic }
     *     
     */
    public ArrayOfTopic getGetListOfTopicsResult() {
        return getListOfTopicsResult;
    }

    /**
     * Sets the value of the getListOfTopicsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTopic }
     *     
     */
    public void setGetListOfTopicsResult(ArrayOfTopic value) {
        this.getListOfTopicsResult = value;
    }

}
