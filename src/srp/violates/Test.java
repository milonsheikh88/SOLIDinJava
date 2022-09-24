package srp.violates;

public class Test {

    public static void main(String[] args) {

        Student student = new Student(1, "Milon Sheikh", "Dhaka", 700, 1000);

        StudentResult sr = new StudentResult();
        sr.publishResult(student);

    }
}
