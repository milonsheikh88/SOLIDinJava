package ocp.solution;

public class MobileNotificationService implements INotification {

    @Override
    public void sendNotice(Notice notice) {
        System.out.println("OCP: Send Notice by Mobile = " + notice.getMessage());
    }


}
