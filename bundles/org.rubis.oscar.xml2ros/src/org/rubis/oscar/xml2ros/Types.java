package org.rubis.oscar.xml2ros;

import java.util.ArrayList;
import java.util.HashMap;

public class Types {
	 public static final HashMap<String, Type> typeMap;
	    private static final ArrayList<String> allTypeNames;
	    
	    static
	    {
	        allTypeNames = new ArrayList<String>();
	        allTypeNames.add("Bool");
	        allTypeNames.add("Byte");
	        allTypeNames.add("ByteMultiArray");
	        allTypeNames.add("Char");
	        allTypeNames.add("ColorRGBA");
	        allTypeNames.add("Duration");
	        allTypeNames.add("Empty");
	        allTypeNames.add("Float32");
	        allTypeNames.add("Float32MultiArray");
	        allTypeNames.add("Float64");
	        allTypeNames.add("Float64MultiArray");
	        allTypeNames.add("Header");
	        allTypeNames.add("Int16");
	        allTypeNames.add("Int16MultiArray");
	        allTypeNames.add("Int32");
	        allTypeNames.add("Int32MultiArray");
	        allTypeNames.add("Int64");
	        allTypeNames.add("Int64MultiArray");
	        allTypeNames.add("Int8");
	        allTypeNames.add("Int8MultiArray");
	        allTypeNames.add("MultiArrayDimension");
	        allTypeNames.add("MultiArrayLayout");
	        allTypeNames.add("String");
	        allTypeNames.add("Time");
	        allTypeNames.add("UInt16");
	        allTypeNames.add("UInt16MultiArray");
	        allTypeNames.add("UInt32");
	        allTypeNames.add("UInt32MultiArray");
	        allTypeNames.add("UInt64");
	        allTypeNames.add("UInt64MultiArray");
	        allTypeNames.add("UInt8");
	        allTypeNames.add("UInt8MultiArray");

	        typeMap = new HashMap<String, Type>();
	        for(int i = 0; i < allTypeNames.size(); i++)
	            typeMap.put(allTypeNames.get(i), new Type(allTypeNames.get(i), "std_msgs"));
	    }

	    public static class Type
	    {
	        String typeName = "";
	        String namespace = "";

	        public Type(String typeName, String namespace)
	        {
	            this.typeName = typeName;
	            this.namespace = namespace;
	        }

	        public String getConstIdentifier()
	        {
	            return "const " + getTypeIdentifier() + "::ConstPtr& msg";
	        }

	        public String getTypeIdentifier()
	        {
	            return namespace + "::" + typeName;
	        }

	        public String getInclude()
	        {
	            return "\"" + namespace + "/" + typeName + ".h\"";
	        }
	    }
}
