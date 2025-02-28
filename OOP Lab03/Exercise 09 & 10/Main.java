
public class Main {
    public static void main(String[] args) {
      
        Pet p1 = new Pet("Lissie", "Smith", 3);
        p1.showDetails();

        Cat c1 = new Cat("Kyan", "Silva", 4, 4);
        c1.showDetails();

    
        Pet p2 = new Pet("Buddy", "John");
        p2.showDetails();


        Cat c2 = new Cat("Kitty", "Emma");
        c2.showDetails();

        Dog d1 = new Dog("Syndy", "Nimal", 5, 2);
        d1.showDetails();

        Dog d2 = new Dog("Rocky", "Sara");
        d2.showDetails();
    }
}
