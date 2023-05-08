package edu.letourlt.assign07;

import edu.letourlt.assign06.Creature;

import static java.lang.Math.abs;

public class AvoidPlayer implements MoveAlgorithm {
    public void move(Creature current, Player p) {
        int rowDis = p.getRow() - current.getRow();
        int colDis = p.getCol() - current.getCol();

        if((rowDis != 0) || (colDis != 0)) {
            if(abs(rowDis) > abs(colDis)) {
                if(rowDis < 0) {
                    current.setRow(current.getRow() + 1);
                } else {
                    current.setRow(current.getRow() - 1);
                }
            } else {
                if(colDis < 0) {
                    current.setCol(current.getCol() + 1);
                } else {
                    current.setCol(current.getCol() - 1);
                }
            }
        }
    }
}
