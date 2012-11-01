
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
 *         &lt;element name="GetLogTableResult" type="{http://tempuri.org/}ArrayOfLog" minOccurs="0"/>
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
    "getLogTableResult"
})
@XmlRootElement(name = "GetLogTableResponse")
public class GetLogTableResponse {

    @XmlElement(name = "GetLogTableResult")
    protected ArrayOfLog getLogTableResult;

    /**
     * Gets the value of the getLogTableResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLog }
     *     
     */
    public ArrayOfLog getGetLogTableResult() {
        return getLogTableResult;
    }

    /**
     * Sets the value of the getLogTableResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLog }
     *     
     */
    public void setGetLogTableResult(ArrayOfLog value) {
        this.getLogTableResult = value;
    }

}
