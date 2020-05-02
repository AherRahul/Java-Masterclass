package com.company;

public class Main {

    public static void main(String[] args) {
        //int, byte, short, float, double, long, string, char are the data-types available in Java
        int myValues = 10000;

        //Integer Is Wrapper Class for int data type
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        //Min Value = -2147483648 and Max value = 2147483647
        System.out.println("Min Value = " + myMinIntValue + " and Max value = " + myMaxIntValue);

        //Busted max value = -2147483648 ===> OverFlow
        System.out.println("Busted max value = " + (myMaxIntValue + 1));

        //Busted min value= 2147483647 ===> UnderFlow
        System.out.println("Busted min value= " + (myMinIntValue - 1));
    }
}
