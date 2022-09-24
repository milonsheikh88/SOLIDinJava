package ocp.violates;

public class NotificationService {

    public  void sendNoticeByMobile(Notice notice){

        System.out.println("Send Notice by Mobile = " + notice.getMessage());

    }

    public  void sendNoticeByEmail(Notice notice){

        System.out.println("Send Notice by Email = " +  notice.getMessage());

    }

    public  void sendNoticeByWhatsApp(Notice notice){

        System.out.println("Send Notice by WhatsApp = " +  notice.getMessage());

    }

}
