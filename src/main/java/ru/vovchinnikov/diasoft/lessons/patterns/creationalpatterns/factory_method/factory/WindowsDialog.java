package ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.factory_method.factory;

import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.factory_method.buttons.Button;
import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.factory_method.buttons.WindowsButton;

/**
 * @author Ovchinnikov Viktor
 */
public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
