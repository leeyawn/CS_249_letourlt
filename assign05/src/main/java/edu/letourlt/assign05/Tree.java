package edu.letourlt.assign05;

public class Tree extends Giant {
    public Tree() {}

    public Tree(String name) {
        setName(name);
    }

    public String toString() {
        return super.toString() + " of the trees";
    }

    public String speak() {
        return "<rustling>";
    }
}
