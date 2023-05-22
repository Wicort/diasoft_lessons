package ru.vovchinnikov.diasoft.lessons.relationships.team;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ovchinnikov Viktor
 */
public class Team {
    public List<Player> players;

    public Team() {
        this.players = new ArrayList<>();
    }
}
