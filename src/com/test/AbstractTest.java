package com.test;

abstract class Abstractclass{
    public void someMethod(){
        System.out.println("Hello");
    }
    abstract public void anotherMethod();
}
public class AbstractTest {
    public static void main(String args[])
    {
        //creation of object .........................

        Abstractclass obj = new Abstractclass(){
            public void anotherMethod(){
                System.out.println("Hello12222");
            }
        };
        obj.anotherMethod();
        obj.someMethod();
    }
}
