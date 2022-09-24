package srp.violates;

public class StudentResult {

    public void publishResult(Student student){
        saveResult(student);
        printResult(student);
        emailResult(student);
    }

    public void saveResult(Student s) {
        System.out.println("Save student result to server : " + s.getStudentId() +
                " : " + s.getStudentName() + " : " + s.getAddress() +
                " : " + s.getMarks() + " : " + s.getTotalNumber());
    }

    public void printResult(Student s) {
        System.out.println("Print student result to server : " + s.getStudentId() +
                " : " + s.getStudentName() + " : " + s.getAddress() +
                " : " + s.getMarks() + " : " + s.getTotalNumber());
    }

    public void emailResult(Student s) {
        System.out.println("Email student result to server : " + s.getStudentId() +
                " : " + s.getStudentName() + " : " + s.getAddress() +
                " : " + s.getMarks() + " : " + s.getTotalNumber());
    }

}
