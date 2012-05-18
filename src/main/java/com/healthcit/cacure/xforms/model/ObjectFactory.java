//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.19 at 12:09:44 PM EDT 
//


package com.healthcit.cacure.xforms.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.healthcit.cacure.xforms.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Form_QNAME = new QName("http://www.healthcit.com/FormDataModel", "form");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.healthcit.cacure.xforms.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Row }
     * 
     */
    public Row createRow() {
        return new Row();
    }

    /**
     * Create an instance of {@link Form }
     * 
     */
    public Form createForm() {
        return new Form();
    }

    /**
     * Create an instance of {@link Column }
     * 
     */
    public Column createColumn() {
        return new Column();
    }

    /**
     * Create an instance of {@link ComplexAnswer }
     * 
     */
    public ComplexAnswer createComplexAnswer() {
        return new ComplexAnswer();
    }

    /**
     * Create an instance of {@link QuestionTable }
     * 
     */
    public QuestionTable createQuestionTable() {
        return new QuestionTable();
    }

    /**
     * Create an instance of {@link ComplexTable }
     * 
     */
    public ComplexTable createComplexTable() {
        return new ComplexTable();
    }

    /**
     * Create an instance of {@link Question }
     * 
     */
    public Question createQuestion() {
        return new Question();
    }

    /**
     * Create an instance of {@link Answer }
     * 
     */
    public Answer createAnswer() {
        return new Answer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Form }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.healthcit.com/FormDataModel", name = "form")
    public JAXBElement<Form> createForm(Form value) {
        return new JAXBElement<Form>(_Form_QNAME, Form.class, null, value);
    }

}
