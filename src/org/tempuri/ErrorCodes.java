
package org.tempuri;

import org.jinouts.xml.bind.annotation.XmlEnum;
import org.jinouts.xml.bind.annotation.XmlEnumValue;
import org.jinouts.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorCodes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorCodes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="NotExists"/>
 *     &lt;enumeration value="ContestWithSameNameExists"/>
 *     &lt;enumeration value="Exception"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ErrorCodes")
@XmlEnum
public enum ErrorCodes {

    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("NotExists")
    NOT_EXISTS("NotExists"),
    @XmlEnumValue("ContestWithSameNameExists")
    CONTEST_WITH_SAME_NAME_EXISTS("ContestWithSameNameExists"),
    @XmlEnumValue("Exception")
    EXCEPTION("Exception");
    private final String value;

    ErrorCodes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorCodes fromValue(String v) {
        for (ErrorCodes c: ErrorCodes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
