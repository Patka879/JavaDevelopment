package org.example.advancedDevelopment.task5;

import java.util.*;
import java.util.stream.Collectors;

public class CarService {

    Scanner scanner = new Scanner(System.in);
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

    public List<Car> carsWithV12Engines(ArrayList<Car> carList) {
        return carList.stream()
                .filter(car -> car.getEngineType() == EngineType.V12)
                .toList();
    }

    public List<Car> carsBeforeYear(ArrayList<Car> carList) {
        return carList.stream()
                .filter(car -> car.getYearOfProduction() < 1999)
                .toList();
    }

    public Optional<Car> getMostExpensiveCar(ArrayList<Car> carList) {
        return carList.stream()
                .sorted(Comparator.comparingInt(Car::getPrice).reversed())
                .findFirst();
    }

    public Optional<Car> getTheCheapestCar(ArrayList<Car> carList) {
        return carList.stream()
                .sorted(Comparator.comparingInt(Car::getPrice))
                .findFirst();
    }

    public List<Car> getCarsWithAtLeastThreeManufacturers(ArrayList<Car> carList) {
        return carList.stream()
                .filter(car -> car.getManufacturerList().size() >= 3)
                .toList();
    }

    public List<Car> sortCars(ArrayList<Car> carList) {

        System.out.println("Type 'A' for ascending sorting, type 'D' for descending sorting");
        String input = scanner.nextLine();

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

    public boolean isCarOnTheList(ArrayList<Car> carList) {
        System.out.println("Enter name of the car You are looking for:");
        String carName = scanner.nextLine();

        for (Car car : carList) {
            if (carName.equalsIgnoreCase(car.getName())) {
                return true;
            }
        }
        return false;
    }

//    public List<Car> getCarByManufacturer(ArrayList<Car> carList) {
//
//    }


    @Override
    public String toString() {
        return "CAR SERVICE " + "\n" + " CARS: " + carList;
    }

}
