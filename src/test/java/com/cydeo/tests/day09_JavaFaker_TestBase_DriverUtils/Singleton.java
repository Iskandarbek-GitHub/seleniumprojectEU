package com.cydeo.tests.day09_JavaFaker_TestBase_DriverUtils;

public class Singleton {

    // #1. create private constructor
    private Singleton(){}

    // #2. create private static String
    private static String word;

    public static String getWord(){
        if (word == null){
            System.out.println("First time call. Word object is null." +
                    "Assigning value to it now!");
            word = "something";
        }else {
            System.out.println("Word already has value.");
        }
        return word;
    }
}