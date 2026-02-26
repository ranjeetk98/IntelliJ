package com.test;

abstract class Abstractclass{
    public void someMethod(){
        System.out.println("Hello");
    }

    abstract public void anotherMethod();
}

class TestAbstract extends Abstractclass{

    @Override
    public void anotherMethod() {
        System.out.println("Another Method of TestAbstract class");
    }
}

public class AbstractTest {
    public static void main(String[] args)
    {
        //creation of object .........................

        Abstractclass obj = new Abstractclass(){
            public void anotherMethod(){
                System.out.println("Another Method of Object");
            }
        };
        obj.anotherMethod();
        obj.someMethod();

        TestAbstract t = new TestAbstract();
        t.anotherMethod();
    }
}
