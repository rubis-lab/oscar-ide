package org.rubis.oscar.xml2ros;

public class Input {
	String subscribeTo, type, callBackFunction;

    public Input(String subscribeTo, String type, String callBackFunction)
    {
        this.subscribeTo = subscribeTo;
        this.type = type;
        this.callBackFunction = callBackFunction;
    }
}
