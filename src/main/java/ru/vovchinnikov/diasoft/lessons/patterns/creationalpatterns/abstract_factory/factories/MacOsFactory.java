package ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.abstract_factory.factories;

import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.abstract_factory.buttons.Button;
import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.abstract_factory.buttons.MacOSButton;
import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.abstract_factory.checkboxes.Checkbox;
import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.abstract_factory.checkboxes.MacOSCheckbox;

/**
 * @author Ovchinnikov Viktor
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации
 */
public class MacOsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
