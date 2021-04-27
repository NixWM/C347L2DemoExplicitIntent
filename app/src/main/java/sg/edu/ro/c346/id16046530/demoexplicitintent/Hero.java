package sg.edu.ro.c346.id16046530.demoexplicitintent;

import java.io.Serializable;

public class Hero implements Serializable {

    private String name;
    private int strength;
    private int technicalProwess;

    public Hero(String name, int strength, int technicalProwess) {
        this.name = name;
        this.strength = strength;
        this.technicalProwess = technicalProwess;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getTechnicalProwess() {
        return technicalProwess;
    }
}
