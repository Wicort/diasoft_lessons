package ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.abstract_factory.factories;

import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.abstract_factory.buttons.Button;
import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.abstract_factory.buttons.WindowsButton;
import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.abstract_factory.checkboxes.Checkbox;
import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.abstract_factory.checkboxes.WindowsCheckbox;

/**
 * @author Ovchinnikov Viktor
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации
 */
public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
