package org.example;

public class FacebookDecorator extends BaseNotifierDecorator{

    public FacebookDecorator(Notifier wrapper) {
        super(wrapper);
    }

    public void send(String msg){
        super.send(msg);
        String fbName = databaseSource.getFacebookByUsername(getUsername());
        System.out.printf("%s - > send to %s Facebook \n",msg,fbName);
    }
}
