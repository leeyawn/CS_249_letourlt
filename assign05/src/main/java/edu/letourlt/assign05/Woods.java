package edu.letourlt.assign05;
import java.util.ArrayList;

public class Woods {
    private final ArrayList<Giant> everyGiant = new ArrayList<>();

    public Giant createGiant(String name, String typeName) {
        if(name.length() == 0) {
            return null;
        }

        return switch(typeName) {
            case "GIANT" -> new Giant(name);
            case "TROLL" -> new Troll(name);
            case "TREE" -> new Tree(name);
            case "ENT" -> new Ent(name);
            case "HUORN" -> new Huorn(name);
            default -> null;
        };
    }

    public boolean addGiant(String name, String typeName) {
        boolean giantAdded = false;

        if(createGiant(name, typeName) != null) {
            everyGiant.add(createGiant(name, typeName));
            giantAdded = true;
        }

        return giantAdded;
    }

    public Giant getGiant(int index) {
        if((index >= 0) && (index < everyGiant.size())) {
            return everyGiant.get(index);
        }

        return null;
    }

    public void printAllGiants() {
        System.out.println("ALL GIANTS:");

        for(Giant giant : everyGiant) {
            System.out.println("- " + giant.toString());
        }
    }

    public void printAllTrees() {
        System.out.println("ALL TREES:");

        for(Giant giant : everyGiant) {
            if(giant instanceof Tree) {
                System.out.println("- " + giant + ": " + ((Tree) giant).speak());
            }
        }
    }

    public void printAllTrolls() {
        System.out.println("ALL TROLLS:");

        for(Giant giant : everyGiant) {
            if(giant instanceof Troll) {
                System.out.println("- " + giant + ": " + ((Troll) giant).cook());
            }
        }
    }
}
