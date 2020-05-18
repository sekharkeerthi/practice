package com.sk.reflection;

public class InnerclassWithReflectionTest {
   public static void main(String args[]) {
      try {
         InnerClass inner = (InnerClass) InnerClass.class.newInstance();
         inner.test();
      } catch(Exception e) {
         e.printStackTrace();
      }
   }
   // inner class
   static class InnerClass {
      public void test() {
         System.out.println("Welcome to TutorialsPoint !!!");
      }
   }
}