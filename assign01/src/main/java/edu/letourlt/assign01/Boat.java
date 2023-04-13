package edu.letourlt.assign01;

public class Boat {
    private int onboardCnt = 3;

    public void nothing () {}
    public void setOnboardCnt(int onboardCnt) {
        this.onboardCnt = onboardCnt;
    }
    public double getPeopleWeight() {
        return 200.0 * (double)onboardCnt;
    }
    public double computePeopleWeight(int cnt) {
        return 200.0 * (double)cnt;
    }
}
