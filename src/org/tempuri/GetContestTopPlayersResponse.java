
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
 *         &lt;element name="GetContestTopPlayersResult" type="{http://tempuri.org/}ArrayOfContestUser" minOccurs="0"/>
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
    "getContestTopPlayersResult"
})
@XmlRootElement(name = "GetContestTopPlayersResponse")
public class GetContestTopPlayersResponse {

    @XmlElement(name = "GetContestTopPlayersResult")
    protected ArrayOfContestUser getContestTopPlayersResult;

    /**
     * Gets the value of the getContestTopPlayersResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContestUser }
     *     
     */
    public ArrayOfContestUser getGetContestTopPlayersResult() {
        return getContestTopPlayersResult;
    }

    /**
     * Sets the value of the getContestTopPlayersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContestUser }
     *     
     */
    public void setGetContestTopPlayersResult(ArrayOfContestUser value) {
        this.getContestTopPlayersResult = value;
    }

}
