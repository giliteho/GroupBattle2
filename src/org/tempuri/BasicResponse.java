
package org.tempuri;

import org.jinouts.xml.bind.annotation.XmlAccessType;
import org.jinouts.xml.bind.annotation.XmlAccessorType;
import org.jinouts.xml.bind.annotation.XmlElement;
import org.jinouts.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasicResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Param" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ErrorCode" type="{http://tempuri.org/}ErrorCodes"/>
 *         &lt;element name="ErrorCodeAsInt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicResponse", propOrder = {
    "param",
    "errorCode",
    "errorCodeAsInt"
})
public class BasicResponse {

    @XmlElement(name = "Param")
    protected int param;
    @XmlElement(name = "ErrorCode", required = true)
    protected ErrorCodes errorCode;
    @XmlElement(name = "ErrorCodeAsInt")
    protected int errorCodeAsInt;

    /**
     * Gets the value of the param property.
     * 
     */
    public int getParam() {
        return param;
    }

    /**
     * Sets the value of the param property.
     * 
     */
    public void setParam(int value) {
        this.param = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorCodes }
     *     
     */
    public ErrorCodes getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorCodes }
     *     
     */
    public void setErrorCode(ErrorCodes value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorCodeAsInt property.
     * 
     */
    public int getErrorCodeAsInt() {
        return errorCodeAsInt;
    }

    /**
     * Sets the value of the errorCodeAsInt property.
     * 
     */
    public void setErrorCodeAsInt(int value) {
        this.errorCodeAsInt = value;
    }

}
