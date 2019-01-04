package org.rubis.oscar.oscar2xml;

import java.util.ArrayList;

public class OSCARNode {
	String xsitype;
	ArrayList<String> publish;
	ArrayList<String> subscribe;
	String constraints;
	String name;
	String group;
	ArrayList<String> members;
	public OSCARNode() {
		
	}
	public OSCARNode(String xsitype, ArrayList<String> publish, ArrayList<String> subscribe, String constraints,
			String name, String group, ArrayList<String> members) {
		super();
		this.xsitype = xsitype;
		this.publish = publish;
		this.subscribe = subscribe;
		this.constraints = constraints;
		this.name = name;
		this.group = group;
		this.members = members;
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
	public String getName() {
		return name;
	}
	public String getGroup() {
		return group;
	}
	public ArrayList<String> getMembers() {
		return members;
	}
	@Override
	public String toString() {
		return "OSCARNode [xsitype=" + xsitype + ", publish=" + publish + ", subscribe=" + subscribe + ", constraints="
				+ constraints + ", name=" + name + ", group=" + group + ", members=" + members+ "]";
	}
}

