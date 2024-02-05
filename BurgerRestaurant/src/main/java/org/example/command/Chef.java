package org.example.command;

import org.example.decorator.Burger;
import org.example.decorator.Product;
import org.example.decorator.GarlicSauceDecorator;
import org.example.decorator.KetchupDecorator;

/**Receiver*/
public class Chef {

    public void prepareBurger(Order order){
        String sauce = order.getSauce();
        Product burgerWithSauce = new Burger();
        if (sauce.equals("ketchup")){
            burgerWithSauce = new KetchupDecorator(burgerWithSauce,"ketchup");

        }else if(sauce.equals("garlic")){
            burgerWithSauce = new GarlicSauceDecorator(burgerWithSauce,"garlic");
        }
        burgerWithSauce.addSauce();
        System.out.printf("%s BURGER with %s is preparing by the chef!\n",order.getBurgerType(),sauce);
    }
}
