public class Test {
    public static void main(String[] args) {
      
        Student student1 = new Student("Alice", 101, "123 Main St");
        Student student2 = new Student("Bob", 102, "456 Elm St");


        student1.display();
        student2.display();

        
        student1.setName("Anan");
        student1.setDitno(1);
        student1.setAddress("789 Main Street");

        System.out.println("Updated Student 1 Details:");
        System.out.println("Name: " + student1.getName());
        System.out.println("DIT No: " + student1.getDitno());
        System.out.println("Address: " + student1.getAddress());
    }
}
