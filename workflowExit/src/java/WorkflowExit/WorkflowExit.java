/*
 ***************************************************************
 *						               *		      
 *                           NOTICE                            *
 *						               *
 *   THIS SOFTWARE IS THE PROPERTY OF AND CONTAINS             *
 *   CONFIDENTIAL INFORMATION OF INFOR AND/OR ITS AFFILIATES   *
 *   OR SUBSIDIARIES AND SHALL NOT BE DISCLOSED WITHOUT PRIOR  *
 *   WRITTEN PERMISSION. LICENSED CUSTOMERS MAY COPY AND       *
 *   ADAPT THIS SOFTWARE FOR THEIR OWN USE IN ACCORDANCE WITH  *
 *   THE TERMS OF THEIR SOFTWARE LICENSE AGREEMENT.            *
 *   ALL OTHER RIGHTS RESERVED.			               *
 *                                                             *
 *   (c) COPYRIGHT 2012 INFOR.  ALL RIGHTS RESERVED.           *
 *   THE WORD AND DESIGN MARKS SET FORTH HEREIN ARE            *
 *   TRADEMARKS AND/OR REGISTERED TRADEMARKS OF INFOR          *
 *   AND/OR ITS AFFILIATES AND SUBSIDIARIES. ALL RIGHTS        *
 *   RESERVED.  ALL OTHER TRADEMARKS LISTED HEREIN ARE         *
 *   THE PROPERTY OF THEIR RESPECTIVE OWNERS.                  *
 *						               *
 *************************************************************** 
 */
package WorkflowExit;

import com.infor.ion.workflowengine.externallogic.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.StringUtils;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;

/**
 * Example of a service implementation for an Infor ION workflow exit point.
 */
@WebService(serviceName = "ExternalLogicExecuter", portName = "ExternalLogicExecuterSoapBinding", endpointInterface = "com.infor.ion.workflowengine.externallogic.IExternalLogicService", targetNamespace = "http://www.infor.com/ion/workflowengine/externallogic", wsdlLocation = "WEB-INF/wsdl/WorkflowExit/WorkflowExit.wsdl")
public class WorkflowExit {

    private static final String CONCATENATE = "Concatenate";
    private static final String SPLIT = "Split";
    private static final String DESCRIPTION_FROM_TREE = "DescriptionFromTree";
    private static final String SHOW_NOTES = "ShowNotes";
    private static final String PurchaseWorkflowApprover = "PurchaseWorkflowApprover";

    public java.util.List<Variable> execute(WorkflowInfo workflowInfo, String command, List<Variable> inputVariables) throws ExternalLogicException {

        /*
         * The command can be used to implement multiple methods in a single service. 
         * Specify the value in the command property of the workflow exit step to 
         * execute a specific method.
         */
        if (command == null || command.isEmpty() || CONCATENATE.equalsIgnoreCase(command)) {
            return ConcatenateStrings(inputVariables);
        }
        if (PurchaseWorkflowApprover.equalsIgnoreCase(command)){
            return InvokePurchaseWorkflowApproverWS(inputVariables);
        }else {
            throw new RuntimeException("Unknown command '" + command + "'");
        }
        /*if (SPLIT.equalsIgnoreCase(command)) {
            return splitStrings(inputVariables);
        } else if (DESCRIPTION_FROM_TREE.equalsIgnoreCase(command)) {
            return getDescriptionFromTree(inputVariables);
        } else if (SHOW_NOTES.equalsIgnoreCase(command)) {
            return showNotes(inputVariables);
        } else {
            throw new RuntimeException("Unknown command '" + command + "'");
        }*/
        /*
         * If the web service implements only one method, you do not have to use a command and you can simply call the method to be executed. 
         * For example: 
         *              return ConcatenateStrings(inputVariables);
         */
    }

    /**
     * An example method that concatenates two strings.
     *
     * @param inputVariables The inputVariables from the workflow. The workflow
     * must contain two parameters of type String with the names “String1” and
     * “String2”
     * @return A list with variables are returned to the workflow. In this case,
     * the workflow must contain one output parameter of type String with the
     * name “ConcatenatedString”
     */
    private List<Variable> ConcatenateStrings(List<Variable> inputVariables) {
        java.util.List<com.infor.ion.workflowengine.externallogic.Variable> outputVariables = new ArrayList<com.infor.ion.workflowengine.externallogic.Variable>();
        try
        {
            String string1 = VariableHelper.getStringValue("String1", inputVariables);
            String string2 = VariableHelper.getStringValue("String2", inputVariables);  
            VariableHelper.setStringValue("ConcatenatedString", string1 + string2, outputVariables);
            VariableHelper.setStringValue("Error", "", outputVariables);
        }catch(Exception e){
            VariableHelper.setStringValue("ConcatenatedString", "", outputVariables);
            VariableHelper.setStringValue("Error", e.toString(), outputVariables);
        }
        
        return outputVariables;
    }
    
    
       private List<Variable> InvokePurchaseWorkflowApproverWS(List<Variable> inputVariables) {
        java.util.List<com.infor.ion.workflowengine.externallogic.Variable> outputVariables = new ArrayList<com.infor.ion.workflowengine.externallogic.Variable>();
        String approver = "";
        String order = ""; 
        String sequence = "";     
        try
        {
            approver = VariableHelper.getStringValue("Approver", inputVariables);
            order = VariableHelper.getStringValue("Order", inputVariables);
            sequence = VariableHelper.getStringValue("Sequence", inputVariables);
        }catch (Exception e)
        {
            VariableHelper.setStringValue("Response", "", outputVariables);
            VariableHelper.setStringValue("ResponseCode", "", outputVariables);
            VariableHelper.setStringValue("Error", e.toString(), outputVariables);
            return outputVariables;
        }
        
        String url = "http://ptmauidev:8312/c4ws/services/PurchaseWorkflowApprover/PTMALNDEV?wsdl";
        String domainToRemove = "@grupoeuronete.pt";
        approver = approver.replace(domainToRemove, "");
        String company = "200";
        String processingScope = "request";
        String orderStatus = "approved";
        String responseString = "";
        

        String Request = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:pur=\"http://www.infor.com/businessinterface/PurchaseWorkflowApprover\">\n" +
                     "   <soapenv:Header>\n" +
                     "      <pur:Activation>\n" +
                     "         <company>" + company + "</company>\n" +
                     "      </pur:Activation>\n" +
                     "   </soapenv:Header>\n" +
                     "   <soapenv:Body>\n" +
                     "      <pur:InserFromEP>\n" +
                     "         <InserFromEPRequest>\n" +
                     "            <ControlArea>\n" +
                     "               <processingScope>" + processingScope + "</processingScope>\n" +
                     "            </ControlArea>\n" +
                     "            <DataArea>\n" +
                     "               <PurchaseWorkflowApprover>\n" +
                     "                  <approver>" + approver + "</approver>\n" +
                     "                  <order>" + order + "</order>\n" +
                     "                  <orderStatus>" + orderStatus + "</orderStatus>\n" +
                     "                  <sequence>" + sequence + "</sequence>\n" +
                     "               </PurchaseWorkflowApprover>\n" +
                     "            </DataArea>\n" +
                     "         </InserFromEPRequest>\n" +
                     "      </pur:InserFromEP>\n" +
                     "   </soapenv:Body>\n" +
                     "</soapenv:Envelope>";
        String Response = "";
        String ResponseCode = "";
        
        
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "text/xml;charset=utf-8")
                .POST(BodyPublishers.ofString(Request))
                .build();
        try {
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            ResponseCode =  response.statusCode()+"";
            ResponseCode = response.body();
        } catch (Exception e) {
            //e.printStackTrace();
            VariableHelper.setStringValue("Response", "", outputVariables);
            VariableHelper.setStringValue("ResponseCode", "", outputVariables);
            VariableHelper.setStringValue("Error", e.toString(), outputVariables);
        }
        
        VariableHelper.setStringValue("Response", responseString, outputVariables);
        VariableHelper.setStringValue("ResponseCode", ResponseCode, outputVariables);
        VariableHelper.setStringValue("Error", "", outputVariables);
        return outputVariables;
    }
    

    /**
     * An example about using structures in a workflow
     *
     * @param inputVariables The inputVariables from the workflow. In this case,
     * the workflow must contain the following elements: - A workflow structure
     * that will be used to read data from - One parameter of type String called
     * “path”. This must be initialized with the xpath to one element in the
     * structure. Example: the path “Building/Floor[<idx>]/FloorName” will
     * return the name of the Floor number “idx” from the structure called
     * ‘Building’ - One parameter of type Integer called idx. This must be set
     * to a value that is an index in the structure, starting with 1.
     * @return A list with variables that must send to the workflow. In this
     * case, the workflow must contain one output parameter of type String
     * called “result”. This parameter will contain the value extracted from the
     * structure after the workflow exit point execution.
     */
    private List<Variable> getDescriptionFromTree(List<Variable> inputVariables) {
        String path = VariableHelper.getStringValue("path", inputVariables);

        long lineNumber = VariableHelper.getIntegerValue("idx", inputVariables);
        path = StringUtils.replace(path, "<idx>", "" + (lineNumber - 1));
        StructureElement element = TreeHelper.getElementFromTree(path, inputVariables);
        String result = "";
        if (element != null && element instanceof StructureStringField) {
            result = ((StructureStringField) element).getValue();
        }
        VariableHelper.setStringValue("result", result, inputVariables);
        return inputVariables;
    }

    /**
     * This is only an example of an command. The function self is not
     * implemented
     *
     * @param inputVariables The variables form the workflow
     * @return A list of workflow variables.
     */
    private List<Variable> splitStrings(List<Variable> inputVariables) {
        return inputVariables;
    }
    
    /**
     * Gets the propagated Notes, formats and concatenates them and returns them
     * in a single variable
     * 
     * @param inputVariables The variables from the workflow
     * @return  A list of workflow variables.
     */
    private List<Variable> showNotes(List<Variable> inputVariables) {
        final String formatNote = "Note [id: %s, task: %s, created: %s, user: %s (%s), noteText: %s]\n";
        List<Note> notes = TreeHelper.getNotes(inputVariables);
        StringBuilder buf = new StringBuilder();
        
        for (Note note : notes) {
            String str = String.format(
                    formatNote, 
                    note.getNoteId(),
                    note.getCreatedByItemId(),
                    note.getCreated(),
                    note.getUser(),
                    note.getPersonId(),
                    note.getText());
            System.out.println(str);
            buf.append(str);
        }
        System.out.println(buf.toString());
        VariableHelper.setStringValue("ListOfNotes", buf.toString(), inputVariables);
        return inputVariables;
    }


        
 

    /**
     * Helper methods to get and set variable values.
     */
    private static class VariableHelper {

        private static boolean getBooleanValue(String variableName, List<Variable> inputVariables) {
            return ((BooleanValue) getVariableByName(variableName, inputVariables)).isValue();
        }

        private static void setBooleanValue(String variableName, boolean value, List<Variable> outputVariables) {
            BooleanValue variable = (BooleanValue) getVariableByName(variableName, outputVariables);
            if (variable == null) {
                variable = new BooleanValue();
                variable.setName(variableName);
            }
            variable.setValue(value);
            outputVariables.add(variable);
        }

        private static XMLGregorianCalendar getDateTimeValue(String variableName, List<Variable> inputVariables) {
            return ((DateTimeValue) getVariableByName(variableName, inputVariables)).getValue();
        }

        private static void setDateTimeValue(String variableName, XMLGregorianCalendar value, List<Variable> outputVariables) {
            DateTimeValue variable = (DateTimeValue) getVariableByName(variableName, outputVariables);
            if (variable == null) {
                variable = new DateTimeValue();
                variable.setName(variableName);
            }
            variable.setValue(value);
            outputVariables.add(variable);
        }

        private static XMLGregorianCalendar getDateValue(String variableName, List<Variable> inputVariables) {
            return ((DateValue) getVariableByName(variableName, inputVariables)).getValue();
        }

        private static void setDateValue(String variableName, XMLGregorianCalendar value, List<Variable> outputVariables) {
            DateValue variable = (DateValue) getVariableByName(variableName, outputVariables);
            if (variable == null) {
                variable = new DateValue();
                variable.setName(variableName);
            }
            variable.setValue(value);
            outputVariables.add(variable);
        }

        private static double getDecimalValue(String variableName, List<Variable> inputVariables) {
            return ((DecimalValue) getVariableByName(variableName, inputVariables)).getValue();
        }

        private static void setDecimalValue(String variableName, double value, List<Variable> outputVariables) {
            DecimalValue variable = (DecimalValue) getVariableByName(variableName, outputVariables);
            if (variable == null) {
                variable = new DecimalValue();
                variable.setName(variableName);
            }
            variable.setValue(value);
            outputVariables.add(variable);
        }

        private static long getIntegerValue(String variableName, List<Variable> inputVariables) {
            return ((IntegerValue) getVariableByName(variableName, inputVariables)).getValue();
        }

        private static void setIntegerValue(String variableName, long value, List<Variable> outputVariables) {
            IntegerValue variable = (IntegerValue) getVariableByName(variableName, outputVariables);
            if (variable == null) {
                variable = new IntegerValue();
                variable.setName(variableName);
            }
            variable.setValue(value);
            outputVariables.add(variable);
        }

        private static String getStringValue(String variableName, List<Variable> inputVariables) {
            return ((StringValue) getVariableByName(variableName, inputVariables)).getValue();
        }

        private static void setStringValue(String variableName, String value, List<Variable> outputVariables) {
            StringValue variable = (StringValue) getVariableByName(variableName, outputVariables);
            if (variable == null) {
                variable = new StringValue();
                variable.setName(variableName);
            }
            variable.setValue(value);
            outputVariables.add(variable);
        }

        private static StructureValue getTree(String variableName, List<Variable> inputVariables) {
            return (StructureValue) getVariableByName(variableName, inputVariables);
        }

        private static Variable getVariableByName(String variableName, List<Variable> variables) {
            for (Variable variable : variables) {
                if (variable.getName().equalsIgnoreCase(variableName)) {
                    return variable;
                }
            }
            return null;
        }
    }

    /**
     * A helper class with functions to work with trees.
     */
    private static final class TreeHelper {

        private static List<Note> getNotes(List<Variable> inputVariables) {
            StructureValue noteTree = VariableHelper.getTree("__PropagatedWorkflowNotes__", inputVariables);
            List<Note> resultList = new ArrayList<>();

            if (noteTree != null) {
                List<StructureElement> noteList = noteTree.getContent();
                for (StructureElement noteElem : noteList) {
                    List<StructureElement> noteElemList = ((StructureLevel) noteElem).getContent();
                    Note note = Note.getInstance();
                    for (StructureElement noteProp : noteElemList) {

                        if (null != noteProp.getName()) {
                            switch (noteProp.getName()) {
                                case "NoteId":
                                    note.setNoteId(((StructureIntegerField) noteProp).getValue());
                                    break;
                                case "Author":
                                    note.setUser(((StructureStringField) noteProp).getValue());
                                    break;
                                case "PersonId":
                                    note.setPersonId(((StructureStringField) noteProp).getValue());
                                    break;
                                case "CreatedByTaskId":
                                    note.setCreatedByItemId(((StructureIntegerField) noteProp).getValue());
                                    break;
                                case "NoteEntryDateTime":
                                     note.setCreated(((StructureDateTimeField) noteProp).getValue());
                                    break;
                                case "NoteText":
                                    note.setText(((StructureStringField) noteProp).getValue());
                                    break;
                                default:
                                    throw new RuntimeException("Value not recognized. Name : [" + noteProp.getName() + "]");
                            }
                        }

                    }
                    resultList.add(note);
                }

            }

            return resultList;
        }

        /**
         * Get the element with a given nodePath.
         *
         * The path must have the structure: /Treename/nodename[idx]/valuename
         * or /Treename/valuename The tree name is the name of the tree The
         * nodename is the name of the level The idx is the number of the node
         * starting with 0 The valuename is the name of the 'leaf'
         *
         * @param nodePath The path to the wanted element
         * @param inputVariables the variables from the work flow
         * @return the element to look for or null when this element is not the
         * tree
         */
        private static StructureElement getElementFromTree(String nodePath, List<Variable> inputVariables) {
            if (nodePath.startsWith("/")) {
                nodePath = nodePath.substring(1);
            }
            String[] nodePaths = StringUtils.split(nodePath, '/');

            if (nodePaths.length == 0) {
                return null;
            }
            List<String> nodePathList = new ArrayList(Arrays.asList(nodePaths));

            StructureValue tree = VariableHelper.getTree(nodePathList.get(0), inputVariables);
            nodePathList.remove(0);
            if (nodePathList.isEmpty()) {
                return null;
            }

            String path = nodePathList.get(0);

            StructureElement result = getElement(path, tree.getContent());
            nodePathList.remove(0);
            if (nodePathList.isEmpty()) {
                return result;
            }
            return getElement(nodePathList, result);
        }

        /**
         *
         * @param nodePathList the list of parts of the path
         * @param subtree the subtree to look in
         * @return a element from a certain subtree
         */
        private static StructureElement getElement(List<String> nodePathList, StructureElement subtree) {
            if (nodePathList.isEmpty()) {
                return subtree;
            }

            if (!(subtree instanceof StructureLevel)) {
                return null;
            }

            StructureLevel level = (StructureLevel) subtree;
            String path = nodePathList.get(0);
            StructureElement elle = getElement(path, level.getContent());
            nodePathList.remove(0);
            return getElement(nodePathList, elle);
        }

        /**
         *
         * @param name the name of the element with format name[xxxx] or name
         * where xxxx is an positive integer.
         * @param elements a list of elements of one level
         * @return a element with a given name and index
         */
        static StructureElement getElement(String name, List<StructureElement> elements) {
            /*
             * matches: 
             *      name[xxxx] (xxxx is an integer) 
             * or
             *      name
             */
            if (name.matches(("\\w*(\\[\\d*\\])?"))) {
                String idxStr = StringUtils.substringBetween(name, "[", "]");
                String nameNode = StringUtils.substringBefore(name, "[");
                int listIdx = parseInt(idxStr, 0);
                List<StructureElement> tempElement = getElementsByName(nameNode, elements);


                if (tempElement.size() > listIdx) {
                    return tempElement.get(listIdx);
                } else {
                    return null;
                }

            }
            return null;
        }

        /**
         *
         * @param variableName the name of the variable
         * @param index the index of the integer in the list
         * @param treeLines the children of a certain level.
         * @return an integer with a given varariableName and index
         */
        static long getInteger(String variableName, int index, List<StructureElement> treeLines) {
            List<StructureElement> elements = getElementsByName(variableName, treeLines);
            if (elements.size() > index) {
                return ((StructureIntegerField) elements.get(index)).getValue();
            }

            throw new RuntimeException("Tree element '" + variableName + "' is missing.");
        }

        static XMLGregorianCalendar getDateField(String variableName, int index, List<StructureElement> treeLines) {
            List<StructureElement> elements = getElementsByName(variableName, treeLines);
            if (elements.size() > index) {
                return ((StructureDateField) elements.get(index)).getValue();
            }

            throw new RuntimeException("Tree element '" + variableName + "' is missing.");
        }

        static XMLGregorianCalendar getDateTimeField(String variableName, int index, List<StructureElement> treeLines) {
            List<StructureElement> elements = getElementsByName(variableName, treeLines);
            if (elements.size() > index) {
                return ((StructureDateTimeField) elements.get(index)).getValue();
            }

            throw new RuntimeException("Tree element '" + variableName + "' is missing.");
        }

        static double getDecimalField(String variableName, int index, List<StructureElement> treeLines) {
            List<StructureElement> elements = getElementsByName(variableName, treeLines);
            if (elements.size() > index) {
                return ((StructureDecimalField) elements.get(index)).getValue();
            }

            throw new RuntimeException("Tree element '" + variableName + "' is missing.");
        }

        static boolean getBooleanField(String variableName, int index, List<StructureElement> treeLines) {
            List<StructureElement> elements = getElementsByName(variableName, treeLines);
            if (elements.size() > index) {
                return ((StructureBooleanField) elements.get(index)).isValue();
            }

            throw new RuntimeException("Tree element '" + variableName + "' is missing.");
        }

        static String getStringField(String variableName, int index, List<StructureElement> treeLines) {
            List<StructureElement> elements = getElementsByName(variableName, treeLines);
            if (elements.size() > index) {
                return ((StructureStringField) elements.get(index)).getValue();
            }
            throw new RuntimeException("Tree element '" + variableName + "' is missing.");
        }

        /**
         *
         * @param variableName the name of the variable
         * @param index the index of the level
         * @param treeLines the children of a level
         * @return a level with a given variable name and index from a list
         */
        static List<StructureElement> getStructureLevel(String variableName, int index, List<StructureElement> treeLines) {
            List<StructureElement> elements = getElementsByName(variableName, treeLines);
            if (elements.size() > index) {
                return ((StructureLevel) elements.get(index)).getContent();
            }

            throw new RuntimeException("Tree element '" + variableName + "' is missing.");
        }

        /**
         *
         * @param variableName the variable name
         * @param treeLines the list of children of an level
         * @return a list of elements with a given variable name
         */
        private static List<StructureElement> getElementsByName(String variableName, List<StructureElement> treeLines) {
            List<StructureElement> result = new ArrayList<StructureElement>();
            for (StructureElement element : treeLines) {
                if (variableName.equalsIgnoreCase(element.getName())) {
                    result.add(element);
                }
            }
            return result;
        }

        private static int parseInt(String intStr, int defaultVal) {
            int result = defaultVal;
            try {
                if (intStr != null && !intStr.isEmpty()) {
                    result = Integer.parseInt(intStr);
                }
            } catch (NumberFormatException numEx) {
                // nothing to do
            }

            return result;
        }
    }
    
    private static class Note {
        private long noteId;
        private String user;
        private String personId;
        private XMLGregorianCalendar  created;
        private long createdByItemId;
        private String text;

        static Note getInstance() {
            return new Note();
        }
        
        @Override
        public String toString() {
            return "Note{" + "noteId=" + noteId + ", user=" + user + ", created=" + created + ", createdByItemId=" + createdByItemId + ", text=" + text + '}';
        }

         /**
         * @return the user
         */
        public String getUser() {
            return user;
        }

        /**
         * @param user the user to set
         */
        public void setUser(String user) {
            this.user = user;
        }

        public String getPersonId() {
            return personId;
        }

        public void setPersonId(String personId) {
            this.personId = personId;
        }

        /**
         * @return the created
         */
        public XMLGregorianCalendar getCreated() {
            return created;
        }

        /**
         * @param created the created to set
         */
        public void setCreated(XMLGregorianCalendar created) {
            this.created = created;
        }

        /**
         * @return the createdByItemId
         */
        public long getCreatedByItemId() {
            return createdByItemId;
        }

        /**
         * @param createdByItemId the createdByItemId to set
         */
        public void setCreatedByItemId(long createdByItemId) {
            this.createdByItemId = createdByItemId;
        }

        /**
         * @return the text
         */
        public String getText() {
            return text;
        }

        /**
         * @param text the text to set
         */
        public void setText(String text) {
            this.text = text;
        }

        /**
         * @return the noteId
         */
        public long getNoteId() {
            return noteId;
        }

        /**
         * @param noteId the noteId to set
         */
        public void setNoteId(long noteId) {
            this.noteId = noteId;
        }
    }
    
    /************************************************************************
     * Notice:                                                              *
     *                                                                      *
     * The sample is meant to illustrate how you can implement your own     *
     * workflow exit point. It is provided as is, without warranty          *
     * of any kind.                                                         *
     *                                                                      *
     * Infor does not guarantee the success you may have in implementing    *
     * a workflow exit point based on this sample. You are advised to test  *
     * the code thoroughly before relying on it.                            *
     *                                                                      *
     * **********************************************************************
     */
}
