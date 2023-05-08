package edu.letourlt.assign07;

import edu.letourlt.assign04.CharBoard;
import edu.letourlt.assign06.Creature;

public class Bat extends Creature implements Mover {
    private AvoidPlayer avoidPlayer = new AvoidPlayer();

    public Bat() {}

    public Bat(int row, int col) {
        super.setRow(row);
        super.setCol(col);
    }

    public String toString() {
        return "Bat at " + getRow() + "," + getCol();
    }

    public void draw(CharBoard map) {
        map.setPos(getRow(), getCol(), 'B');
    }

    public void performMove(Player p) {
        avoidPlayer.move(this, p);
    }
}
