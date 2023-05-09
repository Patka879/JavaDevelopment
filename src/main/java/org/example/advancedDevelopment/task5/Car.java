package org.example.advancedDevelopment.task5;

import java.util.ArrayList;
import java.util.Objects;

public class Car {
    private String name;
    private String model;
    private int price;
    private int yearOfProduction;
    private ArrayList<Manufacturer> manufacturerList;
    private Enum engineType;

    public Car(String name, String model, int yearOfProduction, ArrayList<Manufacturer> manufacturerList, Enum engineType, int price) {
        this.name = name;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.manufacturerList = manufacturerList;
        this.engineType = engineType;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Enum getEngineType() {
        return engineType;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getPrice() {
        return price;
    }

    public ArrayList<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfProduction == car.yearOfProduction && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(manufacturerList, car.manufacturerList) && Objects.equals(engineType, car.engineType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, yearOfProduction, manufacturerList, engineType);
    }

    @Override
    public String toString() {
        return "CAR " + "\n" +
                "Name: " + name + "\n" +
                "Model: " + model + "\n" +
                "Year Of Production: " + yearOfProduction + "\n" +
                "Manufacturers List: " + manufacturerList + "\n" +
                "Engine Type: " + engineType + '\n' +
                "Price: " + price + " PLN";
    }
}
