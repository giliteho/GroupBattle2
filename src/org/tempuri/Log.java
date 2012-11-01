
package org.tempuri;

import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
import org.jinouts.xml.bind.annotation.XmlElement;
import org.jinouts.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Log complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Log">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BattleXmlNode">
 *       &lt;sequence>
 *         &lt;element name="EventId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EventTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EventTimeAsString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventName" type="{http://tempuri.org/}EventLogNames"/>
 *         &lt;element name="EventData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://tempuri.org/}TimeSpan"/>
 *         &lt;element name="DurationInMilli" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Log", propOrder = {
    "eventId",
    "eventTime",
    "eventTimeAsString",
    "eventName",
    "eventData",
    "duration",
    "durationInMilli"
})
public class Log
    extends BattleXmlNode
{

    @XmlElement(name = "EventId")
    protected long eventId;
    @XmlElement(name = "EventTime")
    protected long eventTime;
    @XmlElement(name = "EventTimeAsString")
    protected String eventTimeAsString;
    @XmlElement(name = "EventName", required = true)
    protected EventLogNames eventName;
    @XmlElement(name = "EventData")
    protected String eventData;
    @XmlElement(name = "Duration", required = true)
    protected TimeSpan duration;
    @XmlElement(name = "DurationInMilli")
    protected double durationInMilli;

    /**
     * Gets the value of the eventId property.
     * 
     */
    public long getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     */
    public void setEventId(long value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the eventTime property.
     * 
     */
    public long getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     */
    public void setEventTime(long value) {
        this.eventTime = value;
    }

    /**
     * Gets the value of the eventTimeAsString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventTimeAsString() {
        return eventTimeAsString;
    }

    /**
     * Sets the value of the eventTimeAsString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventTimeAsString(String value) {
        this.eventTimeAsString = value;
    }

    /**
     * Gets the value of the eventName property.
     * 
     * @return
     *     possible object is
     *     {@link EventLogNames }
     *     
     */
    public EventLogNames getEventName() {
        return eventName;
    }

    /**
     * Sets the value of the eventName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventLogNames }
     *     
     */
    public void setEventName(EventLogNames value) {
        this.eventName = value;
    }

    /**
     * Gets the value of the eventData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventData() {
        return eventData;
    }

    /**
     * Sets the value of the eventData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventData(String value) {
        this.eventData = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpan }
     *     
     */
    public TimeSpan getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpan }
     *     
     */
    public void setDuration(TimeSpan value) {
        this.duration = value;
    }

    /**
     * Gets the value of the durationInMilli property.
     * 
     */
    public double getDurationInMilli() {
        return durationInMilli;
    }

    /**
     * Sets the value of the durationInMilli property.
     * 
     */
    public void setDurationInMilli(double value) {
        this.durationInMilli = value;
    }

}
