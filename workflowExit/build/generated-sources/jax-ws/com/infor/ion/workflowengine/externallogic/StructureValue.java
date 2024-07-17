
package com.infor.ion.workflowengine.externallogic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for structureValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="structureValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.infor.com/ion/workflowengine/externallogic}variable"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="content" type="{http://www.infor.com/ion/workflowengine/externallogic}structureElement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "structureValue", propOrder = {
    "content"
})
public class StructureValue
    extends Variable
{

    @XmlElement(nillable = true)
    protected List<StructureElement> content;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructureElement }
     * 
     * 
     */
    public List<StructureElement> getContent() {
        if (content == null) {
            content = new ArrayList<StructureElement>();
        }
        return this.content;
    }

}
