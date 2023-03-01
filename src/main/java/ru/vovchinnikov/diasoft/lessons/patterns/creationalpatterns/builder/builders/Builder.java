package ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.builder.builders;

import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.builder.cars.CarType;
import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.builder.components.Engine;
import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.builder.components.GPSNavigator;
import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.builder.components.Transmission;
import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.builder.components.TripComputer;

/**
 * @author Ovchinnikov Viktor
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
