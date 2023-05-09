package org.example.advancedDevelopment.task5;

import java.util.*;
import java.util.stream.Stream;

public class CarService<carList> {

    private ArrayList<Car> carList;

    public CarService(ArrayList<Car> carList) {
        this.carList = carList;
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public void removeCar(Car car) {
        carList.remove(car);
    }

    public ArrayList<Car> getListOfCars() {
        return carList;
    }

    public List<Car> carsWithV12Engines() {
        return carList.stream()
                .filter(car -> car.getEngineType() == EngineType.V12)
                .toList();
    }

    public List<Car> carsBeforeYear() {
        return carList.stream()
                .filter(car -> car.getYearOfProduction() < 1999)
                .toList();
    }

    public Optional<Car> getMostExpensiveCar() {
        return carList.stream()
                .sorted(Comparator.comparingInt(Car::getPrice).reversed())
                .findFirst();
    }

    public Optional<Car> getTheCheapestCar() {
        return carList.stream()
                .sorted(Comparator.comparingInt(Car::getPrice))
                .findFirst();
    }

    public List<Car> getCarsWithAtLeastThreeManufacturers() {
        return carList.stream()
                .filter(car -> car.getManufacturerList().size() >= 3)
                .toList();
    }

    public List<Car> sortCars(String input) {

        if (input.equalsIgnoreCase("A")) {
            return carList.stream()
                    .sorted(Comparator.comparing(Car::getName))
                    .toList();
        } else if (input.equalsIgnoreCase("D")) {
            return carList.stream()
                    .sorted(Comparator.comparing(Car::getName).reversed())
                    .toList();
        }
        return Collections.emptyList();
    }

    public boolean isCarOnTheList(String name) {
        for (Car car : carList) {
            if (name.equalsIgnoreCase(car.getName())) {
                return true;
            }
        }
        return false;
    }

    public List<Car> getCarByManufacturer(Manufacturer manufacturer) {
        return carList.stream()
                .filter(car -> car.getManufacturerList()
                        .stream()
                        .anyMatch(m -> m.equals(manufacturer))
                )
                .toList();
    }

    //returning a list of cars produced by a manufacturer with a
    // founding year <,>,<=,>=,=,!= from the specified year.

    public List<Car> getCarsByFoundingYear(Manufacturer manufacturer, int year) {
        List<Car> carsByManufacturer =  carList.stream()
                                                .filter(car -> car.getManufacturerList()
                                                        .stream()
                                                        .anyMatch(m -> m.equals(manufacturer))
                                                )
                                                .toList();

        return carsByManufacturer.stream()
                .filter(car -> car.getYearOfProduction() <= year)
                .toList();
    }


    @Override
    public String toString() {
        return "CAR SERVICE " + "\n" + " CARS: " + carList;
    }

}
