package org.example.advancedDevelopment.task6;

public class MeasurementConverter {
    public static double convert(int value, ConversionType conversionType){
        return value * conversionType.getConversionValue();
    }
}
