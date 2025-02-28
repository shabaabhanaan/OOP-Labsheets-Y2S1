
public class InheritanceDemo {
    public static void main(String[] args) {

        Person person1 = new Person("John Doe", 30); // '30' is an integer, not a string

    
        Student student1 = new Student("Jane Doe", 22, "S1001"); // Student ID is a String


        PartTimeStudent partTimeStudent = new PartTimeStudent("Mike Smith", 25, "P2002", 20);


        System.out.println("\nPerson Details:");
        person1.showDetails();

        System.out.println("\nStudent Details:");
        student1.showDetails();

        System.out.println("\nPart-Time Student Details:");
        partTimeStudent.showDetails();
    }
}
