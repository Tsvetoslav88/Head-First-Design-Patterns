package ch08_template.simplebarista;

public class Tea {
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addLemon();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void brewCoffeeGrinds() {
        System.out.println("Steeping the tea");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void addLemon() {
        System.out.println("Adding Lemon");
    }
}
