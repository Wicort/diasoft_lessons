package ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.factory_method.buttons;

/**
 * @author Ovchinnikov Viktor
 */
public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World'");
    }
}
