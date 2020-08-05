package com.sk.java8;

@FunctionalInterface 
interface MyInterface{  
    void display(String say);  
}  
class Hello{  
    public Hello(String say){  
        System.out.print(say);  
    }  
} 

public class MethodReferenceDemoConstructor {
	public static void main(String[] args) {
		//Method reference to a constructor
        MyInterface ref = Hello::new;  
        ref.display("Hello World!");  
	}
}
