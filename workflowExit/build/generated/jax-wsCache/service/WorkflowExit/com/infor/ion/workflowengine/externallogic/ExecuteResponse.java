
package com.infor.ion.workflowengine.externallogic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for executeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OutputVariables" type="{http://www.infor.com/ion/workflowengine/externallogic}variable" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executeResponse", propOrder = {
    "outputVariables"
})
public class ExecuteResponse {

    @XmlElement(name = "OutputVariables")
    protected List<Variable> outputVariables;

    /**
     * Gets the value of the outputVariables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputVariables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputVariables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Variable }
     * 
     * 
     */
    public List<Variable> getOutputVariables() {
        if (outputVariables == null) {
            outputVariables = new ArrayList<Variable>();
        }
        return this.outputVariables;
    }

}
