package org.example.advancedDevelopment.task7;

public class Cone extends ThreeDShape {

    private double radius;
    private double height;

    private int waterInCone;

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

    @Override
    public boolean fill(int amountOfWater) {
        waterInCone += amountOfWater;

        if (waterInCone > calculateVolume()) {
            System.out.println("Cone is over-filled");
            return false;
        } else if (waterInCone < calculateVolume() ) {
            System.out.println("Cone is under-filled");
            return true;
        } else {
            System.out.println("Just enough water to fill the cone");
            return true;
        }
    }
}
