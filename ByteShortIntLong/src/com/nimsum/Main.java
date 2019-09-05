package com.nimsum;

public class Main {

    public static void main(String[] args) {
        // INTEGERS
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        int myMaxIntTest = 2_147_483_647; // use "_" for better readability
        System.out.println("INT min value = " + myMinIntValue);
        System.out.println("INT max value = " + myMaxIntValue);
        System.out.println("Bad int max value = " + (myMaxIntValue + 1)); // causes overflow - exceed max data value
        System.out.println("Bad int min value = " + (myMinIntValue - 1)); // causes underflow - exceed min data value
    }
}
