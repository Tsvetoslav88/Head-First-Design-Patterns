package ch08_template.simplebarista;

public class Barista {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("Making tea...");
        tea.prepareRecipe();
        System.out.println();
        System.out.println("Making cofee...");
        coffee.prepareRecipe();
    }
}
