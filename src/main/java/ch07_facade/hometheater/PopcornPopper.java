package ch07_facade.hometheater;

public class PopcornPopper {

    private String description;

    public PopcornPopper(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " On");
    }

    public void off() {
        System.out.println(description + " Off");
    }

    public void pop() {
        System.out.println(description + " popping popcorn!");
    }

    public String toString() {
        return description;
    }
}
