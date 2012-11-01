
package org.tempuri;

import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
import org.jinouts.xml.bind.annotation.XmlElement;
import org.jinouts.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Answer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Answer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BattleXmlNode">
 *       &lt;sequence>
 *         &lt;element name="QuestionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AnswerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AnswerText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsCorrect" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Answer", propOrder = {
    "questionId",
    "answerId",
    "answerText",
    "isCorrect"
})
public class Answer
    extends BattleXmlNode
{

    @XmlElement(name = "QuestionId")
    protected int questionId;
    @XmlElement(name = "AnswerId")
    protected int answerId;
    @XmlElement(name = "AnswerText")
    protected String answerText;
    @XmlElement(name = "IsCorrect")
    protected boolean isCorrect;

    /**
     * Gets the value of the questionId property.
     * 
     */
    public int getQuestionId() {
        return questionId;
    }

    /**
     * Sets the value of the questionId property.
     * 
     */
    public void setQuestionId(int value) {
        this.questionId = value;
    }

    /**
     * Gets the value of the answerId property.
     * 
     */
    public int getAnswerId() {
        return answerId;
    }

    /**
     * Sets the value of the answerId property.
     * 
     */
    public void setAnswerId(int value) {
        this.answerId = value;
    }

    /**
     * Gets the value of the answerText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerText() {
        return answerText;
    }

    /**
     * Sets the value of the answerText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerText(String value) {
        this.answerText = value;
    }

    /**
     * Gets the value of the isCorrect property.
     * 
     */
    public boolean isIsCorrect() {
        return isCorrect;
    }

    /**
     * Sets the value of the isCorrect property.
     * 
     */
    public void setIsCorrect(boolean value) {
        this.isCorrect = value;
    }

}
