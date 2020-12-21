package ch06_command_object.remotecontrol.party;

public class CeilingFan {
    String location = "";
    int speed;
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        // turns the ceiling fun on high
        speed = HIGH;
        System.out.println(location + " ceiling fan is on high");
    }

    public void medium() {
        // turns the ceiling fun on medium
        speed = MEDIUM;
        System.out.println(location + " ceiling fan is on medium");
    }

    public void low() {
        // turns the ceiling fun on low
        speed = LOW;
        System.out.println(location + " ceiling fan is on low");
    }

    public void off() {
        // turn the ceiling fun off
        speed = OFF;
        System.out.println(location + "ceiling fun is off");
    }

    public int getSpeed() {
        return speed;
    }

}
