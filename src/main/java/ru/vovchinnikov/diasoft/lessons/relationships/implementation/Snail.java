package ru.vovchinnikov.diasoft.lessons.relationships.implementation;


/**
 * @author Ovchinnikov Viktor
 */
public class Snail implements Crawlable{
    public int age;

    @Override
    public void crawl() {
        System.out.println("Фьють");
    }
}
