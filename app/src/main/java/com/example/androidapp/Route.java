package com.example.androidapp;

public class Route {
    private String driver,passsenger,place,start,dest;    //สถานะ,บันทึกแล้ว
    boolean isWait;

    public Route(String driver, String passsenger, String place, String start, String dest) {
        this.driver = driver;
        this.passsenger = passsenger;
        this.place = place;
        this.start = start;
        this.dest = dest;
        this.isWait = true;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setPasssenger(String passsenger) {
        this.passsenger = passsenger;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public void setWait(boolean wait) {
        isWait = wait;
    }

    public String getDriver() {
        return driver;
    }

    public String getPasssenger() {
        return passsenger;
    }

    public String getPlace() {
        return place;
    }

    public String getStart() {
        return start;
    }

    public String getDest() {
        return dest;
    }

    public boolean isWait() {
        return isWait;
    }
}
