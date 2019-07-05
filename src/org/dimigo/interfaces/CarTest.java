package org.dimigo.interfaces;

public class CarTest {

    public static void main(String[] args) {
        Car car = new Car();

        car.setEngine(new BenzIEngine());
        car.start();
        car.stop();

        System.out.println("=== 엔진 교체 ===");

        car.setEngine(new BMWIEngine());
        car.start();
        car.stop();
    }

}
