package ocp.solution;

public class WhatsAppNotificationService implements INotification {
    @Override
    public void sendNotice(Notice notice) {
        System.out.println("OCP: Send Notice by WhatsApp = " + notice.getMessage());
    }
}
