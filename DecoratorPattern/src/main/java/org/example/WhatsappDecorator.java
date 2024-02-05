package org.example;

/** Notes:
 * -> adds additional notification channel to the system
 *  -> adds specific behavior or responsibilities to the Notifier.**/

public class WhatsappDecorator extends BaseNotifierDecorator {
    public WhatsappDecorator(Notifier wrapper) {
        super(wrapper);
    }

    public void send(String msg) {
        super.send(msg);
        String whatsApp = databaseSource.getWhatsAppByUsername(getUsername());
        System.out.printf("%s - > send to %s WhatsApp \n",msg,whatsApp);
    }
}
