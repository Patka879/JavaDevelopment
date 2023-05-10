package org.example.advancedDevelopment.task7;

public class Cone extends ThreeDShape {

    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    @Override
    public double calculatePerimeter() {
        System.out.println("Perimeter not existing");
        return 0;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }

    @Override
    public double calculateVolume() {
        return Math.PI * radius * radius * height / 3.0;
    }
}
