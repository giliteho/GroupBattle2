
package org.tempuri;

import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
import org.jinouts.xml.bind.annotation.XmlElement;
import org.jinouts.xml.bind.annotation.XmlType;


/**
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BattleXmlNode">
 *       &lt;sequence>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserThumbnailPicture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LastLoginTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CreditPoints" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FacebookId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CultureInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccessLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AccessToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
    "userId",
    "displayName",
    "birthDate",
    "gender",
    "userThumbnailPicture",
    "registrationTime",
    "lastLoginTime",
    "creditPoints",
    "email",
    "facebookId",
    "cultureInfo",
    "accessLevel",
    "accessToken",
    "comment"
})
public class User
    extends BattleXmlNode
{

    @XmlElement(name = "UserId")
    protected int userId;
    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "BirthDate")
    protected long birthDate;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "UserThumbnailPicture")
    protected String userThumbnailPicture;
    @XmlElement(name = "RegistrationTime")
    protected long registrationTime;
    @XmlElement(name = "LastLoginTime")
    protected long lastLoginTime;
    @XmlElement(name = "CreditPoints")
    protected int creditPoints;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "FacebookId")
    protected String facebookId;
    @XmlElement(name = "CultureInfo")
    protected String cultureInfo;
    @XmlElement(name = "AccessLevel")
    protected int accessLevel;
    @XmlElement(name = "AccessToken")
    protected String accessToken;
    @XmlElement(name = "Comment")
    protected String comment;

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
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     */
    public long getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     */
    public void setBirthDate(long value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the userThumbnailPicture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserThumbnailPicture() {
        return userThumbnailPicture;
    }

    /**
     * Sets the value of the userThumbnailPicture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserThumbnailPicture(String value) {
        this.userThumbnailPicture = value;
    }

    /**
     * Gets the value of the registrationTime property.
     * 
     */
    public long getRegistrationTime() {
        return registrationTime;
    }

    /**
     * Sets the value of the registrationTime property.
     * 
     */
    public void setRegistrationTime(long value) {
        this.registrationTime = value;
    }

    /**
     * Gets the value of the lastLoginTime property.
     * 
     */
    public long getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * Sets the value of the lastLoginTime property.
     * 
     */
    public void setLastLoginTime(long value) {
        this.lastLoginTime = value;
    }

    /**
     * Gets the value of the creditPoints property.
     * 
     */
    public int getCreditPoints() {
        return creditPoints;
    }

    /**
     * Sets the value of the creditPoints property.
     * 
     */
    public void setCreditPoints(int value) {
        this.creditPoints = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the facebookId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacebookId() {
        return facebookId;
    }

    /**
     * Sets the value of the facebookId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacebookId(String value) {
        this.facebookId = value;
    }

    /**
     * Gets the value of the cultureInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCultureInfo() {
        return cultureInfo;
    }

    /**
     * Sets the value of the cultureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCultureInfo(String value) {
        this.cultureInfo = value;
    }

    /**
     * Gets the value of the accessLevel property.
     * 
     */
    public int getAccessLevel() {
        return accessLevel;
    }

    /**
     * Sets the value of the accessLevel property.
     * 
     */
    public void setAccessLevel(int value) {
        this.accessLevel = value;
    }

    /**
     * Gets the value of the accessToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Sets the value of the accessToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessToken(String value) {
        this.accessToken = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
