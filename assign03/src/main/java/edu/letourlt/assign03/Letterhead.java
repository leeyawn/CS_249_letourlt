package edu.letourlt.assign03;

public class Letterhead {
    private String name = "";
    private String [] sloganLines = new String[4];
    private char boundaryChar;

    public Letterhead(String name, String [] sloganLines, char boundaryChar) {
        setName(name);
        setBoundaryChar(boundaryChar);
        setSlogan(sloganLines);
    }
    public String getName() {
        return name;
    }
    public char getBoundaryChar() {
        return boundaryChar;
    }
    public String getSlogan() {
        StringBuilder sloganOut = new StringBuilder();
        for(int i = 0; i < sloganLines.length; i++) {
            sloganOut.append(sloganLines[i]);
            sloganOut.append("\n");
        }

        return sloganOut.toString();
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setBoundaryChar(char boundaryChar) {
        this.boundaryChar = boundaryChar;
    }
    public void setSlogan(String [] sloganLines) {
        this.sloganLines = new String[sloganLines.length];
        for(int i = 0; i < this.sloganLines.length; i++) {
            this.sloganLines[i] = sloganLines[i];
        }
    }

    private String addTrailing(String s, char c) {
        final int LENGTH = 40;
        int sloganCnt = LENGTH - s.length() - 1;
        StringBuilder combo = new StringBuilder();

        // Adds string
        combo.append(s);

        if(s.length() > 0) {
            // Adds spaces after the string
            for (int i = 0; i < sloganCnt; i++) {
                combo.append(" ");
            }
        } else {
            // Adds the boundary char
            for (int i = 0; i < sloganCnt; i++) {
                combo.append(c);
            }
        }

        combo.append(c);

        return combo.toString();
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(addTrailing("", boundaryChar) + "\n");
        sb.append(addTrailing(boundaryChar + " " + name, boundaryChar) + "\n");
        sb.append(addTrailing(boundaryChar + " ", boundaryChar) + "\n");

        if (sloganLines.length > 0) {
            for (int i = 0; i < sloganLines.length; i++) {
                sb.append(addTrailing(boundaryChar + " " + sloganLines[i], boundaryChar) + "\n");
            }
        }

        for (int i = 0; i < Math.abs(sloganLines.length - 4); i++) {
            sb.append(addTrailing(boundaryChar + " ", boundaryChar) + "\n");
        }

        sb.append(addTrailing("", boundaryChar) + "\n");

        return sb.toString();
    }
}
