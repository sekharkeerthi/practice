package com.sk.io;

import java.io.Serializable;

public class Employee extends superEmployee {
	public String firstName;
	private static final long serialVersionUID = 5462223600l;
}

class superEmployee implements Serializable {
	public String lastName;
	static String companyName;
	transient String address;
	static transient String companyCEO;
}
