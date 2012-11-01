
package org.tempuri;

import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
import org.jinouts.xml.bind.annotation.XmlElement;
import org.jinouts.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContestUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContestUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BattleXmlNode">
 *       &lt;sequence>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ContestId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ContestItemId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateJoined" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LastPlayed" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ContestCreditPoints" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="User" type="{http://tempuri.org/}User" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContestUser", propOrder = {
    "userId",
    "contestId",
    "contestItemId",
    "dateJoined",
    "lastPlayed",
    "contestCreditPoints",
    "user"
})
public class ContestUser
    extends BattleXmlNode
{

    @XmlElement(name = "UserId")
    protected int userId;
    @XmlElement(name = "ContestId")
    protected int contestId;
    @XmlElement(name = "ContestItemId")
    protected int contestItemId;
    @XmlElement(name = "DateJoined")
    protected long dateJoined;
    @XmlElement(name = "LastPlayed")
    protected long lastPlayed;
    @XmlElement(name = "ContestCreditPoints")
    protected int contestCreditPoints;
    @XmlElement(name = "User")
    protected User user;

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
     * Gets the value of the contestItemId property.
     * 
     */
    public int getContestItemId() {
        return contestItemId;
    }

    /**
     * Sets the value of the contestItemId property.
     * 
     */
    public void setContestItemId(int value) {
        this.contestItemId = value;
    }

    /**
     * Gets the value of the dateJoined property.
     * 
     */
    public long getDateJoined() {
        return dateJoined;
    }

    /**
     * Sets the value of the dateJoined property.
     * 
     */
    public void setDateJoined(long value) {
        this.dateJoined = value;
    }

    /**
     * Gets the value of the lastPlayed property.
     * 
     */
    public long getLastPlayed() {
        return lastPlayed;
    }

    /**
     * Sets the value of the lastPlayed property.
     * 
     */
    public void setLastPlayed(long value) {
        this.lastPlayed = value;
    }

    /**
     * Gets the value of the contestCreditPoints property.
     * 
     */
    public int getContestCreditPoints() {
        return contestCreditPoints;
    }

    /**
     * Sets the value of the contestCreditPoints property.
     * 
     */
    public void setContestCreditPoints(int value) {
        this.contestCreditPoints = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

}
