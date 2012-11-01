
package org.tempuri;

import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="contestItem1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contestItem2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contestItem3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="topicId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="durationInHours" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "userId",
    "contestItem1",
    "contestItem2",
    "contestItem3",
    "topicId",
    "durationInHours"
})
@XmlRootElement(name = "AddNewContest")
public class AddNewContest {

    protected int userId;
    protected String contestItem1;
    protected String contestItem2;
    protected String contestItem3;
    protected int topicId;
    protected int durationInHours;

    /**
     * Gets the value of the userId property.
     * 
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(int value) {
        this.userId = value;
    }

    /**
     * Gets the value of the contestItem1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContestItem1() {
        return contestItem1;
    }

    /**
     * Sets the value of the contestItem1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContestItem1(String value) {
        this.contestItem1 = value;
    }

    /**
     * Gets the value of the contestItem2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContestItem2() {
        return contestItem2;
    }

    /**
     * Sets the value of the contestItem2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContestItem2(String value) {
        this.contestItem2 = value;
    }

    /**
     * Gets the value of the contestItem3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContestItem3() {
        return contestItem3;
    }

    /**
     * Sets the value of the contestItem3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContestItem3(String value) {
        this.contestItem3 = value;
    }

    /**
     * Gets the value of the topicId property.
     * 
     */
    public int getTopicId() {
        return topicId;
    }

    /**
     * Sets the value of the topicId property.
     * 
     */
    public void setTopicId(int value) {
        this.topicId = value;
    }

    /**
     * Gets the value of the durationInHours property.
     * 
     */
    public int getDurationInHours() {
        return durationInHours;
    }

    /**
     * Sets the value of the durationInHours property.
     * 
     */
    public void setDurationInHours(int value) {
        this.durationInHours = value;
    }

}
