package ocp.violates;

public class Test {
    public static void main(String[] args) {


        Notice notice= new Notice(1,"This is Test Notification");


        NotificationService notificationService=new NotificationService();
        notificationService.sendNoticeByMobile(notice);

        // Now we want to send notice by email and whatsApp
        // So we need to modify  our NotificationService class.

        notificationService.sendNoticeByEmail(notice);
        notificationService.sendNoticeByWhatsApp(notice);

    }
}
