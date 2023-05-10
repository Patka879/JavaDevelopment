package org.example.advancedDevelopment.task6;

public enum ConversionType {
    METERS_TO_YARDS (1.0936133),
    YARDS_TO_METERS (0.9144),
    CENTIMETERS_TO_ICHES(0.3937),
    INCHES_TO_CENTIMETERS(2.54),
    KILOMETERS_TO_MILES(0.621371),
    MILES_TO_KILOMETERS(1.609344);

    public double conversionValue;
    private ConversionType(double conversionValue) {
        this.conversionValue = conversionValue;
    }

    public double getConversionValue() {
        return conversionValue;
    }
}