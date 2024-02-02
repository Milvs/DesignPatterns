package org.example.command;
/**Receiver*/
public class Chef {

    public void prepareBurger(Order order){
        System.out.printf("%s BURGER is preparing by the chef!\n",order.getBurgerType());
    }
}
