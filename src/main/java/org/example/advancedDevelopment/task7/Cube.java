package org.example.advancedDevelopment.task7;

public class Cube extends ThreeDShape {
    public double wall;

    public Cube(double wall) {
        this.wall = wall;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("Perimeter not existing");
        return 0;
    }

    @Override
    public double calculateArea() {
        return wall * wall * 6;
    }

    @Override
    public double calculateVolume() {
        return wall * wall * wall;
    }
}
