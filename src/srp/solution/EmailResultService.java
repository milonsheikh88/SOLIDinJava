package srp.solution;

public class EmailResultService {

    public void emailResult(Student s) {
        System.out.println("SRP: Email student result to server : " + s.getStudentId() +
                " : " + s.getStudentName() + " : " + s.getAddress() +
                " : " + s.getMarks() + " : " + s.getTotalNumber());
    }

}
