
class Student extends Person {
    protected String studentId; 

    public Student(String name, int age, String studentId) {  
        super(name, age);  
        this.studentId = studentId;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Student ID: " + studentId);
    }
}
