/*L
 * Copyright HealthCare IT, Inc.
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/edct-common/LICENSE.txt for details.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.17 at 03:35:20 PM EDT 
//


package com.healthcit.cacure.metadata.module;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SkipRuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SkipRuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="question_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="logicalOp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="row_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="form_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rule">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="show"/>
 *             &lt;enumeration value="hide"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SkipRuleType", propOrder = {
    "value"
})
public class SkipRuleType {

    @XmlElement(required = true)
    protected List<String> value;
    @XmlAttribute(name = "question_id")
    protected String questionId;
    @XmlAttribute
    protected String logicalOp;
    @XmlAttribute(name = "row_id")
    protected String rowId;
    @XmlAttribute(name = "form_id")
    protected String formId;
    @XmlAttribute
    protected String rule;

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValue() {
        if (value == null) {
            value = new ArrayList<String>();
        }
        return this.value;
    }

    /**
     * Gets the value of the questionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionId() {
        return questionId;
    }

    /**
     * Sets the value of the questionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionId(String value) {
        this.questionId = value;
    }

    /**
     * Gets the value of the logicalOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalOp() {
        return logicalOp;
    }

    /**
     * Sets the value of the logicalOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicalOp(String value) {
        this.logicalOp = value;
    }

    /**
     * Gets the value of the rowId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowId() {
        return rowId;
    }

    /**
     * Sets the value of the rowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowId(String value) {
        this.rowId = value;
    }

    /**
     * Gets the value of the formId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormId() {
        return formId;
    }

    /**
     * Sets the value of the formId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormId(String value) {
        this.formId = value;
    }

    /**
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRule(String value) {
        this.rule = value;
    }

}
