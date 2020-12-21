package ch06_command_object.remotecontrol.remote;

public class CeilingFan {
    String location = "";
    int level;
    public static final int HIGH = 2;
    public static final int MEDIUM = 1;
    public static final int LOW = 0;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        // turns the ceiling fun on high
        level = HIGH;
        System.out.println(location + " ceiling fan is on high");
    }

    public void medium() {
        // turns the ceiling fun on medium
        level = MEDIUM;
        System.out.println(location + " ceiling fan is on medium");
    }

    public void low() {
        // turns the ceiling fun on low
        level = LOW;
        System.out.println(location + " ceiling fan is on low");
    }

    public void off() {
        // turn the ceiling fun off
        level = 0;
        System.out.println(location + "ceiling fun is off");
    }

    public int getSpeed() {
        return level;
    }

}
