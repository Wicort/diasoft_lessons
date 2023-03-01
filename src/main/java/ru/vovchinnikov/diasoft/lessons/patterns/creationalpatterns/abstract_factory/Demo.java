package ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.abstract_factory;

import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.abstract_factory.app.Application;
import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.abstract_factory.factories.GUIFactory;
import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.abstract_factory.factories.MacOsFactory;
import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.abstract_factory.factories.WindowsFactory;

import java.util.Locale;

/**
 * @author Ovchinnikov Viktor
 * Демо-класс. Здесь всё сводится воедино
 */
public class Demo {
    /**
     * Приложение выбирает тип и создает конкретные фабрики динамически мсходя
     * из конфигурации или окружения
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase(Locale.ROOT);

        if (osName.contains("mac")){
            factory = new MacOsFactory();
        } else {
            factory = new WindowsFactory();
        }

        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
