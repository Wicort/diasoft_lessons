package ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.factory_method.factory;

import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.factory_method.buttons.Button;
import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.factory_method.buttons.HtmlButton;

/**
 * @author Ovchinnikov Viktor
 */
public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
