package edu.letourlt.assign06;
import java.util.*;

public class Book extends Item {
    private String skill = "";

    public Book() {}

    public Book(String ID, int value, String skill) {
        super.setID(ID);
        super.setValue(value);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void read() {
        System.out.println("Skill " + skill + " increased!");
    }

    public String toString() {
        return super.toString() + ", enhances " + skill;
    }

    public void load(Scanner input) throws GameFileException {
        try {
            super.load(input);
            skill = input.next();
        }
        catch(Exception e) {
            super.setID("");
            super.setValue(0);
            skill = "";
            throw new GameFileException("Error loading Book", e);
        }
    }
}
