package com.nimsum;

public class Main {

    public static void main(String[] args) {
        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min value = " + minFloatValue);
        System.out.println("Float max value = " + maxFloatValue);

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("double min value = " + minDoubleValue);
        System.out.println("double max value = " + maxDoubleValue);

        int intValue = 5;
        float floatValue = 5f / 3f;
        double doubleValue = 5d / 3d; // preferred data type to use for precision
        System.out.println("Float " + floatValue);
        System.out.println("Double " + doubleValue);

        // Pounds to Kilograms:
        double pound = 200d;
        double kilogram = pound * 0.45359237;
        System.out.println(pound + " pounds is = " + kilogram + " kilograms");
    }
}
