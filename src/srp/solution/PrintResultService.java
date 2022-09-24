package srp.solution;

public class PrintResultService {

    public void printResult(Student s) {
        System.out.println("SRP: Print student result to server : " + s.getStudentId() +
                " : " + s.getStudentName() + " : " + s.getAddress() +
                " : " + s.getMarks() + " : " + s.getTotalNumber());
    }
}
