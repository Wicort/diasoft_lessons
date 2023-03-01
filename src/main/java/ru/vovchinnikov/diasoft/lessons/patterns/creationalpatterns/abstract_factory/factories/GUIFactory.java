package ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.abstract_factory.factories;

import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.abstract_factory.buttons.Button;
import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.abstract_factory.checkboxes.Checkbox;

/**
 * @author Ovchinnikov Viktor
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
