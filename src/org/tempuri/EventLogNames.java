
package org.tempuri;

import org.jinouts.xml.bind.annotation.XmlEnum;
import org.jinouts.xml.bind.annotation.XmlEnumValue;
import org.jinouts.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventLogNames.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventLogNames">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SqlNonQuery"/>
 *     &lt;enumeration value="SqlQuery"/>
 *     &lt;enumeration value="SqlTransactionStart"/>
 *     &lt;enumeration value="SqlTrasactionCommandAdded"/>
 *     &lt;enumeration value="SqlTransactionCommit"/>
 *     &lt;enumeration value="WebServiceStart"/>
 *     &lt;enumeration value="WebServiceEnd"/>
 *     &lt;enumeration value="FacebookQuery"/>
 *     &lt;enumeration value="Exception"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EventLogNames")
@XmlEnum
public enum EventLogNames {

    @XmlEnumValue("SqlNonQuery")
    SQL_NON_QUERY("SqlNonQuery"),
    @XmlEnumValue("SqlQuery")
    SQL_QUERY("SqlQuery"),
    @XmlEnumValue("SqlTransactionStart")
    SQL_TRANSACTION_START("SqlTransactionStart"),
    @XmlEnumValue("SqlTrasactionCommandAdded")
    SQL_TRASACTION_COMMAND_ADDED("SqlTrasactionCommandAdded"),
    @XmlEnumValue("SqlTransactionCommit")
    SQL_TRANSACTION_COMMIT("SqlTransactionCommit"),
    @XmlEnumValue("WebServiceStart")
    WEB_SERVICE_START("WebServiceStart"),
    @XmlEnumValue("WebServiceEnd")
    WEB_SERVICE_END("WebServiceEnd"),
    @XmlEnumValue("FacebookQuery")
    FACEBOOK_QUERY("FacebookQuery"),
    @XmlEnumValue("Exception")
    EXCEPTION("Exception");
    private final String value;

    EventLogNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventLogNames fromValue(String v) {
        for (EventLogNames c: EventLogNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
