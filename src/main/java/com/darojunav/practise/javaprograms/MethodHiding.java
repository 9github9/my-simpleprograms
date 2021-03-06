package com.darojunav.practise.javaprograms;

public class MethodHiding {

    public static void main(String args[]) {

        Screen scrn = new Screen(); // will call parent

        ColorScreen scrnc = new ColorScreen(); // will call child

        Screen scrncc = new ColorScreen(); // will call the parent


        //if we can  override static , this should call method from Child class
        scrn.show(); //IDE will show warning, static method should be called from classname

        scrnc.show();

        scrncc.show();
    }
}

class Screen {

    /*
     * public static method which can not be overridden in Java
     */
    public static void show() {
        System.out.println("Static method from parent class");
    }
}

class ColorScreen extends Screen {
    /*
     * static method of same name and method signature as existed in super
     * class, this is not method overriding instead this is called
     * method hiding in Java
     */
    public static void show() {
        System.out.println("Overridden static method in Child Class in Java");
    }
}

