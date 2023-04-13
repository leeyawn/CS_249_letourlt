package edu.letourlt.assign01;

public class Greetings {
    public static void main(String [] args) {

        System.out.println("crab.");

        Boat enterprise = new Boat();
        enterprise.setOnboardCnt(240);

        System.out.println(enterprise.getPeopleWeight());
        System.out.println(enterprise.computePeopleWeight(120));

    }


}
