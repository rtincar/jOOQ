//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.29 at 10:08:11 PM MEZ 
//


package org.jooq.util.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Some configuration for the source code generator
 * 				(jooq-codegen)
 * 			
 * 
 * <p>Java class for Generate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Generate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="relations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="deprecated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="instanceFields" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="unsignedTypes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="generatedAnnotation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Generate", propOrder = {

})
public class Generate {

    @XmlElement(defaultValue = "false")
    protected Boolean relations;
    @XmlElement(defaultValue = "true")
    protected Boolean deprecated;
    @XmlElement(defaultValue = "true")
    protected Boolean instanceFields;
    @XmlElement(defaultValue = "true")
    protected Boolean unsignedTypes;
    @XmlElement(defaultValue = "true")
    protected Boolean generatedAnnotation;

    /**
     * Gets the value of the relations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRelations() {
        return relations;
    }

    /**
     * Sets the value of the relations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelations(Boolean value) {
        this.relations = value;
    }

    /**
     * Gets the value of the deprecated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeprecated() {
        return deprecated;
    }

    /**
     * Sets the value of the deprecated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeprecated(Boolean value) {
        this.deprecated = value;
    }

    /**
     * Gets the value of the instanceFields property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstanceFields() {
        return instanceFields;
    }

    /**
     * Sets the value of the instanceFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstanceFields(Boolean value) {
        this.instanceFields = value;
    }

    /**
     * Gets the value of the unsignedTypes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnsignedTypes() {
        return unsignedTypes;
    }

    /**
     * Sets the value of the unsignedTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnsignedTypes(Boolean value) {
        this.unsignedTypes = value;
    }

    /**
     * Gets the value of the generatedAnnotation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeneratedAnnotation() {
        return generatedAnnotation;
    }

    /**
     * Sets the value of the generatedAnnotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeneratedAnnotation(Boolean value) {
        this.generatedAnnotation = value;
    }

}
