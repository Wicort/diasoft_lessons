package ru.vovchinnikov.diasoft.lessons.relationships.team;

/**
 * @author Ovchinnikov Viktor
 */
public class Test {
    public static void main(String[] args) {

        Team team = new Team();
        for (int i = 0; i < 11; i++) {
            Player player = new Player();
            player.team = team;
            team.players.add(player);
        }

    }
}
