
package org.tempuri;

import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
import org.jinouts.xml.bind.annotation.XmlElement;
import org.jinouts.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Contest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BattleXmlNode">
 *       &lt;sequence>
 *         &lt;element name="ContestId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TopicId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Participants" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="UserItemId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Items" type="{http://tempuri.org/}ArrayOfContestItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contest", propOrder = {
    "contestId",
    "topicId",
    "name",
    "participants",
    "startTime",
    "endTime",
    "userItemId",
    "items"
})
public class Contest
    extends BattleXmlNode
{

    @XmlElement(name = "ContestId")
    protected int contestId;
    @XmlElement(name = "TopicId")
    protected int topicId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Participants")
    protected int participants;
    @XmlElement(name = "StartTime")
    protected long startTime;
    @XmlElement(name = "EndTime")
    protected long endTime;
    @XmlElement(name = "UserItemId")
    protected int userItemId;
    @XmlElement(name = "Items")
    protected ArrayOfContestItem items;

    /**
     * Gets the value of the contestId property.
     * 
     */
    public int getContestId() {
        return contestId;
    }

    /**
     * Sets the value of the contestId property.
     * 
     */
    public void setContestId(int value) {
        this.contestId = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the participants property.
     * 
     */
    public int getParticipants() {
        return participants;
    }

    /**
     * Sets the value of the participants property.
     * 
     */
    public void setParticipants(int value) {
        this.participants = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     */
    public long getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     */
    public void setStartTime(long value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     */
    public long getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     */
    public void setEndTime(long value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the userItemId property.
     * 
     */
    public int getUserItemId() {
        return userItemId;
    }

    /**
     * Sets the value of the userItemId property.
     * 
     */
    public void setUserItemId(int value) {
        this.userItemId = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContestItem }
     *     
     */
    public ArrayOfContestItem getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContestItem }
     *     
     */
    public void setItems(ArrayOfContestItem value) {
        this.items = value;
    }

}
