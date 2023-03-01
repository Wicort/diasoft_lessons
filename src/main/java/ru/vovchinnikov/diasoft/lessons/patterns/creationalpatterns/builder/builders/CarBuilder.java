package ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.builder.builders;

import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.builder.cars.Car;
import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.builder.cars.CarType;
import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.builder.components.Engine;
import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.builder.components.GPSNavigator;
import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.builder.components.Transmission;
import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.builder.components.TripComputer;

/**
 * @author Ovchinnikov Viktor
 * Конкретные строители реализуют шаги, объявленные в общем интерфейсе.
 */
public class CarBuilder implements Builder{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
