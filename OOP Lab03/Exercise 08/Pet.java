public class Pet {
    private String name;
    private String owner;
    private int age;

    public Pet(String n, String o, int a) {
        this.name = n;
        this.owner = o;
        this.age = a;
    }

    public void showDetails() {
        System.out.println("I am a pet. My name is " + this.name + ". My owner is " + this.owner);
    }
}
