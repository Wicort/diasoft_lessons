package ru.vovchinnikov.diasoft.lessons.relationships.chat;

/**
 * @author Ovchinnikov Viktor
 */
public class Test {
    public static void main(String[] args) {

        ChatRoom chat = new ChatRoom();
        chat.name = "@DiasoftChat";

        User user = new User();
        user.active = chat;

    }
}
