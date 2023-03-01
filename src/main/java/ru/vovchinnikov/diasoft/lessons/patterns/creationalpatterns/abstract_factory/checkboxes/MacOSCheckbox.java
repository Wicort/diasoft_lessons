package ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.abstract_factory.checkboxes;

/**
 * @author Ovchinnikov Viktor
 * Все семейства продуктов имеют одинаковые вариации (MacOS/Windows).
 *
 * Вариация чекбокса под MacOS.
 */
public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox");
    }
}
