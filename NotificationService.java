// Interface with abstract, default, and private methods

interface Notifier {

    // Abstract method
    void sendNotification(String msg);

    // Default method that uses private helper
    default void prepareAndSend(String msg) {
        String formattedMsg = format(msg);
        sendNotification(formattedMsg);
    }

    // Private helper method (used only inside the interface)
    private String format(String msg) {
        return "[NOTIFICATION] " + msg.toUpperCase();
    }
}

// Email Notification
class EmailNotifier implements Notifier {

    public void sendNotification(String msg) {
        System.out.println("Sending Email: " + msg);
    }
}

// SMS Notification
class SMSNotifier implements Notifier {

    public void sendNotification(String msg) {
        System.out.println("Sending SMS: " + msg);
    }
}

public class NotificationService {

    public static void main(String[] args) {

        Notifier email = new EmailNotifier();
        Notifier sms = new SMSNotifier();

        email.prepareAndSend("Your order has been shipped");
        sms.prepareAndSend("Your OTP is 5842");
    }
}
