
package com.infor.ion.workflowengine.externallogic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for workflowInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workflowInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="workflowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="workflowStepName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="workflowId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="stepId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="workflowMajorVersion" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="workflowMinorVersion" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workflowInfo", propOrder = {
    "workflowName",
    "workflowStepName",
    "workflowId",
    "stepId",
    "workflowMajorVersion",
    "workflowMinorVersion"
})
public class WorkflowInfo {

    protected String workflowName;
    protected String workflowStepName;
    protected long workflowId;
    protected long stepId;
    protected long workflowMajorVersion;
    protected long workflowMinorVersion;

    /**
     * Gets the value of the workflowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowName() {
        return workflowName;
    }

    /**
     * Sets the value of the workflowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowName(String value) {
        this.workflowName = value;
    }

    /**
     * Gets the value of the workflowStepName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowStepName() {
        return workflowStepName;
    }

    /**
     * Sets the value of the workflowStepName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowStepName(String value) {
        this.workflowStepName = value;
    }

    /**
     * Gets the value of the workflowId property.
     * 
     */
    public long getWorkflowId() {
        return workflowId;
    }

    /**
     * Sets the value of the workflowId property.
     * 
     */
    public void setWorkflowId(long value) {
        this.workflowId = value;
    }

    /**
     * Gets the value of the stepId property.
     * 
     */
    public long getStepId() {
        return stepId;
    }

    /**
     * Sets the value of the stepId property.
     * 
     */
    public void setStepId(long value) {
        this.stepId = value;
    }

    /**
     * Gets the value of the workflowMajorVersion property.
     * 
     */
    public long getWorkflowMajorVersion() {
        return workflowMajorVersion;
    }

    /**
     * Sets the value of the workflowMajorVersion property.
     * 
     */
    public void setWorkflowMajorVersion(long value) {
        this.workflowMajorVersion = value;
    }

    /**
     * Gets the value of the workflowMinorVersion property.
     * 
     */
    public long getWorkflowMinorVersion() {
        return workflowMinorVersion;
    }

    /**
     * Sets the value of the workflowMinorVersion property.
     * 
     */
    public void setWorkflowMinorVersion(long value) {
        this.workflowMinorVersion = value;
    }

}
