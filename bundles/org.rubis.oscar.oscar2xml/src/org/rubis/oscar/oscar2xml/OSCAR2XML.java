package org.rubis.oscar.oscar2xml;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class OSCAR2XML {
	ArrayList<OSCARNode> OSCARNodes;
	ArrayList<OSCARTopic> OSCARTopics;
	ArrayList<OSCARLink> OSCARLinks;
	
	public OSCAR2XML() {
		super();
		OSCARNodes = new ArrayList<OSCARNode>();
		OSCARTopics = new ArrayList<OSCARTopic>();
		OSCARLinks = new ArrayList<OSCARLink>();
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println("dd");
//		File debugFile = new File("debugout.txt");
//		debugFile.createNewFile();
		
		OSCAR2XML oscar = new OSCAR2XML();
		// oscar.preprocessXML("oscar.xml");
		oscar.parseOSCAR();
		oscar.writeXML();
	}
	
	public void convert(String fileName) throws Exception {
		//File debugFile = new File(fileName);
		//debugFile.createNewFile();
		
		OSCAR2XML oscar = new OSCAR2XML();
//		oscar.preprocessXML(fileName);
		oscar.parseOSCAR();
		oscar.writeXML();
		
	}
	
	public void preprocessXML(String fileName) throws Exception {
		try {
			 File inputFile = new File(fileName);
			 DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document docIn = dBuilder.parse(inputFile);
	         docIn.getDocumentElement().normalize();
	         
	         Document docOut = dBuilder.newDocument();
	         
	         
 	         // root element
	         Element prevRootElement = docIn.getDocumentElement();
	         Element rootElement = docOut.createElement(prevRootElement.getNodeName());
	         
	         Attr xmiversionRootAttr = docOut.createAttribute("xmi:version");
	         xmiversionRootAttr.setValue(prevRootElement.getAttribute("xmi:version"));
     		 rootElement.setAttributeNode(xmiversionRootAttr);
     		 
     		 Attr xmlnsxmiRootAttr = docOut.createAttribute("xmlns:xmi");
     		 xmlnsxmiRootAttr.setValue(prevRootElement.getAttribute("xmlns:xmi"));
    		 rootElement.setAttributeNode(xmlnsxmiRootAttr);
    		 
    		 Attr xmlnsxsiRootAttr = docOut.createAttribute("xmlns:xsi");
    		 xmlnsxsiRootAttr.setValue(prevRootElement.getAttribute("xmlns:xsi"));
     		 rootElement.setAttributeNode(xmlnsxsiRootAttr);
     		 
     		 Attr xmlnsxoscarRootAttr = docOut.createAttribute("xmlns:oscar");
     		 xmlnsxoscarRootAttr.setValue(prevRootElement.getAttribute("xmlns:oscar"));
    		 rootElement.setAttributeNode(xmlnsxoscarRootAttr);
    		 
    		 docOut.appendChild(rootElement);
             
   	         // separate node and topics
	         ArrayList<Integer> idxLookup = new ArrayList<Integer>();
	         int nodeCnt = 0;
	         int topicCnt = 0;
	         
	         NodeList nList = docIn.getElementsByTagName("nodes");
	         System.out.println("----------------------------");
	         for (int i = 0; i < nList.getLength(); i++) {
		            Node nNode = nList.item(i);
		            System.out.println("\nCurrent Element :" + nNode.getNodeName());
		            
		            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
		            	Element eElement = (Element) nNode;
		            	
		            	// Node
		            	if(eElement.getAttribute("xsi:type").equals("oscar:Node")) {
		            		Element node = docOut.createElement("nodes");
		            				            		
		            		Attr xsitypeAttr = docOut.createAttribute("xsi:type");
		            		xsitypeAttr.setValue(eElement.getAttribute("xsi:type"));
		                    node.setAttributeNode(xsitypeAttr);
		                    
		                    Attr publishMSGAttr = docOut.createAttribute("publishMSG");
		                    publishMSGAttr.setValue(eElement.getAttribute("publishMSG"));
		                    node.setAttributeNode(publishMSGAttr);
		                    
		                    Attr subscribeMSGAttr = docOut.createAttribute("subscribeMSG");
		                    subscribeMSGAttr.setValue(eElement.getAttribute("subscribeMSG"));
		                    node.setAttributeNode(subscribeMSGAttr);
		                    
		                    Attr constraintsAttr = docOut.createAttribute("constraints");
		                    constraintsAttr.setValue(eElement.getAttribute("constraints"));
		                    node.setAttributeNode(constraintsAttr);
		                    
		                    Attr nameAttr = docOut.createAttribute("name");
		                    nameAttr.setValue(eElement.getAttribute("name"));
		                    node.setAttributeNode(nameAttr);
		                    
		                    Attr msgAttr = docOut.createAttribute("msg");
		                    msgAttr.setValue(eElement.getAttribute("msg"));
		                    node.setAttributeNode(msgAttr);
		                    
		                    Attr msg_typeAttr = docOut.createAttribute("msg_type");
		                    msg_typeAttr.setValue(eElement.getAttribute("msg_type"));
		                    node.setAttributeNode(msg_typeAttr);
		                    
		                    rootElement.appendChild(node);
		                    idxLookup.add(nodeCnt);
		                    nodeCnt++;
		                    
		                // Topic
		            	} else if(eElement.getAttribute("xsi:type").equals("oscar:Topic")) {
		            		System.out.println("topic!");
		            		Element node = docOut.createElement("topics");
		            		
		            		Attr xsitypeAttr = docOut.createAttribute("xsi:type");
		            		xsitypeAttr.setValue(eElement.getAttribute("xsi:type"));
		                    node.setAttributeNode(xsitypeAttr);
		                    
		                    Attr publishMSGAttr = docOut.createAttribute("publishMSG");
		                    publishMSGAttr.setValue(eElement.getAttribute("publishMSG"));
		                    node.setAttributeNode(publishMSGAttr);
		                    
		                    Attr subscribeMSGAttr = docOut.createAttribute("subscribeMSG");
		                    subscribeMSGAttr.setValue(eElement.getAttribute("subscribeMSG"));
		                    node.setAttributeNode(subscribeMSGAttr);
		                    
		                    Attr constraintsAttr = docOut.createAttribute("constraints");
		                    constraintsAttr.setValue(eElement.getAttribute("constraints"));
		                    node.setAttributeNode(constraintsAttr);
		                    
		                    Attr idAttr = docOut.createAttribute("id");
		                    idAttr.setValue(eElement.getAttribute("id"));
		                    node.setAttributeNode(idAttr);
		                    
		                    Attr nameAttr = docOut.createAttribute("name");
		                    nameAttr.setValue(eElement.getAttribute("name"));
		                    node.setAttributeNode(nameAttr);
		                    
		                    Attr msgAttr = docOut.createAttribute("msg");
		                    msgAttr.setValue(eElement.getAttribute("msg"));
		                    node.setAttributeNode(msgAttr);
		                    
		                    Attr msg_typeAttr = docOut.createAttribute("msg_type");
		                    msg_typeAttr.setValue(eElement.getAttribute("msg_type"));
		                    node.setAttributeNode(msg_typeAttr);
		                    
		                    rootElement.appendChild(node);
		                    idxLookup.add(topicCnt);
		                    topicCnt++;
		            	}
		            }
	         }
	         
	         // Links
	         nList = docIn.getElementsByTagName("links");
	         for (int i = 0; i < nList.getLength(); i++) {
		            Node nNode = nList.item(i);
		            System.out.println("\nCurrent Element :" + nNode.getNodeName());
		            
		            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
		            	Element eElement = (Element) nNode;
		            	Element link = docOut.createElement("links");
		            	
		            	Attr xsitypeAttr = docOut.createAttribute("xsi:type");
	            		xsitypeAttr.setValue(eElement.getAttribute("xsi:type"));
	                    link.setAttributeNode(xsitypeAttr);
	                    
	                    Attr sourceAttr = docOut.createAttribute("source");
	                    int prevSourceIdx = Integer.parseInt(eElement.getAttribute("source").split("\\.")[1]);
	                    
	            		sourceAttr.setValue("\\\\@elem." + Integer.toString(idxLookup.get(prevSourceIdx)));
	                    link.setAttributeNode(sourceAttr);
	                    
	                    Attr targetAttr = docOut.createAttribute("target");
	                    int prevTargetIdx = Integer.parseInt(eElement.getAttribute("target").split("\\.")[1]);
	            		targetAttr.setValue("\\\\@elem." + Integer.toString(idxLookup.get(prevTargetIdx)));
	                    link.setAttributeNode(targetAttr);
	                    
	                    rootElement.appendChild(link);
		            }
	         }
	         
	         // write the content into xml file
	         TransformerFactory transformerFactory = TransformerFactory.newInstance();
	         Transformer transformer = transformerFactory.newTransformer();
	         DOMSource source = new DOMSource(docOut);
	         StreamResult result = new StreamResult(new File("oscar.xml"));
	         transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	         transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
	         transformer.transform(source, result);
	         
	         // Output to console for testing
	         StreamResult consoleResult = new StreamResult(System.out);
	         transformer.transform(source, consoleResult);
	   	         
	   	         
		} catch (Exception e) {
			e.printStackTrace();
        }
	}
	
	public ArrayList<String> parseStringToArrayList(String str) {
		if(str == null || str.isEmpty()) {
			return new ArrayList<String>();
		}
		
		String[] ar = str.split(" ");
		
		for(int i = 0; i < ar.length; i++)
			ar[i] = ar[i].split("\\.")[1];
			
		return new ArrayList<String>(Arrays.asList(ar));
	}

	public void parseOSCAR() throws Exception {
		
		try {
	         File inputFile = new File("oscar.xml");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	         
	         /* nodes */
	         NodeList nList = doc.getElementsByTagName("nodes");
	         System.out.println("----------------------------");
	         
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nCurrent Element :" + nNode.getNodeName());
	            
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.println("xsi:type : " 
	                  + eElement.getAttribute("xsi:type"));
	               System.out.println("publishMSG : " 
	 	                  + eElement.getAttribute("publishMSG"));
	               System.out.println("subscribeMSG : " 
	 	                  + eElement.getAttribute("subscribeMSG"));
	               System.out.println("constraints : " 
	 	                  + eElement.getAttribute("constraints"));
	               System.out.println("name : " 
	 	                  + eElement.getAttribute("name"));
	               System.out.println("msg : " 
		 	                  + eElement.getAttribute("msg"));
	               System.out.println("msg_type : " 
		 	                  + eElement.getAttribute("msg_type"));
	               
	               OSCARNode oscarNode = new OSCARNode(
	            		   eElement.getAttribute("xsi:type"), 
	            		   parseStringToArrayList(eElement.getAttribute("publishMSG")),
	            		   parseStringToArrayList(eElement.getAttribute("subscribeMSG")),
	            		   eElement.getAttribute("constraints"),
	            		   eElement.getAttribute("name"));
	               OSCARNodes.add(oscarNode);
	               
	               System.out.println(oscarNode.toString());
	               /*
	               System.out.println("First Name : " 
	                  + eElement
	                  .getElementsByTagName("firstname")
	                  .item(0)
	                  .getTextContent());
	               */
	            }
	         }
	         
	         /* topics */
	         nList = doc.getElementsByTagName("topics");
	         System.out.println("----------------------------");
	         
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nCurrent Element :" + nNode.getNodeName());
	            
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.println("xsi:type : " 
	                  + eElement.getAttribute("xsi:type"));
	               System.out.println("publishMSG : " 
	 	                  + eElement.getAttribute("publishMSG"));
	               System.out.println("subscribeMSG : " 
	 	                  + eElement.getAttribute("subscribeMSG"));
	               System.out.println("constraints : " 
	 	                  + eElement.getAttribute("constraints"));
	               System.out.println("id : " 
		 	                  + eElement.getAttribute("id"));
	               System.out.println("name : " 
	 	                  + eElement.getAttribute("name"));
	               System.out.println("msg : " 
		 	                  + eElement.getAttribute("msg"));
	               System.out.println("msg_type : " 
		 	                  + eElement.getAttribute("msg_type"));
	               
	               OSCARTopic oscarTopic = new OSCARTopic(
	            		   eElement.getAttribute("xsi:type"), 
	            		   parseStringToArrayList(eElement.getAttribute("publishMSG")),
	            		   parseStringToArrayList(eElement.getAttribute("subscribeMSG")),
	            		   eElement.getAttribute("constraints"),
	            		   eElement.getAttribute("id"),
	            		   eElement.getAttribute("name"),
	            		   eElement.getAttribute("msg"),
	            		   eElement.getAttribute("msg_type"));
	               OSCARTopics.add(oscarTopic);
	               
	               System.out.println(oscarTopic.toString());
	               
	            }
	         }
	         
	         /* links */
	         nList = doc.getElementsByTagName("links");
	         System.out.println("----------------------------");
	         
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nCurrent Element :" + nNode.getNodeName());
	            
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.println("xsi:type : " 
	                  + eElement.getAttribute("xsi:type"));
	               System.out.println("source : " 
	 	                  + eElement.getAttribute("source").split("\\.")[1]);
	               System.out.println("target : " 
	 	                  + eElement.getAttribute("target").split("\\.")[1]);
	               
	               OSCARLink oscarLink = new OSCARLink(
	            		   eElement.getAttribute("xsi:type"), 
	            		   eElement.getAttribute("source").split("\\.")[1],
	            		   eElement.getAttribute("target").split("\\.")[1]);
	               OSCARLinks.add(oscarLink);
	               
	               System.out.println(oscarLink.toString());
	            }
	         }
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	}
	
	public OSCARTopic getSubscribedTopic(String id) {
		OSCARLink subLink = OSCARLinks.get(Integer.parseInt(id));
		String subTopicID = subLink.getSource();
		return OSCARTopics.get(Integer.parseInt(subTopicID));
	}
	
	public OSCARTopic getPublishedTopic(String id) {
		OSCARLink pubLink = OSCARLinks.get(Integer.parseInt(id));
		String pubTopicID = pubLink.getTarget();
		return OSCARTopics.get(Integer.parseInt(pubTopicID));
	}

	public void writeXML() throws Exception {
		try {
	         DocumentBuilderFactory dbFactory =
	         DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.newDocument();

	         
	         // root element
	         Element rootElement = doc.createElement("data");
	         doc.appendChild(rootElement);
	         
	         // headers
	         //TODO: package name from filename
	         
	         Element packageElement = doc.createElement("package");
	         rootElement.appendChild(packageElement);

	         packageElement.appendChild(makeNode(doc, "name", "my_package"));
	         packageElement.appendChild(makeNode(doc, "version", "0.0.0"));
	         packageElement.appendChild(makeNode(doc, "description", "Package Description"));
	         packageElement.appendChild(makeNode(doc, "maintainer_name", "you"));
	         packageElement.appendChild(makeNode(doc, "maintainer_email", "you@yourdomain.tld"));
	         packageElement.appendChild(makeNode(doc, "license", "TODO"));
	         
	         // Nodes
	         for(int i = 0; i < OSCARNodes.size(); i++) {
	        	 Element nodeElement = doc.createElement("node");
	        	 OSCARNode oscar_node = OSCARNodes.get(i);
	        	 
	        	 nodeElement.appendChild(makeNode(doc, "name", oscar_node.getName()));
	        	 
	        	 ArrayList<String> subscribe_list = oscar_node.getSubscribe();
	        	 for(int j = 0; j < subscribe_list.size(); j++) {
	        		 Element subElement = doc.createElement("sub");
	        		 OSCARTopic subTopic = getSubscribedTopic(subscribe_list.get(j));
	        		 
	        		 subElement.appendChild(makeNode(doc, "name", subTopic.getName()));
	        		 subElement.appendChild(makeNode(doc, "topic", subTopic.getName()));
	        		 subElement.appendChild(makeNode(doc, "msg", subTopic.getMsg()));
	        		 subElement.appendChild(makeNode(doc, "type", subTopic.getMsgType()));
	        		 subElement.appendChild(makeNode(doc, "queue_size", "1"));
	        		 subElement.appendChild(makeNode(doc, "callback", "zedCallback"));
	        	 
	        		 nodeElement.appendChild(subElement);
	        	 }
	        	 
	        	 ArrayList<String> publish_list = oscar_node.getPublish();
	        	 for(int j = 0; j < publish_list.size(); j++) {
	        		 Element pubElement = doc.createElement("pub");
	        		 OSCARTopic pubTopic = getPublishedTopic(publish_list.get(j));
	        		 
	        		 pubElement.appendChild(makeNode(doc, "name", pubTopic.getName()));
	        		 pubElement.appendChild(makeNode(doc, "topic", pubTopic.getName()));
	        		 pubElement.appendChild(makeNode(doc, "msg", pubTopic.getMsg()));
	        		 pubElement.appendChild(makeNode(doc, "type", pubTopic.getMsgType()));
	        		 pubElement.appendChild(makeNode(doc, "queue_size", "5"));
	        		 pubElement.appendChild(makeNode(doc, "callback", "zedCallback"));
	        		 
	        		 nodeElement.appendChild(pubElement);
	        	 }
	        	 packageElement.appendChild(nodeElement);
	         }
	         
	         
	         
	         
	         // -------------------------------------------
	         
	         
//	         rootElement.appendChild(doc.createElement("packageName")
//	        		 .appendChild(doc.createTextNode("my_package")).getParentNode());
//	         
//	         rootElement.appendChild(doc.createElement("fileName")
//	        		 .appendChild(doc.createTextNode("main")).getParentNode());
//	         
//	         rootElement.appendChild(doc.createElement("version")
//	        		 .appendChild(doc.createTextNode("0.0.0")).getParentNode());
//	         
//	         rootElement.appendChild(doc.createElement("description")
//	        		 .appendChild(doc.createTextNode("Package Description.")).getParentNode());
//	         
//	         rootElement.appendChild(doc.createElement("license")
//	        		 .appendChild(doc.createTextNode("no License")).getParentNode());
//	         
//	         rootElement.appendChild(doc.createElement("maintainerEmail")
//	        		 .appendChild(doc.createTextNode("chief@rubis.snu.ac.kr")).getParentNode());
//	         
//	         rootElement.appendChild(doc.createElement("maintainerName")
//	        		 .appendChild(doc.createTextNode("rubis")).getParentNode());
//	         
//	         rootElement.appendChild(doc.createElement("indentation")
//	        		 .appendChild(doc.createTextNode("tabs")).getParentNode());
//	         
//	         rootElement.appendChild(doc.createElement("rosHeader")
//	        		 .appendChild(doc.createTextNode("ros/ros.h")).getParentNode());
//	         
//	        
//	         // nodes
//	         Element nodes = doc.createElement("nodes");
//	         rootElement.appendChild(nodes);
//	         
//	         // node
//	         for(int i = 0; i < OSCARNodes.size(); i++) {
//	        	 System.out.println(OSCARNodes.get(i).toString());
//	        	 
//	        	 Element node = doc.createElement("node");
//	        	 
//	        	 // name
//	        	 node.appendChild(doc.createElement("name")
//		        		 .appendChild(doc.createTextNode(OSCARNodes.get(i).getName())).getParentNode());
//	        	 
//	        	 //TODO: custom messages
//	        	 node.appendChild(doc.createElement("additional_msgs"));
//	        	 
//	        	 //TODO: headers
//	        	 node.appendChild(doc.createElement("headers"));
//	        	 
//	        	 // inputs
//	        	 Element inputs =  doc.createElement("inputs");
//	        	 ArrayList<String> subscribes = OSCARNodes.get(i).getSubscribe();
//	        	 for(int j = 0; j < subscribes.size(); j++) {
//	        		 Element in =  doc.createElement("in");
//	        		 OSCARTopic subTopic = getSubscribedTopic(subscribes.get(j));
//	        		 
//	        		 // topic name
//	        		 in.appendChild(doc.createElement("subscribeTo")
//	        				 .appendChild(doc.createTextNode(subTopic.getName())).getParentNode());
//	        		 
//	        		 // topic message type
//	        		 in.appendChild(doc.createElement("type")
//	        				 .appendChild(doc.createTextNode(subTopic.getMsgType())).getParentNode());
//	        		 
//	        		//TODO: input callBackFunction
//	        		 in.appendChild(doc.createElement("callBackFunction"));
//	        		 
//	        		 inputs.appendChild(in);
//	        	 }
//	        	 node.appendChild(inputs);
//	        	 
//	        	// outputs
//	        	 Element outputs =  doc.createElement("outputs");
//	        	 ArrayList<String> publishes = OSCARNodes.get(i).getPublish();
//	        	 for(int j = 0; j < publishes.size(); j++) {
//	        		 Element out =  doc.createElement("out");
//	        		 OSCARTopic pubTopic = getPublishedTopic(publishes.get(j));
//	        		 
//	        		 // topic name
//	        		 out.appendChild(doc.createElement("name")
//	        				 .appendChild(doc.createTextNode(pubTopic.getName())).getParentNode());
//	        		 
//	        		//TODO: input type
//	        		 out.appendChild(doc.createElement("type")
//	        				 .appendChild(doc.createTextNode(pubTopic.getMsgType())).getParentNode());
//	        		 
//	        		//TODO: input callBackFunction
//	        		 out.appendChild(doc.createElement("queueSize"));
//	        		 
//	        		 outputs.appendChild(out);
//	        	 }
//	        	 
//	        	 node.appendChild(outputs);
//	        	 
//	        	 nodes.appendChild(node);
//	         }
	         

	         // write the content into xml file
	         TransformerFactory transformerFactory = TransformerFactory.newInstance();
	         Transformer transformer = transformerFactory.newTransformer();
	         DOMSource source = new DOMSource(doc);
	         StreamResult result = new StreamResult(new File("data.xml"));
	         transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	         transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
	         transformer.transform(source, result);
	         
	         // Output to console for testing
	         StreamResult consoleResult = new StreamResult(System.out);
	         transformer.transform(source, consoleResult);
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	}

	
	public Node makeNode(Document doc, String nodeName, String nodeContent) {
		return doc.createElement(nodeName).appendChild(doc.createTextNode(nodeContent)).getParentNode();
	}

	
}
