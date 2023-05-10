package org.example.advancedDevelopment.task7;

public class Rectangle extends Shape{
    private static double width;
    private static double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return 2*width + 2*height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
