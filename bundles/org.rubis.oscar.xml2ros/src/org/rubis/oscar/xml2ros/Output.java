package org.rubis.oscar.xml2ros;

public class Output {
	String name, type;
    int queueSize;

    public Output(String name, String type, int queueSize)
    {
        this.name = name;
        this.type = type;
        this.queueSize = queueSize;
    }

    public Output(String name, String type, String queueSize)
    {
        this.name = name;
        this.type = type;
        this.queueSize = Integer.parseInt(queueSize);
    }
}
