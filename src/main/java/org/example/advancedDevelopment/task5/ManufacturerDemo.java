package org.example.advancedDevelopment.task5;

import java.util.ArrayList;

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
        Manufacturer manufacturer1 = new Manufacturer("Geely Automobile", 1999, "Sweden");
        Manufacturer manufacturer2 = new Manufacturer("BMW Motorrad", 1923, "Germany");
        Manufacturer manufacturer3 = new Manufacturer("BMW Group Plants", 1967, "Germany");

        ArrayList<Manufacturer> bmwManufacturers = new ArrayList<>();
        bmwManufacturers.add(manufacturer2);
        bmwManufacturers.add(manufacturer3);

        ArrayList<Manufacturer> volvoManufacturers = new ArrayList<>();
        volvoManufacturers.add(manufacturer1);

        ArrayList<Manufacturer> allManufacturers = new ArrayList<>();
        allManufacturers.add(manufacturer1);
        allManufacturers.add(manufacturer2);
        allManufacturers.add(manufacturer3);

        Car car1 = new Car("Volvo", "XC90", 2020, volvoManufacturers, EngineType.S6, 500000);
        Car car2 = new Car("BMW", "X3", 2010, bmwManufacturers, EngineType.V12, 203922);
        Car car3 = new Car("Toyota", "Yaris", 1992, bmwManufacturers, EngineType.V12, 4000);
        Car car4 = new Car("Renault", "Clio", 1998, allManufacturers, EngineType.S3, 20000);

        ArrayList<Car> carsList = new ArrayList<>();

        CarService carService = new CarService(carsList);
        carService.addCar(car1);
        carService.addCar(car2);
        carService.addCar(car3);
        carService.addCar(car4);

        System.out.println("=======ONLY V12 ENGINES========");
        System.out.println(carService.carsWithV12Engines(carsList));
        System.out.println("=======CARS MANUFACTURED BEFORE 1999");
        System.out.println(carService.carsBeforeYear(carsList));
        System.out.println("=======MOST EXPENSIVE CAR======");
        System.out.println(carService.getMostExpensiveCar(carsList));
        System.out.println("=======THE CHEAPEST CAR======");
        System.out.println(carService.getTheCheapestCar(carsList));
        System.out.println("=======AT LEAST 3 MANUFACTURERS");
        System.out.println(carService.getCarsWithAtLeastThreeManufacturers(carsList));
        System.out.println("=======SORTING METHOD");
        System.out.println(carService.sortCars(carsList));

    }
}
