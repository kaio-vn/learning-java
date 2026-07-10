package exercises.oop.test;

import exercises.oop.domain.Car;

public class CarTest {
    static void main(String[] args) {

        Car car1 = new Car();

        car1.name = "Mustang";
        car1.model = "GT";
        car1.age = 1970;

        System.out.println(car1.name + " " + car1.model + " " + car1.age );

        Car car2 = new Car();

        car2.name = "Audi ";
        car2.model = "A3";
        car2.age = 2021;

        System.out.println(car2.name + " " + car2.model + " " + car2.age );
    }
}
