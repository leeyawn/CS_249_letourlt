package edu.letourlt.assign06;

import edu.letourlt.assign04.CharBoard;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class GameState implements Loadable {
    private final ArrayList<Loadable> items = new ArrayList<>();
    private final CharBoard baseMap = new CharBoard(12, 30, '.');

    public Loadable createLoadable(String typeName) throws GameFileException {
        return switch(typeName) {
            case "Skeleton" -> new Skeleton();
            case "Rat" -> new Rat();
            case "Item" -> new Item();
            case "Book" -> new Book();
            default -> throw new GameFileException("Unknown type: " + typeName);
        };
    }

    public void load(Scanner input) throws GameFileException {
        items.clear();
        baseMap.clear();

        int lineCount = input.nextInt();
        input.nextLine();

        for(int i = 0; i < lineCount; i++) {
            String typeName = input.next();
            Loadable m = createLoadable(typeName);
            m.load(input);
            items.add(m);
            if (m instanceof Drawable) {
                ((Drawable) m).draw(baseMap);
            }

            input.nextLine();
        }

        input.close();
    }

    public String toString() {
        StringBuilder gameStateSB = new StringBuilder();
        gameStateSB.append("MAP:\n");
        gameStateSB.append(baseMap.getMapString()).append("\n");

        gameStateSB.append("CREATURES:\n");
        for(Loadable m : items) {
            if(m instanceof Creature c) {
                gameStateSB.append("* ").append(c).append("\n");
            }
        }

        gameStateSB.append("INVENTORY:\n");
        for(Loadable m : items) {
            if(m instanceof Item item) {
                gameStateSB.append("* ").append(item).append("\n");
            }
        }

        return gameStateSB.toString();
    }

    public void save(String fileName) throws GameFileException {
        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.print(this);
        }
        catch(Exception e) {
            throw new GameFileException("Failed to save file!", e);
        }
    }
}
