
package org.tempuri;

import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
import org.jinouts.xml.bind.annotation.XmlElement;
import org.jinouts.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Question complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Question">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BattleXmlNode">
 *       &lt;sequence>
 *         &lt;element name="QuestionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QuestionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TopicId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CorrectAnswers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WrongAnswers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CorrectRatio" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="Answers" type="{http://tempuri.org/}ArrayOfAnswer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Question", propOrder = {
    "questionId",
    "questionText",
    "topicId",
    "correctAnswers",
    "wrongAnswers",
    "correctRatio",
    "answers"
})
public class Question
    extends BattleXmlNode
{

    @XmlElement(name = "QuestionId")
    protected int questionId;
    @XmlElement(name = "QuestionText")
    protected String questionText;
    @XmlElement(name = "TopicId")
    protected int topicId;
    @XmlElement(name = "CorrectAnswers")
    protected int correctAnswers;
    @XmlElement(name = "WrongAnswers")
    protected int wrongAnswers;
    @XmlElement(name = "CorrectRatio")
    protected float correctRatio;
    @XmlElement(name = "Answers")
    protected ArrayOfAnswer answers;

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
     * Gets the value of the questionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionText() {
        return questionText;
    }

    /**
     * Sets the value of the questionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionText(String value) {
        this.questionText = value;
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
     * Gets the value of the correctAnswers property.
     * 
     */
    public int getCorrectAnswers() {
        return correctAnswers;
    }

    /**
     * Sets the value of the correctAnswers property.
     * 
     */
    public void setCorrectAnswers(int value) {
        this.correctAnswers = value;
    }

    /**
     * Gets the value of the wrongAnswers property.
     * 
     */
    public int getWrongAnswers() {
        return wrongAnswers;
    }

    /**
     * Sets the value of the wrongAnswers property.
     * 
     */
    public void setWrongAnswers(int value) {
        this.wrongAnswers = value;
    }

    /**
     * Gets the value of the correctRatio property.
     * 
     */
    public float getCorrectRatio() {
        return correctRatio;
    }

    /**
     * Sets the value of the correctRatio property.
     * 
     */
    public void setCorrectRatio(float value) {
        this.correctRatio = value;
    }

    /**
     * Gets the value of the answers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAnswer }
     *     
     */
    public ArrayOfAnswer getAnswers() {
        return answers;
    }

    /**
     * Sets the value of the answers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnswer }
     *     
     */
    public void setAnswers(ArrayOfAnswer value) {
        this.answers = value;
    }

}
