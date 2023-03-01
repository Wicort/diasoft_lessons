package ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.builder.components;

import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.builder.cars.Car;

/**
 * @author Ovchinnikov Viktor
 * Одна из фишек автомобиля
 */
public class TripComputer {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
