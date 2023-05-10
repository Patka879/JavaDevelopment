package org.example.advancedDevelopment.task7;

public class Triangle extends Shape {
    private double base;
    private double wall1;
    private double wall2;
    private double height;

    public Triangle(double base, double wall1, double wall2) {
        this.base = base;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.height = height;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculatePerimeter() {
        return base + wall1 + wall2;
    }
    @Override
    public double calculateArea() {
        return (base * height) /2;
    }
}
