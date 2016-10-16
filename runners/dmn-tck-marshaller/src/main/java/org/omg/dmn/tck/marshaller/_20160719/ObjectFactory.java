/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.26 at 06:59:21 PM BST 
//


package org.omg.dmn.tck.marshaller._20160719;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.omg.spec.dmn._20160719.testcase package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.omg.spec.dmn._20160719.testcase
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TestCases }
     * 
     */
    public TestCases createTestCases() {
        return new TestCases();
    }

    /**
     * Create an instance of {@link ValueType }
     * 
     */
    public ValueType createValueType() {
        return new ValueType();
    }

    /**
     * Create an instance of {@link TestCases.TestCase }
     * 
     */
    public TestCases.TestCase createTestCasesTestCase() {
        return new TestCases.TestCase();
    }

    /**
     * Create an instance of {@link TestCases.Labels }
     * 
     */
    public TestCases.Labels createTestCasesLabels() {
        return new TestCases.Labels();
    }

    /**
     * Create an instance of {@link ValueType.Component }
     * 
     */
    public ValueType.Component createValueTypeComponent() {
        return new ValueType.Component();
    }

    /**
     * Create an instance of {@link ValueType.List }
     * 
     */
    public ValueType.List createValueTypeList() {
        return new ValueType.List();
    }

    /**
     * Create an instance of {@link TestCases.TestCase.InputNode }
     * 
     */
    public TestCases.TestCase.InputNode createTestCasesTestCaseInputNode() {
        return new TestCases.TestCase.InputNode();
    }

    /**
     * Create an instance of {@link TestCases.TestCase.ResultNode }
     * 
     */
    public TestCases.TestCase.ResultNode createTestCasesTestCaseResultNode() {
        return new TestCases.TestCase.ResultNode();
    }

}
