public class Student{
     private String name;
      private int ditno;
    private String address;

 public Student(String name, int ditno, String address) {
        this.name = name;
        this.ditno = ditno;
        this.address = address;
    }

     public String getName() {
        return name;
    }

    public int getDitno() {
        return ditno;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDitno(int ditno) {
        this.ditno = ditno;
    }

    public void setAddress(String address) {
        this.address = address;
    }
       public void display() {
        System.out.println("Name: " + name);
        System.out.println("DIT No: " + ditno);
        System.out.println("Address: " + address);
        System.out.println();
    }
}