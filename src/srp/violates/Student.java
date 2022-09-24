package srp.violates;

public class Student {

    private int studentId;
    private String studentName;
    private String address;
    private int marks;
    private int totalNumber;

    public Student(int studentId, String studentName, String address, int marks, int totalNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
        this.marks = marks;
        this.totalNumber = totalNumber;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(int totalNumber) {
        this.totalNumber = totalNumber;
    }
}
