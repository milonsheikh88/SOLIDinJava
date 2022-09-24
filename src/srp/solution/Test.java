package srp.solution;

public class Test {

    public static void main(String[] args) {

        Student student = new Student(1, "Milon Sheikh", "Dhaka", 700, 1000);

        PublishResult prs=new PublishResult();
        prs.publishResult(student);

    }
}
