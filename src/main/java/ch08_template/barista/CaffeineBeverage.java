package ch08_template.barista;

public abstract class CaffeineBeverage {
    public void prepareRecipe() {
        bildWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void bildWater() {
        System.out.println("Boiling water");
    }


}
