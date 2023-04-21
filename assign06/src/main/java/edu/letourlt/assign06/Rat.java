package edu.letourlt.assign06;

import edu.letourlt.assign04.CharBoard;

public class Rat extends Creature {
    public Rat() {}

    public Rat(int row, int col) {
        super.setRow(row);
        super.setCol(col);
    }

    public String toString() {
        return "Rat at " + getRow() + "," + getCol();
    }

    public void draw(CharBoard map) {
        map.setPos(getRow(), getCol(), 'R');
    }
}
