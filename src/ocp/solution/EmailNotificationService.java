package ocp.solution;

public class EmailNotificationService implements INotification {

    @Override
    public void sendNotice(Notice notice) {

        System.out.println("OCP: Send Notice by Email = " + notice.getMessage());

    }
}
