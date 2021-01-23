package ch08_template.barista;

public class BeverageTestDrive {
    public static void main(String[] args) {
        System.out.println("-----Team and Coffee without Hook------");
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        System.out.println("Making tea...");
        tea.prepareRecipe();
        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();

        System.out.println("\n-----Team and Coffee with Hook(User interaction)------");
        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        System.out.println("Making Tea...");
        teaWithHook.prepareRecipe();
        System.out.println("\nMaking Coffee...");
        coffeeWithHook.prepareRecipe();
    }
}
