
public class PartTimeStudent extends Student {
    int workingHours;

  
    public PartTimeStudent(String name, int age, String studentId, int workingHours) {
        super(name, age, studentId);  
        this.workingHours = workingHours;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Working Hours: " + workingHours);
    }
}
