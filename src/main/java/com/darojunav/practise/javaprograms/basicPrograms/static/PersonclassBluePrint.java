package com.amigoscode.methodprograms;

public class PersonclassBluePrint {

    final int ssn;

    /*  Key points:
      final variable always needs initialization, if you don’t initialize it would throw a compilation error. have a look at below example-

      public class MyClass{
          public static final int MY_VAR;
      }
      Error: variable MY_VAR might not have been initialized
  */

    PersonclassBluePrint() {

    }

    PersonclassBluePrint(int ssn) {
        this.ssn = ssn;
    }


    //instance variables or fields in class
    String firstName;
    String LastName = "Daroju";
    int age;
    boolean isOnshore;

    //final variable(any constant should be declared as final)
    final int numberOfSecondsPerMinute = 60;

    //getters and setters methods
    //instance methods without return value
    public void printSimpleString() {
        System.out.println("Simple Void Method Accessed");
    }

    //instance methods without return value
    public String getSimpleString() {
        return "Simple Void Method Accessed";
    }

    //Static variables
    public static int daysInYear;

    //Static method without return value
    public static void printTest() {
        System.out.println("testing static");
    }

    //Static method without return value
    public static String getTest() {
        return "testing static";
    }
}
