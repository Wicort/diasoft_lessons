package ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.factory_method.factory;

import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.factory_method.buttons.Button;

/**
 * @author Ovchinnikov Viktor
 */
public abstract class Dialog {
    public void renderWindow() {
        // ... остальной код диалога ...

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Подклассы будут переопределять этот метод, чтобы создавать конкретные
     * объекты продуктов, разные для каждой фабрики
     */
    public abstract Button createButton();
}
