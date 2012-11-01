
package org.tempuri;

import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
import org.jinouts.xml.bind.annotation.XmlElement;
import org.jinouts.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContestItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContestItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BattleXmlNode">
 *       &lt;sequence>
 *         &lt;element name="ContestId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ItemId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditPoints" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContestItem", propOrder = {
    "contestId",
    "itemId",
    "name",
    "creditPoints"
})
public class ContestItem
    extends BattleXmlNode
{

    @XmlElement(name = "ContestId")
    protected int contestId;
    @XmlElement(name = "ItemId")
    protected int itemId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "CreditPoints")
    protected int creditPoints;

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
     * Gets the value of the itemId property.
     * 
     */
    public int getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     */
    public void setItemId(int value) {
        this.itemId = value;
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

}
