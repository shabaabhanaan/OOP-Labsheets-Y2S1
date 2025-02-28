public class Student extends Person{
 private int studentId;

    public Student(String name, String address, int studentId) {
        super(name, address);
        this.studentId = studentId;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Student ID: " + studentId);
    }
}

