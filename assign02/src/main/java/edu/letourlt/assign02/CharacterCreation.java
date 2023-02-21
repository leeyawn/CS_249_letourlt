package edu.letourlt.assign02;

import java.util.Scanner;

public class CharacterCreation {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        Player p = new Player();

        System.out.println("Enter name: ");
        p.setFirstName(input.next());
        p.setLastName(input.next());

        System.out.println("Enter height in inches: ");
        p.setHeight(input.nextInt());

        System.out.println("Enter weight in pounds: ");
        p.setWeight(input.nextDouble());

        System.out.println(p.toString());
    }
}
