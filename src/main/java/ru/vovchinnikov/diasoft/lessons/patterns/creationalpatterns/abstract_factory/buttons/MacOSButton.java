package ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.abstract_factory.buttons;

/**
 * @author Ovchinnikov Viktor
 * Все семейства продуктов имеют одни и те же вариации (MacOS/Windows).
 *
 * Это вариант кнопки под MacOS.
 */
public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton");
    }
}
