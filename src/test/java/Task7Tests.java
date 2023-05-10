
import org.example.advancedDevelopment.task7.*;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Task7Tests {

    @Test
    public void checkRectanglePerimeter(){
        //given
        Rectangle rectangle = new Rectangle(20.0, 10.0);
        //when
        double result = rectangle.calculatePerimeter();
        //then
        assertThat(result).isEqualTo(60);
    }

    @Test
    public void checkRectangleArea(){
        //given
        Rectangle rectangle = new Rectangle(20.0, 10.0);
        //when
        double result = rectangle.calculateArea();
        //then
        assertThat(result).isEqualTo(200);
    }

    @Test
    public void testCalculateAreaOfHexagon() {
        Hexagon hexagon = new Hexagon(4.0);
        double result = hexagon.calculateArea();
        assertThat(result).isEqualTo(41.569219381653056);
    }

    @Test
    public void testCalculatePerimeterOfTriangle() {
        Triangle triangle = new Triangle(4.0, 5.0, 10);
        double result = triangle.calculatePerimeter();
        assertThat(result).isEqualTo(19);
    }
    @Test
    public void testCalculateAreaOfTriangle() {
        Triangle triangle = new Triangle(4.0, 5.0);
        double result = triangle.calculateArea();
        assertThat(result).isEqualTo(10);
    }

    @Test
    public void testCalculatePerimeterOfCube() {
        Cube cube = new Cube(20);
        double result = cube.calculatePerimeter();
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void testCalculateAreaOfCube() {
        Cube cube = new Cube(20);
        double result = cube.calculateArea();
        assertThat(result).isEqualTo(2400);
    }

    @Test
    public void testCalculateVolumeOfCube() {
        Cube cube = new Cube(10);
        double result = cube.calculateVolume();
        assertThat(result).isEqualTo(1000);
    }

    @Test
    public void testCalculatePerimeterOfCone() {
        Cone cone = new Cone(10, 20);
        double result = cone.calculatePerimeter();
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void testFillingTheConeWithWaterBelowTheLine() {
        Cone cone = new Cone(10,20);
        boolean result = cone.fill(200);
        assertThat(result).isTrue();
    }

    @Test
    public void testFillingTheCubeShapeWithTooMuchWater() {
        Cube cube = new Cube(10);
        boolean result = cube.fill(4000);
        assertThat(result).isFalse();
    }

    @Test
    public void testFillingTheCubeShapeWithJustEnoughWater() {
        Cube cube = new Cube(10);
        boolean result1 = cube.fill(400);
        assertThat(result1).isTrue();
        boolean result2 = cube.fill(600);
        assertThat(result2).isTrue();
    }

}
