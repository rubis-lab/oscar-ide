package org.rubis.oscar.xml2ros;

import org.w3c.dom.*;
import org.w3c.dom.traversal.DocumentTraversal;
import org.w3c.dom.traversal.NodeIterator;

import javax.xml.parsers.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class XML2ROS {
	static String indentationStyle = getFirst("indentation");
	
	public static void testXML2ROS() {
		System.out.println("test XML2ROS");
	}
	
	public XML2ROS() {
		
	}
	/*
    public static void main(String[] args) throws IOException
    {
    */
	public static void convert() throws IOException {
		
		try {
			File inputFile = new File("data.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
			String projectName = doc.getElementsByTagName("name").item(0).getTextContent();
			NodeList nList = doc.getElementsByTagName("node");
			System.out.println("-----------------------");
			
			File rosFolder = new File("workspace" + File.separator + projectName + File.separator + "src");
			rosFolder.mkdirs();
			for (int idx = 0; idx < nList.getLength(); idx++) {
				Node nNode = nList.item(idx);
				System.out.println("\nCurrent Element : " + nNode.getNodeName());
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) nNode;
					File rosFile = new File("workspace" + File.separator + projectName + File.separator + "src" + File.separator + element.getElementsByTagName("name").item(0).getTextContent() + ".ros");
					rosFile.createNewFile();
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
//        String sRate = getFirst("rate");
//        Integer rate;
//        if(sRate == null) rate = null;
//        else rate = Integer.parseInt(getFirst("rate"));
//    
//        String folderName = getFirst("name");
//    
//        new File(folderName).mkdirs();
//        new File(folderName + "/launch").mkdirs();
//        new File(folderName + "/src").mkdirs();
//        
//        NodeList nodes = getChildContentsOf("nodes");
//        
//        for(int nodeIndex = 0; nodeIndex < nodes.getLength(); nodeIndex++)
//        {
//            if(!nodes.item(nodeIndex).getNodeName().equals("node")) continue; // Irrelevant.
//            Tuple inputsOutputs = getInputsOutputs(nodes.item(nodeIndex).getChildNodes());
//            ArrayList<String> headers = new ArrayList<String>(); // Headers used by this node.
//            headers.add(getFirst("rosHeader"));
//            addAdditionalMessages(headers, nodes.item(nodeIndex).getChildNodes()); // By default only std_msgs is supported. Check XML file for additional specified ones.
//            for(String s : getHeaders(inputsOutputs, nodes.item(nodeIndex).getChildNodes()))
//                if(!headers.contains(s))
//                    headers.add(s);
//    
//            ArrayList<CallBack> callbacks = getCallBacks((ArrayList<Input>)inputsOutputs.x);
//            ArrayList<String> publishFunctions = new ArrayList<String>();
//    
//            String cpp = "";
//            // Add includes to cpp string.
//            for(int i = 0; i < headers.size(); i++) cpp += "#include " + headers.get(i) + "\n";
//            cpp += "\n";
//            // Add callback prototypes.
//            for(int i = 0; i < callbacks.size(); i++) cpp += callbacks.get(i).getPrototype() + "\n";
//            cpp += "\n";
//    
//            for(int i = 0; i < ((ArrayList<Output>)inputsOutputs.y).size(); i++)
//            {
//                String prototype = "void " + ((ArrayList<Output>)inputsOutputs.y).get(i).name + "_Publish(" + Types.typeMap.get(((ArrayList<Output>)inputsOutputs.y).get(i).type).getConstIdentifier() + ");\n";
//                cpp += indent(0) + prototype;
//        
//                String function = "void " + ((ArrayList<Output>)inputsOutputs.y).get(i).name + "_Publish(" + Types.typeMap.get(((ArrayList<Output>)inputsOutputs.y).get(i).type).getConstIdentifier() + ")\n";
//                function += "{\n" + indent(1) + "// Publish data code handling can go here if you want.\n\n" + indent(1) + ((ArrayList<Output>)inputsOutputs.y).get(i).name + ".publish(msg);\n}";
//                publishFunctions.add(function);
//            }
//    
//            cpp += "\n";
//    
//            // Add global variables
//            for(int i = 0; i < ((ArrayList<Output>)inputsOutputs.y).size(); i++)
//            {
//                String varInit = "ros::Publisher " + ((ArrayList<Output>)inputsOutputs.y).get(i).name + ";";
//                cpp += indent(0) + varInit + "\n";
//            }
//            cpp += "\n";
//    
//            // Add main function
//            cpp += "int main(int argc, char **argv)\n{\n";
//    
//            cpp += indent(1) + "ros::init(argc, argv, \"some_name\");\n";
//            cpp += indent(1) + "ros::NodeHandle n;\n";
//            if(rate != null) cpp += indent(1) + "ros::Rate loopRate(" + rate + ");\n";
//    
//            for(int i = 0; i < ((ArrayList<Output>)inputsOutputs.y).size(); i++)
//            {
//                String varInit = ((ArrayList<Output>)inputsOutputs.y).get(i).name + "" +
//                        " = n.advertise<" + Types.typeMap.get(((ArrayList<Output>)inputsOutputs.y).get(i).type).getTypeIdentifier() + ">(\"" + ((ArrayList<Output>)inputsOutputs.y).get(i).name + "\", " + ((ArrayList<Output>)inputsOutputs.y).get(i).queueSize + ");";
//        
//                cpp += indent(1) + varInit + "\n";
//            }
//            cpp += "\n";
//    
//            for(int i = 0; i < ((ArrayList<Input>)inputsOutputs.x).size(); i++)
//            {
//                String varInit = "ros::Subscriber " + ((ArrayList<Input>)inputsOutputs.x).get(i).subscribeTo + "Subscriber" + "" +
//                        " = n.subscribe(\"" + ((ArrayList<Input>)inputsOutputs.x).get(i).subscribeTo + "\", ";
//        
//                // Check if there the publisher we are subscribing to exists in the XML file.
//                // If it exists, copy the queue size.
//                // If it does not exist, set queue size as 1024.
//                int messageBuffer = 1024;
//                for(int y = 0; y < ((ArrayList<Output>)inputsOutputs.y).size(); y++)
//                    if(((ArrayList<Output>)inputsOutputs.y).get(y).name.equals(((ArrayList<Input>)inputsOutputs.x).get(i).subscribeTo))
//                    {
//                        messageBuffer = ((ArrayList<Output>)inputsOutputs.y).get(y).queueSize;
//                        break;
//                    }
//                varInit += messageBuffer + ", " + ((ArrayList<Input>)inputsOutputs.x).get(i).callBackFunction + ");";
//                cpp += indent(1) + varInit + "\n";
//            }
//            cpp += "\n";
//    
//            //cpp += indent(1) + "for(int i = 0; ros::ok(); i++)\n" + indent(1) + "{\n" + indent(2) + "// Put publisher code here, or wherever you please. This is just example loop.\n" + indent(1) + "}\n";
//            cpp += "\n";
//    
//            cpp += indent(1) + "ros::spin();\n";
//            cpp += indent(1) + "return 0;\n}";
//            cpp += "\n\n";
//    
//            // Add callback functions.
//            for(int i = 0; i < callbacks.size(); i++) cpp += callbacks.get(i).getFunction() + "\n\n";
//            cpp += "\n";
//    
//            // Add publish functions.
//            for(int i = 0; i < publishFunctions.size(); i++) cpp += publishFunctions.get(i) + "\n\n";
//            cpp += "\n";
//            System.out.println("Current file name is: " + getFirstInner("name", nodes.item(nodeIndex).getChildNodes()));
//            try (PrintWriter out = new PrintWriter(folderName + "/src/" + getFirstInner("name", nodes.item(nodeIndex).getChildNodes()) + ".cpp"))
//            {
//                out.println(cpp);
//            }
//            catch (Exception e)
//            {
//                System.out.println("Exc: " + e.getMessage());
//            }
//        }
//        
//        // Let's make launch files
//        // C++ Extensions (Case sensitive): .cc, .C, .cxx, c++, cpp
//        
//        ArrayList<String> cppFiles = new ArrayList<String>();
//        File dir = new File("./" + folderName + "/src/");
//        File[] filesList = dir.listFiles();
//        for (File file : filesList)
//            if (file.isFile())
//            {
//                String name = file.getName().split("\\.")[0];
//                String type = file.getName().split("\\.")[1];
//                if(type.equals("cc") || type.equals("C") || type.equals("cxx") || type.equals("c++") || type.equals("cpp"))
//                    cppFiles.add(name);
//            }
//        for(int i = 0; i < cppFiles.size(); i++)
//        {
//            try (PrintWriter out = new PrintWriter(folderName + "/launch/" + cppFiles.get(i) + ".launch"))
//            {
//                out.println("<?xml version=\"1.0\"?>\n<launch>\n\t<node name=\"" + cppFiles.get(i) + "\" pkg=\"" + getFirst("packageName") + "\" type=\"" + cppFiles.get(i) + "\" output=\"screen\" />\n</launch>");
//            }
//            catch (Exception e)
//            {
//                System.out.println("Exc: " + e.getMessage());
//            }
//        }
//        
//        // Let's make package.xml
//        ArrayList<String> typeDepends = new ArrayList<String>(); // Let's get all the type dependencies.
//        // Would be smarter to just use a collection that doesn't allow duplicates...
//        for(String key : Types.typeMap.keySet())
//            if(!typeDepends.contains(Types.typeMap.get(key).namespace))
//                typeDepends.add(Types.typeMap.get(key).namespace);
//        String packageXml = "<?xml version=\"1.0\"?>\n<package format=\"2\">\n\t<name>" + getFirst("packageName") + "</name>\n\t<version>" + getFirst("version") + "</version>\n\t<description>" + getFirst("description") + "</description>\n\n\t<maintainer email=\"" + getFirst("maintainerEmail") + "\">" + getFirst("maintainerName") + "</maintainer>\n\t<license>" + getFirst("license") + "</license>\n\t<buildtool_depend>catkin</buildtool_depend>\n\n\t";
//        packageXml += "<build_depend>roscpp</build_depend>\n\t<exec_depend>roscpp</exec_depend>\n";
//        for(int i = 0; i < typeDepends.size(); i++)
//        {
//            packageXml += "\t<build_depend>" + typeDepends.get(i) + "</build_depend>\n";
//            packageXml += "\t<exec_depend>" + typeDepends.get(i) + "</exec_depend>\n";
//        }
//        packageXml += "</package>";
//        
//        // Save package xml
//        try (PrintWriter out = new PrintWriter(folderName + "/package.xml"))
//        {
//            out.println(packageXml);
//        }
//        catch (Exception e)
//        {
//            System.out.println("Exc: " + e.getMessage());
//        }
//        
//        // Create CMakeLists.txt
//        String cmakelists = "";
//        cmakelists += "cmake_minimum_required(VERSION 2.8.3)\nproject(" + getFirst("packageName") + ")\n";
//        String requiredComponents = "roscpp";
//        for(String s : typeDepends) requiredComponents += " " + s;
//        cmakelists += "\nfind_package(catkin REQUIRED COMPONENTS " + requiredComponents + ")\n\n";
//        cmakelists += "catkin_package(\n# INCLUDE_DIRS include\n# LIBRARIES for package\n# CATKIN_DEPENDS depends\n# DEPENDS system_lib\n)\n\n";
//        cmakelists += "include_directories(include ${catkin_INCLUDE_DIRS})\n\n";
//        
//        for(int i = 0; i < cppFiles.size(); i++)
//        {
//            cmakelists += "add_executable(" + cppFiles.get(i) + " src/" + cppFiles.get(i) + ".cpp)\n";
//            cmakelists += "target_link_libraries(" + cppFiles.get(i) + " ${catkin_LIBRARIES})\n";
//        }
//        
//        // Save it
//        try (PrintWriter out = new PrintWriter(folderName + "/CMakeLists.txt"))
//        {
//            out.println(cmakelists);
//        }
//        catch (Exception e)
//        {
//            System.out.println("Exc: " + e.getMessage());
//        }
    }

    public static String getFirst(String tag)
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        File file = new File("data.xml");
        
        Document document;
        try
        {
            builder = factory.newDocumentBuilder();
            document = builder.parse(file);
            document.getDocumentElement().normalize();
            System.out.println("Root element: " + document.getDocumentElement().getNodeName());
            NodeList content = document.getDocumentElement().getChildNodes();

            for(int i = 0; i < content.getLength(); i++)
                if(content.item(i).getNodeName().equals(tag))
                {
                    System.out.print("Returning: " + content.item(i).getTextContent());
                    return content.item(i).getTextContent();
                }
        }
        catch (Exception e)
        {
            System.out.println("Exception thrown: " + e.getMessage());
        }

        return null;
    }
    
    public static String getFirstInner(String tag, NodeList nodes)
    {
        for(int i = 0; i < nodes.getLength(); i++)
            if(nodes.item(i).getNodeName().equals(tag))
            {
                System.out.print("Returning: " + nodes.item(i).getTextContent());
                return nodes.item(i).getTextContent();
            }
        return null;
    }

    // We might need to include additional headers depending on input / output types.
    public static ArrayList<String> getHeaders(Tuple inputsOutputs, NodeList inner)
    {
        ArrayList<String> headers = new ArrayList<String>();
        NodeList headerNodes = getChildContentsOfInner("headers", inner);
        for(int i = 0; i < headerNodes.getLength(); i++)
            if(headerNodes.item(i).getNodeName().equals("header")) headers.add(headerNodes.item(i).getTextContent());

        ArrayList<Input> inputs = (ArrayList<Input>)(inputsOutputs.x);
        ArrayList<Output> outputs = (ArrayList<Output>)(inputsOutputs.y);
        HashMap<String, String> blacklist = new HashMap<String, String>(); // Prevent header duplication.

        for(int i = 0; i < (inputs.size() + outputs.size()); i++)
        {
            String type = i < inputs.size() ? inputs.get(i).type : outputs.get(i - inputs.size()).type;
            if(blacklist.get(type) != null) continue; // Prevent header duplication.
            blacklist.put(type, "Anything can be in here. Hello. I like Mint Chocolate Ice cream."); // Add element to ensure we won't get duplicated header later.
            if(Types.typeMap.get(type) == null) System.out.println("WARNING: TYPE NAME INCORRECTLY ENTERED (" + type + ").");
            else headers.add(Types.typeMap.get(type).getInclude());
        }

        return headers;
    }
    
    public static void addAdditionalMessages(ArrayList<String> headers, NodeList rosNode)
    {
        NodeList messageList = getChildContentsOfInner("additional_msgs", rosNode);
        for(int i = 0; i < messageList.getLength(); i++)
            if(messageList.item(i).getNodeName().equals("msg"))
            {
                NodeList msgInfo = messageList.item(i).getChildNodes();
                String namespace = "", type = "";
                for(int y = 0; y < msgInfo.getLength(); y++)
                    if(msgInfo.item(y).getNodeName().equals("msg_namespace")) namespace = msgInfo.item(y).getTextContent();
                    else if(msgInfo.item(y).getNodeName().equals("msg_type")) type = msgInfo.item(y).getTextContent();
                if(namespace.equals("") || type.equals("")) continue;
                // Add the type to the type map.
                Types.typeMap.put(type, new Types.Type(type, namespace));
                headers.add("\"" + namespace + "/" + type + ".h" + "\"");
            }
    }

    public static ArrayList<CallBack> getCallBacks(ArrayList<Input> inputs)
    {
        ArrayList<CallBack> callBacks = new ArrayList<CallBack>();
        for(int i = 0; i < inputs.size(); i++)
        {
            String functionName = inputs.get(i).callBackFunction;
            String type = inputs.get(i).type;
            boolean isUnique = true;
            // Make sure corresponding callback function doesn't already exist.
            for(int y = 0; y < callBacks.size(); y++)
                if(callBacks.get(y).name.equals(functionName) && callBacks.get(y).type.equals(type))
                    isUnique = false;
            if(isUnique)    callBacks.add(new CallBack(inputs.get(i).callBackFunction, inputs.get(i).type, indent(1)));
        }
        return callBacks;
    }

    // Neatly gets inputs and outputs in one single loop for both.
    public static Tuple<ArrayList<Input>, ArrayList<Output>> getInputsOutputs(NodeList node)
    {
        ArrayList<Input> inputs = new ArrayList<Input>();
        ArrayList<Output> outputs = new ArrayList<Output>();

        NodeList inputNodes = getChildContentsOfInner("inputs", node);
        NodeList outputNodes = getChildContentsOfInner("outputs", node);

        // Optimised to loop through inputs and outputs as one loop.
        for(int i = 0; i < (inputNodes.getLength() + outputNodes.getLength()); i++)
        {
            String nodeName = i < inputNodes.getLength() ? inputNodes.item(i).getNodeName() : outputNodes.item(i - inputNodes.getLength()).getNodeName();
            if (nodeName.equals("in") || nodeName.equals("out"))
            {
                // Input and Output has same # of args so we can do this:
                String firstArg = null, secondArg = null, thirdArg = null;
                NodeList children = i < inputNodes.getLength() ? inputNodes.item(i).getChildNodes() : outputNodes.item(i - inputNodes.getLength()).getChildNodes();
                for (int y = 0; y < children.getLength(); y++)
                {
                    switch (children.item(y).getNodeName())
                    {
                        // Switch case fall to simulate "OR".
                        case "subscribeTo":
                        case "name":
                            firstArg = children.item(y).getTextContent();
                            break;
                        case "type":
                            secondArg = children.item(y).getTextContent();
                            break;
                        case "callBackFunction":
                        case "queueSize":
                            thirdArg = children.item(y).getTextContent();
                            break;
                    }
                }
                if (firstArg != null && secondArg != null && thirdArg != null)
                    if(i < inputNodes.getLength()) inputs.add(new Input(firstArg, secondArg, thirdArg));
                    else outputs.add(new Output(firstArg, secondArg, thirdArg));
                else System.out.println("ERROR - NULL INPUT XML TAG INNER FIELD");
            }
        }
        return new Tuple(inputs, outputs);
    }

    public static String indent(int tabIndentationLevel)
    {
        String indents = "";
        for(int i = 0; i < tabIndentationLevel; i++)
            if(indentationStyle.equals("tabs")) indents += "\t";
            else for(int y = 0; y < Integer.parseInt(indentationStyle); y++) indents += " ";
        return indents;
    }

    public static NodeList getChildContentsOf(String parentName)
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        File file = new File("data.xml");
        Document document;
        try
        {
            builder = factory.newDocumentBuilder();
            document = builder.parse(file);
            document.getDocumentElement().normalize();
            System.out.println("Root element: " + document.getDocumentElement().getNodeName());
            NodeList content = document.getDocumentElement().getChildNodes();
            for(int i = 0; i < content.getLength(); i++)
                if(content.item(i).getNodeName().equals(parentName))
                    return content.item(i).getChildNodes();
        }
        catch (Exception e)
        {
            System.out.println("Exception thrown: " + e.getMessage());
        }

        return null; // Unable to locate parent tag.
    }
    
    public static NodeList getChildContentsOfInner(String parentName, NodeList nodeList)
    {
        for(int i = 0; i < nodeList.getLength(); i++)
        {
            if(nodeList.item(i).getNodeName().equals(parentName))
            {
                return nodeList.item(i).getChildNodes();
            }
        }
        return null; // Unable to locate parent tag.
    }
}
