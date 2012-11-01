
package org.tempuri;

import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
import org.jinouts.xml.bind.annotation.XmlSeeAlso;
import org.jinouts.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BattleXmlNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BattleXmlNode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BattleXmlNode")
@XmlSeeAlso({
    Contest.class,
    Question.class,
    User.class,
    Answer.class,
    ContestItem.class,
    Log.class,
    ContestUser.class,
    Topic.class
})
public abstract class BattleXmlNode {


}
