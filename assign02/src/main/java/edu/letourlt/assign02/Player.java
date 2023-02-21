package edu.letourlt.assign02;

public class Player {
        private String firstName = "";
        private String lastName = "";
        private int height = 0;
        private double weight = 0;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
    public void setFirstName(String first) {
        firstName = first;
    }
    public void setLastName(String last) {
        lastName = last;
    }
    public void setHeight(int totalInches) {
        height = totalInches;
    }
    public void setWeight(double pounds) {
        weight = pounds;
    }
    public int calculateBMI() {
        double playerBMI = 0;
        playerBMI = ((703 * weight) / (height * height));
        return (int) playerBMI;
    }
    public String getNameString() {
        return lastName + ", " + firstName;
    }
    public String getHeightString() {
        int playerFeet = height/12;
        int playerInches = height % 12;
        String heightString = playerFeet + "'-" + playerInches + "\"";
        return heightString;
    }
    public String getWeightString() {
        return weight + " lbs.";
    }
    public String toString() {
        String outString = "NAME: " + getNameString() + "\n" +
                           "WEIGHT: " + getWeightString() + "\n" +
                           "HEIGHT: " + getHeightString() + "\n" +
                           "BMI: " + calculateBMI() + "\n";
        return outString;
    }
}


