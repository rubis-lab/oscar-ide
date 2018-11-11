package org.rubis.oscar.xml2ros;

public class CallBack {
	String name = "", type = "", indent = "";

    public CallBack(String name, String type, String indent)
    {
        this.name = name;
        this.type = type;
        this.indent = indent;
    }

    public String getPrototype()
    {
        return "void " + name + "(" + Types.typeMap.get(type).getConstIdentifier() + ");";
    }

    public String getFunction()
    {
        return "void " + name + "(" + Types.typeMap.get(type).getConstIdentifier() + ")\n{\n" + indent + "ROS_INFO(\"" + name + " function called!\");\n" + indent + "// Put your code here\n}";
    }
}
