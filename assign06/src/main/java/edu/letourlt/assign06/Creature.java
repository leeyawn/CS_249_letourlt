package edu.letourlt.assign06;
import java.util.*;

public abstract class Creature implements Loadable, Drawable {
    private int row = 0;
    private int col = 0;

    protected Creature() {}

    protected Creature(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void load(Scanner input) throws GameFileException {
        try {
            row = input.nextInt();
            col = input.nextInt();
        }
        catch(Exception e) {
            row = 0;
            col = 0;
            throw new GameFileException("Error loading Creature", e);
        }
    }
}
