package part8;

interface Notification {
    void sendNotification(String recipient, String message);
}
class EmailNotification implements Notification {
    @Override public void sendNotification(String recipient, String message) {
        System.out.println("[EMAIL]");
        System.out.println("To : "+recipient);
        System.out.println("Message: "+message);
    }
}
class SMSNotification implements Notification {
    @Override public void sendNotification(String recipient, String message) {
        System.out.println("[SMS]");
        System.out.println("To : "+recipient);
        System.out.println("Message: "+message);
    }
}
public class NotificationMain {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();
        email.sendNotification("surakksha@kfa.edu.np", "Your assignment is due Monday.");
        System.out.println();
        sms.sendNotification("+977-9800000000", "Assignment due Monday!");
    }
}