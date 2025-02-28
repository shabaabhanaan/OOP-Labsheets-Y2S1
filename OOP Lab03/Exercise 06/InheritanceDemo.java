public class InheritanceDemo {
    public static void main(String[] args) {
      
        Person person1 = new Person("John Doe", "123 Main St");
        person1.showDetails();

        System.out.println(); // Line break

     
        Student student1 = new Student("Jane Doe", "456 College Rd", 1001);
        student1.showDetails();
    }
}
