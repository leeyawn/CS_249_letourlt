package edu.letourlt.assign07;

import edu.letourlt.assign04.CharBoard;
import edu.letourlt.assign06.Creature;

public class Orc extends Creature implements Mover {
    private SeekPlayer seekPlayer = new SeekPlayer();

    public Orc() {}

    public Orc(int row, int col) {
        super.setRow(row);
        super.setCol(col);
    }

    public String toString() {
        return "Orc at " + getRow() + "," + getCol();
    }

    public void draw(CharBoard map) {
        map.setPos(getRow(), getCol(), 'O');
    }

    public void performMove(Player p) {
        seekPlayer.move(this, p);
    }
}
