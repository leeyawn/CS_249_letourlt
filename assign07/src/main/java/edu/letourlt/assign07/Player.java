package edu.letourlt.assign07;

import edu.letourlt.assign04.CharBoard;
import edu.letourlt.assign06.Creature;

public class Player extends Creature {
    public Player () {}

    public Player(int row, int col) {
        super.setRow(row);
        super.setCol(col);
    }

    public String toString() {
        return "Player at " + getRow() + "," + getCol();
    }

    public void draw(CharBoard map) {
        map.setPos(getRow(), getCol(), 'P');
    }
}
