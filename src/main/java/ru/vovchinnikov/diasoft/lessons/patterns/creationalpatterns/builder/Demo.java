package ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.builder;

import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.builder.builders.CarBuilder;
import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.builder.builders.CarManualBuilder;
import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.builder.cars.Car;
import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.builder.cars.Manual;
import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.builder.director.Director;

/**
 * @author Ovchinnikov Viktor
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        // Директор получает объект конкретного строителя от клиента
        // (приложения). Приложение само знает какой строитель использовать,
        // чтобы получить нужный продукт.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // Готовый продукт возвращает строитель, так как Директор чаще всего не
        // знает и не зависит от конкретных классов строителей и продуктов.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Директор может знать больше одного рецепта строительства.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}