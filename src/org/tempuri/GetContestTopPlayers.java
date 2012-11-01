
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
 *         &lt;element name="contestId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="amountOfPlayers" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "contestId",
    "amountOfPlayers"
})
@XmlRootElement(name = "GetContestTopPlayers")
public class GetContestTopPlayers {

    protected int contestId;
    protected int amountOfPlayers;

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
     * Gets the value of the amountOfPlayers property.
     * 
     */
    public int getAmountOfPlayers() {
        return amountOfPlayers;
    }

    /**
     * Sets the value of the amountOfPlayers property.
     * 
     */
    public void setAmountOfPlayers(int value) {
        this.amountOfPlayers = value;
    }

}
