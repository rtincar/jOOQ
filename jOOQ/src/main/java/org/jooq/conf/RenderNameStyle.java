//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.29 at 08:45:52 PM MEZ 
//


package org.jooq.conf;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for RenderNameStyle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RenderNameStyle">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="QUOTED"/>
 *     &lt;enumeration value="AS_IS"/>
 *     &lt;enumeration value="LOWER"/>
 *     &lt;enumeration value="UPPER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum RenderNameStyle {

    QUOTED,
    AS_IS,
    LOWER,
    UPPER;

    public String value() {
        return name();
    }

    public static RenderNameStyle fromValue(String v) {
        return valueOf(v);
    }

}
