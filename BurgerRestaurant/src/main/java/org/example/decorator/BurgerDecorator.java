package org.example.decorator;


public class BurgerDecorator implements Product {
    private Product burger;
    public BurgerDecorator(Product burger) {
        super();
        this.burger=burger;

    }
    @Override
    public void addSauce() {
        this.burger.addSauce();

    }
}
