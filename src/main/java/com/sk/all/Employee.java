package com.sk.all;

import java.io.Serializable;

public class Employee extends SuperEmployee {
	public String firstName;
	private static final long serialVersionUID = 5462223600l;
}

class SuperEmployee implements Serializable {
	public String lastName;
	public static String companyName;
	public transient String address;
	public static transient String companyCEO;
}
