package edu.letourlt.assign04;

public class CharBoard {
    private char [][] arrChar;
    private int rowCnt;
    private int colCnt;
    private char fillChar;
    public CharBoard(int rowCnt, int colCnt, char fillChar) {
        this.rowCnt = rowCnt;
        this.colCnt = colCnt;
        this.fillChar = fillChar;

        arrChar = new char[rowCnt][colCnt];

        for(int i = 0; i < rowCnt; i++) {
            for(int j = 0; j < colCnt; j++) {
                arrChar[i][j] = fillChar;
            }
        }
    }
    public void clear() {
        for(int i = 0; i < rowCnt; i++) {
            for(int j = 0; j < colCnt; j++) {
                arrChar[i][j] = fillChar;
            }
        }
    }
    public int getRowCnt() {
        return rowCnt;
    }
    public int getColCnt() {
        return colCnt;
    }
    public boolean isValidPosition(int row, int col) {
        boolean validPosition = false;

        if((row >= 0) && (row < rowCnt)) {
            if((col >= 0) && (col < colCnt)) {
                validPosition = true;
            }
        }

        return validPosition;
    }
    public char getPos(int row, int col) {
        char posChar = ' ';

        if(isValidPosition(row, col)) {
            posChar = arrChar[row][col];
        }

        return posChar;
    }
    public boolean setPos(int row, int col, char c) {
        boolean posBool = false;

        if(isValidPosition(row, col)) {
            arrChar[row][col] = c;
            posBool = true;
        }

        return posBool;
    }
    public String toString() {
        return rowCnt + " x " + colCnt + " CharBoard (default: " + fillChar + ")";
    }
    public String getMapString() {
        StringBuilder mapString = new StringBuilder();

        for(int i = 0; i < rowCnt; i++) {
            for(int j = 0; j < colCnt; j++) {
                mapString.append(arrChar[i][j]);
            }
            mapString.append("\n");
        }
        return mapString.toString();
    }
}
