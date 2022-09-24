package ocp.solution;

public class Test {
    public static void main(String[] args) {

        Notice notice= new Notice(1,"This is Test Notification");

        MobileNotificationService mobileNotificationService=new MobileNotificationService();
        mobileNotificationService.sendNotice(notice);

        // Now we want to send notice by email and whatsApp
        // Only we add new functionality -- Open Extension
        // But we don't need to modify  our NotificationInterface. -- Close Modification

        EmailNotificationService emailNotificationService=new EmailNotificationService();
        emailNotificationService.sendNotice(notice);

        WhatsAppNotificationService whatsAppNotificationService=new WhatsAppNotificationService();
        whatsAppNotificationService.sendNotice(notice);
    }
}
