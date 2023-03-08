package edu.letourlt.assign03;

import java.util.*;

public class LetterPrinter {
    public static Letterhead askForLetterheadData(Scanner input) {
        System.out.println("Enter business name:");
        String name = input.nextLine();

        System.out.println("Enter boundary character:");
        char boundaryChar = input.nextLine().charAt(0);

        String [] sloganLines = new String[4];

        System.out.println("Enter slogan (max 4 lines):");
        for(int i = 0; i < 4; i++) {
            sloganLines[i] = input.nextLine();
        }

        Letterhead lh = new Letterhead(name, sloganLines, boundaryChar);

        return lh;
    }

    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);
        Letterhead bHeader = askForLetterheadData(userInput);
        System.out.println("Your new letterhead:");
        System.out.println(bHeader);
    }
}
