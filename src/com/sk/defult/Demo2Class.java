package com.sk.defult;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo2Class {
                public static void main(String[] args) {
                                Employee emp = null;
                                try {
                                                FileInputStream fileIn = new FileInputStream("./employee.txt");
                                                ObjectInputStream in = new ObjectInputStream(fileIn);
                                                emp = (Employee) in.readObject();
                                                in.close();
                                                fileIn.close();
                                } catch (IOException i) {
                                                i.printStackTrace();
                                                return;
                                } catch (ClassNotFoundException c) {
                                                System.out.println("Employee class not found");
                                                c.printStackTrace();
                                                return;
                                }
                                System.out.println("First Name of Employee: " + emp.firstName);
                                System.out.println("Last Name of Employee: " + emp.lastName);
                                System.out.println("Company Name: "+emp.companyName);
                                System.out.println("Company CEO: "+emp.companyCEO);
                                System.out.println("Company Address: "+emp.address);
                }
}