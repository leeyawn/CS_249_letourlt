package edu.letourlt.assign06;

import edu.letourlt.assign04.CharBoard;

public class Skeleton extends Creature {
    public Skeleton() {}

    public Skeleton(int row, int col) {
        super.setRow(row);
        super.setCol(col);
    }

    public String toString() {
        return "Skeleton at " + getRow() + "," + getCol();
    }

    public void draw(CharBoard map) {
        map.setPos(getRow(), getCol(), 'S');
    }
}
