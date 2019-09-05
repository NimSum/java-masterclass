package com.nimsum;

public class Main {

    public static void main(String[] args) {

        // INTEGERS - occupies 32 bits
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        int myMaxIntTest = 2_147_483_647; // use "_" for better readability
        System.out.println("INT min value = " + myMinIntValue);
        System.out.println("INT max value = " + myMaxIntValue);
        System.out.println("Bad int max value = " + (myMaxIntValue + 1)); // causes overflow - exceed max data value
        System.out.println("Bad int min value = " + (myMinIntValue - 1)); // causes underflow - exceed min data value

        // BYTES - occupies 8 bits
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("BYTE min value = " + minByteValue);
        System.out.println("BYTE max value = " + maxByteValue);

        // SHORT - occupies 16 bits
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("SHORT min value = " + minShortValue);
        System.out.println("SHORT max value = " + maxShortValue);

        // LONG
        long longValue = 1000L; // "L" indicates that it is a long value
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("LONG min value = " + minLongValue);
        System.out.println("LONG max value = " + maxLongValue);
    }
}
