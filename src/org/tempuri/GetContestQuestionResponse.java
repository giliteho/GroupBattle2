
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
 *         &lt;element name="GetContestQuestionResult" type="{http://tempuri.org/}Question" minOccurs="0"/>
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
    "getContestQuestionResult"
})
@XmlRootElement(name = "GetContestQuestionResponse")
public class GetContestQuestionResponse {

    @XmlElement(name = "GetContestQuestionResult")
    protected Question getContestQuestionResult;

    /**
     * Gets the value of the getContestQuestionResult property.
     * 
     * @return
     *     possible object is
     *     {@link Question }
     *     
     */
    public Question getGetContestQuestionResult() {
        return getContestQuestionResult;
    }

    /**
     * Sets the value of the getContestQuestionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Question }
     *     
     */
    public void setGetContestQuestionResult(Question value) {
        this.getContestQuestionResult = value;
    }

}
