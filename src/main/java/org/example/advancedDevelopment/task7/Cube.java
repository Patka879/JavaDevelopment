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

    @Override
    public boolean fill(int water) {
        if (water > calculateVolume()) {
            System.out.println("Cube is over-filled");
            return false;
        } else if ( water < calculateVolume() ) {
            System.out.println("Cube is under-filled");
            return true;
        } else {
            System.out.println("Just enough water in the cube");
            return true;
        }
    }


}
