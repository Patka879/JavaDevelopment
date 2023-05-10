//import org.example.advancedDevelopment.task5.Car;
//import org.example.advancedDevelopment.task5.CarService;
//import org.example.advancedDevelopment.task5.EngineType;
//import org.example.advancedDevelopment.task5.Manufacturer;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Task5Tests {
//    private CarService carService;
//    private List<Car> carsList = new ArrayList<>();
//    Car car1 = new Car("Volvo", "XC90", 2020, volvoManufacturers, EngineType.S6, 500000);
//    @BeforeAll
//    public void setup() {
//        Manufacturer manufacturer1 = new Manufacturer("Geely Automobile", 1999, "Sweden");
//        Manufacturer manufacturer2 = new Manufacturer("BMW Motorrad", 1923, "Germany");
//        Manufacturer manufacturer3 = new Manufacturer("BMW Group Plants", 1967, "Germany");
//
//        ArrayList<Manufacturer> bmwManufacturers = new ArrayList<>();
//        bmwManufacturers.add(manufacturer2);
//        bmwManufacturers.add(manufacturer3);
//
//        ArrayList<Manufacturer> volvoManufacturers = new ArrayList<>();
//        volvoManufacturers.add(manufacturer1);
//
//        ArrayList<Manufacturer> allManufacturers = new ArrayList<>();
//        allManufacturers.add(manufacturer1);
//        allManufacturers.add(manufacturer2);
//        allManufacturers.add(manufacturer3);
//
//        Car car1 = new Car("Volvo", "XC90", 2020, volvoManufacturers, EngineType.S6, 500000);
//        Car car2 = new Car("BMW", "X3", 2010, bmwManufacturers, EngineType.V12, 203922);
//        Car car3 = new Car("Toyota", "Yaris", 1992, bmwManufacturers, EngineType.V12, 4000);
//        Car car4 = new Car("Renault", "Clio", 1998, allManufacturers, EngineType.S3, 20000);
//
//        carService.addCar(car1);
//        carService.addCar(car2);
//        carService.addCar(car3);
//        carService.addCar(car4);
//    }
//
//    @Test
//    public void addingCars() {
//        carService.addCar(car1);
//        Assertions.assertEquals(3, carService.getCars().size());
//    }
//}
