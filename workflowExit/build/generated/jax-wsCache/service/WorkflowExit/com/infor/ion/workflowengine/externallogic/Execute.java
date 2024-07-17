
package com.infor.ion.workflowengine.externallogic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for execute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="execute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WorkflowInfo" type="{http://www.infor.com/ion/workflowengine/externallogic}workflowInfo" minOccurs="0"/&gt;
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InputVariables" type="{http://www.infor.com/ion/workflowengine/externallogic}variable" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "execute", propOrder = {
    "workflowInfo",
    "command",
    "inputVariables"
})
public class Execute {

    @XmlElement(name = "WorkflowInfo")
    protected WorkflowInfo workflowInfo;
    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InputVariables")
    protected List<Variable> inputVariables;

    /**
     * Gets the value of the workflowInfo property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowInfo }
     *     
     */
    public WorkflowInfo getWorkflowInfo() {
        return workflowInfo;
    }

    /**
     * Sets the value of the workflowInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowInfo }
     *     
     */
    public void setWorkflowInfo(WorkflowInfo value) {
        this.workflowInfo = value;
    }

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Gets the value of the inputVariables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputVariables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputVariables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Variable }
     * 
     * 
     */
    public List<Variable> getInputVariables() {
        if (inputVariables == null) {
            inputVariables = new ArrayList<Variable>();
        }
        return this.inputVariables;
    }

}
