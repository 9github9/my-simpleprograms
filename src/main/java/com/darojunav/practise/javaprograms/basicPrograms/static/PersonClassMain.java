package com.amigoscode.methodprograms;

public class PersonClassMain {
    public static void main(String[] args) {
        //creating object for a class (Object is an instance of a class)
        /*
        in the below example
        -> PersonsclassBluePrint is the class
        -> naveen is the instance of the class or object of the class
        -> new PersonclassBluePrint is the assignment of newly created object to the class
         */
        PersonclassBluePrint naveen = new PersonclassBluePrint(1234);

        //Accessing instance variables using the created object(Naveen)
        naveen.age = 25;
        naveen.isOnshore = true;
        naveen.firstName = "Daroju Naveen Kumar";

        naveen.daysInYear = 200;

        //Accessing final varibale using the created object(Naveeen)
        System.out.println(naveen.numberOfSecondsPerMinute);

        //Accessing methods using the created object(Naveen)
        naveen.printSimpleString();

        //Accessing the static variables using the class name
        PersonclassBluePrint.daysInYear = 200;

        PersonclassBluePrint.printTest();

        PersonclassBluePrint.getTest();


        PersonClassMain personClassMain = new PersonClassMain();
        personClassMain.testStatic();

    }

    public void testStatic() {
        PersonclassBluePrint madhuri = new PersonclassBluePrint(666);
        madhuri.daysInYear = 244;
    }

}
