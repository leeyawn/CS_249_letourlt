package edu.letourlt.assign05;

public class Ent extends Tree {
    public Ent(String name) {
        super.setName(name);
    }

    public String toString() {
        return "Ent " + super.toString();
    }

    public String speak() {
        return "HOOM";
    }
}
