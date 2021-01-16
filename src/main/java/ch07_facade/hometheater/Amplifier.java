package ch07_facade.hometheater;

public class Amplifier {

    private String description;
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;
    int volume;

    public Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " is On");
    }

    public void off() {
        System.out.println(description + " is Off");
    }

    public void setSurroundSound() {
        System.out.println(description + " Surround Sound enabled");
    }

    public void setStereoSound() {
        System.out.println(description + " Stereo Mode enabled");
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setDvd(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public void setCd(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
