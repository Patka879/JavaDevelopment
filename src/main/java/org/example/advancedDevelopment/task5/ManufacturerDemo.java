package org.example.advancedDevelopment.task5;

/**
 * Create a Manufacturer class that will contain fields: name, year of establishment, country.
 * Include all necessary methods and constructor parameters. Implement the hashCode() and equals()
 * methods.
 *
 * Create a Car class that will contain fields: name, model, price, year of production, list
 * of manufacturers (Manufacturer), and engine type (represented as an enum class,
 * e.g. V12, V8, V6, S6, S4, S3). Include all necessary methods and constructor parameters.
 * Implement the hashCode() and equals() methods.
 */

public class ManufacturerDemo {
    public static void main(String[] args) {
        Manufacturer manufacturer = new Manufacturer("Geely Automobile", 1999, "Sweden");

    }
}
