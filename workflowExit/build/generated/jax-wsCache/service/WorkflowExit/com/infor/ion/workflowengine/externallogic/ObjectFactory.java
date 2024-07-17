
package com.infor.ion.workflowengine.externallogic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.infor.ion.workflowengine.externallogic package. 
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

    private final static QName _BooleanValue_QNAME = new QName("http://www.infor.com/ion/workflowengine/externallogic", "booleanValue");
    private final static QName _DateTimeValue_QNAME = new QName("http://www.infor.com/ion/workflowengine/externallogic", "dateTimeValue");
    private final static QName _DateValue_QNAME = new QName("http://www.infor.com/ion/workflowengine/externallogic", "dateValue");
    private final static QName _DecimalValue_QNAME = new QName("http://www.infor.com/ion/workflowengine/externallogic", "decimalValue");
    private final static QName _Execute_QNAME = new QName("http://www.infor.com/ion/workflowengine/externallogic", "execute");
    private final static QName _ExecuteResponse_QNAME = new QName("http://www.infor.com/ion/workflowengine/externallogic", "executeResponse");
    private final static QName _IntegerValue_QNAME = new QName("http://www.infor.com/ion/workflowengine/externallogic", "integerValue");
    private final static QName _StringValue_QNAME = new QName("http://www.infor.com/ion/workflowengine/externallogic", "stringValue");
    private final static QName _StructureBooleanField_QNAME = new QName("http://www.infor.com/ion/workflowengine/externallogic", "structureBooleanField");
    private final static QName _StructureDateField_QNAME = new QName("http://www.infor.com/ion/workflowengine/externallogic", "structureDateField");
    private final static QName _StructureDateTimeField_QNAME = new QName("http://www.infor.com/ion/workflowengine/externallogic", "structureDateTimeField");
    private final static QName _StructureDecimalField_QNAME = new QName("http://www.infor.com/ion/workflowengine/externallogic", "structureDecimalField");
    private final static QName _StructureElement_QNAME = new QName("http://www.infor.com/ion/workflowengine/externallogic", "structureElement");
    private final static QName _StructureIntegerField_QNAME = new QName("http://www.infor.com/ion/workflowengine/externallogic", "structureIntegerField");
    private final static QName _StructureLevel_QNAME = new QName("http://www.infor.com/ion/workflowengine/externallogic", "structureLevel");
    private final static QName _StructureStringField_QNAME = new QName("http://www.infor.com/ion/workflowengine/externallogic", "structureStringField");
    private final static QName _StructureValue_QNAME = new QName("http://www.infor.com/ion/workflowengine/externallogic", "structureValue");
    private final static QName _Variable_QNAME = new QName("http://www.infor.com/ion/workflowengine/externallogic", "variable");
    private final static QName _WorkflowInfo_QNAME = new QName("http://www.infor.com/ion/workflowengine/externallogic", "workflowInfo");
    private final static QName _ExternalLogicFault_QNAME = new QName("http://www.infor.com/ion/workflowengine/externallogic", "ExternalLogicFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.infor.ion.workflowengine.externallogic
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BooleanValue }
     * 
     */
    public BooleanValue createBooleanValue() {
        return new BooleanValue();
    }

    /**
     * Create an instance of {@link DateTimeValue }
     * 
     */
    public DateTimeValue createDateTimeValue() {
        return new DateTimeValue();
    }

    /**
     * Create an instance of {@link DateValue }
     * 
     */
    public DateValue createDateValue() {
        return new DateValue();
    }

    /**
     * Create an instance of {@link DecimalValue }
     * 
     */
    public DecimalValue createDecimalValue() {
        return new DecimalValue();
    }

    /**
     * Create an instance of {@link Execute }
     * 
     */
    public Execute createExecute() {
        return new Execute();
    }

    /**
     * Create an instance of {@link ExecuteResponse }
     * 
     */
    public ExecuteResponse createExecuteResponse() {
        return new ExecuteResponse();
    }

    /**
     * Create an instance of {@link IntegerValue }
     * 
     */
    public IntegerValue createIntegerValue() {
        return new IntegerValue();
    }

    /**
     * Create an instance of {@link StringValue }
     * 
     */
    public StringValue createStringValue() {
        return new StringValue();
    }

    /**
     * Create an instance of {@link StructureBooleanField }
     * 
     */
    public StructureBooleanField createStructureBooleanField() {
        return new StructureBooleanField();
    }

    /**
     * Create an instance of {@link StructureDateField }
     * 
     */
    public StructureDateField createStructureDateField() {
        return new StructureDateField();
    }

    /**
     * Create an instance of {@link StructureDateTimeField }
     * 
     */
    public StructureDateTimeField createStructureDateTimeField() {
        return new StructureDateTimeField();
    }

    /**
     * Create an instance of {@link StructureDecimalField }
     * 
     */
    public StructureDecimalField createStructureDecimalField() {
        return new StructureDecimalField();
    }

    /**
     * Create an instance of {@link StructureElement }
     * 
     */
    public StructureElement createStructureElement() {
        return new StructureElement();
    }

    /**
     * Create an instance of {@link StructureIntegerField }
     * 
     */
    public StructureIntegerField createStructureIntegerField() {
        return new StructureIntegerField();
    }

    /**
     * Create an instance of {@link StructureLevel }
     * 
     */
    public StructureLevel createStructureLevel() {
        return new StructureLevel();
    }

    /**
     * Create an instance of {@link StructureStringField }
     * 
     */
    public StructureStringField createStructureStringField() {
        return new StructureStringField();
    }

    /**
     * Create an instance of {@link StructureValue }
     * 
     */
    public StructureValue createStructureValue() {
        return new StructureValue();
    }

    /**
     * Create an instance of {@link WorkflowInfo }
     * 
     */
    public WorkflowInfo createWorkflowInfo() {
        return new WorkflowInfo();
    }

    /**
     * Create an instance of {@link ExternalLogicFault }
     * 
     */
    public ExternalLogicFault createExternalLogicFault() {
        return new ExternalLogicFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BooleanValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.infor.com/ion/workflowengine/externallogic", name = "booleanValue")
    public JAXBElement<BooleanValue> createBooleanValue(BooleanValue value) {
        return new JAXBElement<BooleanValue>(_BooleanValue_QNAME, BooleanValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DateTimeValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.infor.com/ion/workflowengine/externallogic", name = "dateTimeValue")
    public JAXBElement<DateTimeValue> createDateTimeValue(DateTimeValue value) {
        return new JAXBElement<DateTimeValue>(_DateTimeValue_QNAME, DateTimeValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DateValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.infor.com/ion/workflowengine/externallogic", name = "dateValue")
    public JAXBElement<DateValue> createDateValue(DateValue value) {
        return new JAXBElement<DateValue>(_DateValue_QNAME, DateValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecimalValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DecimalValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.infor.com/ion/workflowengine/externallogic", name = "decimalValue")
    public JAXBElement<DecimalValue> createDecimalValue(DecimalValue value) {
        return new JAXBElement<DecimalValue>(_DecimalValue_QNAME, DecimalValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Execute }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Execute }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.infor.com/ion/workflowengine/externallogic", name = "execute")
    public JAXBElement<Execute> createExecute(Execute value) {
        return new JAXBElement<Execute>(_Execute_QNAME, Execute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExecuteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.infor.com/ion/workflowengine/externallogic", name = "executeResponse")
    public JAXBElement<ExecuteResponse> createExecuteResponse(ExecuteResponse value) {
        return new JAXBElement<ExecuteResponse>(_ExecuteResponse_QNAME, ExecuteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegerValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IntegerValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.infor.com/ion/workflowengine/externallogic", name = "integerValue")
    public JAXBElement<IntegerValue> createIntegerValue(IntegerValue value) {
        return new JAXBElement<IntegerValue>(_IntegerValue_QNAME, IntegerValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.infor.com/ion/workflowengine/externallogic", name = "stringValue")
    public JAXBElement<StringValue> createStringValue(StringValue value) {
        return new JAXBElement<StringValue>(_StringValue_QNAME, StringValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructureBooleanField }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StructureBooleanField }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.infor.com/ion/workflowengine/externallogic", name = "structureBooleanField")
    public JAXBElement<StructureBooleanField> createStructureBooleanField(StructureBooleanField value) {
        return new JAXBElement<StructureBooleanField>(_StructureBooleanField_QNAME, StructureBooleanField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructureDateField }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StructureDateField }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.infor.com/ion/workflowengine/externallogic", name = "structureDateField")
    public JAXBElement<StructureDateField> createStructureDateField(StructureDateField value) {
        return new JAXBElement<StructureDateField>(_StructureDateField_QNAME, StructureDateField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructureDateTimeField }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StructureDateTimeField }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.infor.com/ion/workflowengine/externallogic", name = "structureDateTimeField")
    public JAXBElement<StructureDateTimeField> createStructureDateTimeField(StructureDateTimeField value) {
        return new JAXBElement<StructureDateTimeField>(_StructureDateTimeField_QNAME, StructureDateTimeField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructureDecimalField }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StructureDecimalField }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.infor.com/ion/workflowengine/externallogic", name = "structureDecimalField")
    public JAXBElement<StructureDecimalField> createStructureDecimalField(StructureDecimalField value) {
        return new JAXBElement<StructureDecimalField>(_StructureDecimalField_QNAME, StructureDecimalField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructureElement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StructureElement }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.infor.com/ion/workflowengine/externallogic", name = "structureElement")
    public JAXBElement<StructureElement> createStructureElement(StructureElement value) {
        return new JAXBElement<StructureElement>(_StructureElement_QNAME, StructureElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructureIntegerField }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StructureIntegerField }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.infor.com/ion/workflowengine/externallogic", name = "structureIntegerField")
    public JAXBElement<StructureIntegerField> createStructureIntegerField(StructureIntegerField value) {
        return new JAXBElement<StructureIntegerField>(_StructureIntegerField_QNAME, StructureIntegerField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructureLevel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StructureLevel }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.infor.com/ion/workflowengine/externallogic", name = "structureLevel")
    public JAXBElement<StructureLevel> createStructureLevel(StructureLevel value) {
        return new JAXBElement<StructureLevel>(_StructureLevel_QNAME, StructureLevel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructureStringField }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StructureStringField }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.infor.com/ion/workflowengine/externallogic", name = "structureStringField")
    public JAXBElement<StructureStringField> createStructureStringField(StructureStringField value) {
        return new JAXBElement<StructureStringField>(_StructureStringField_QNAME, StructureStringField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructureValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StructureValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.infor.com/ion/workflowengine/externallogic", name = "structureValue")
    public JAXBElement<StructureValue> createStructureValue(StructureValue value) {
        return new JAXBElement<StructureValue>(_StructureValue_QNAME, StructureValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Variable }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Variable }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.infor.com/ion/workflowengine/externallogic", name = "variable")
    public JAXBElement<Variable> createVariable(Variable value) {
        return new JAXBElement<Variable>(_Variable_QNAME, Variable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkflowInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkflowInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.infor.com/ion/workflowengine/externallogic", name = "workflowInfo")
    public JAXBElement<WorkflowInfo> createWorkflowInfo(WorkflowInfo value) {
        return new JAXBElement<WorkflowInfo>(_WorkflowInfo_QNAME, WorkflowInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalLogicFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExternalLogicFault }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.infor.com/ion/workflowengine/externallogic", name = "ExternalLogicFault")
    public JAXBElement<ExternalLogicFault> createExternalLogicFault(ExternalLogicFault value) {
        return new JAXBElement<ExternalLogicFault>(_ExternalLogicFault_QNAME, ExternalLogicFault.class, null, value);
    }

}
