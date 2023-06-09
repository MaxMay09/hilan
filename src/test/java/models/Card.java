package models;

import java.awt.*;

public class Card {
    String name;
    String color;

    public Card withColor(String color) {
        this.color = color;
        return this;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public Card withName(String name) {
        this.name = name;
        return this;
    }
}
