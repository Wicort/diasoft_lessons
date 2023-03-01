package ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.abstract_factory.checkboxes;

/**
 * @author Ovchinnikov Viktor
 * Все семейства продуктов имеют одинаковые вариации (MacOS/Windows).
 *
 * Вариация чекбокса под Windows.
 */
public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox");
    }
}
