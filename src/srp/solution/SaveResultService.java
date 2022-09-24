package srp.solution;

public class SaveResultService {

    public void saveResult(Student s) {
        System.out.println("SRP: Save student result to server : " + s.getStudentId() +
                " : " + s.getStudentName() + " : " + s.getAddress() +
                " : " + s.getMarks() + " : " + s.getTotalNumber());
    }

}
