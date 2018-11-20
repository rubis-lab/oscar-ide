package org.rubis.oscar.oscar2xml;

import java.util.ArrayList;

public class OSCARTopic {
	String xsitype;
	ArrayList<String> publish;
	ArrayList<String> subscribe;
	String constraints;
	String id;
	String name;
	String msg;
	String msgType;
	
	public OSCARTopic(String xsitype, ArrayList<String> publish, ArrayList<String> subscribe, String constraints, String id,
			String name, String msg, String msgType) {
		super();
		this.xsitype = xsitype;
		this.publish = publish;
		this.subscribe = subscribe;
		this.constraints = constraints;
		this.id = id;
		this.name = name;
		this.msg = msg;
		this.msgType = msgType;
	}

	public String getXsitype() {
		return xsitype;
	}

	public ArrayList<String> getPublish() {
		return publish;
	}

	public ArrayList<String> getSubscribe() {
		return subscribe;
	}

	public String getConstraints() {
		return constraints;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getMsg() {
		return msg;
	}

	public String getMsgType() {
		return msgType;
	}

	@Override
	public String toString() {
		return "OSCARTopic [xsitype=" + xsitype + ", publish=" + publish + ", subscribe=" + subscribe + ", constraints="
				+ constraints + ", id=" + id + ", name=" + name + ", msg=" + msg + ", msgType=" + msgType + "]";
	}
}

