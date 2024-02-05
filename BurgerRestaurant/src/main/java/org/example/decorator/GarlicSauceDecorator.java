package org.example.decorator;

public class GarlicSauceDecorator extends BurgerDecorator{

    private String sauce;

    public GarlicSauceDecorator(Product burger, String sauce) {
        super(burger);
        this.sauce = sauce;
    }

    @Override
    public void addSauce() {
        System.out.println("Adding garlic sauce!");
    }
}
