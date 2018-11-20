package org.rubis.oscar.oscar2xml;

public class OSCARLink {
	String xsitype;
	String source;
	String target;
	
	public OSCARLink(String xsitype, String source, String target) {
		super();
		this.xsitype = xsitype;
		this.source = source;
		this.target = target;
	}

	public String getXsitype() {
		return xsitype;
	}

	public String getSource() {
		return source;
	}

	public String getTarget() {
		return target;
	}

	@Override
	public String toString() {
		return "OSCARLink [xsitype=" + xsitype + ", source=" + source + ", target=" + target + "]";
	}
	
}
