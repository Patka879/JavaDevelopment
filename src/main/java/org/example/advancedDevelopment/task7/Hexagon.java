package org.example.advancedDevelopment.task7;

public class Hexagon extends Shape {
    private double wallLength;

    public Hexagon(double wallLength) {
        this.wallLength = wallLength;
    }

    @Override
    public double calculatePerimeter() {
        return 6 * wallLength;
    }

    @Override
    public double calculateArea() {
        return ((3 * Math.sqrt(3) *
                (wallLength * wallLength)) / 2);
    }
}
