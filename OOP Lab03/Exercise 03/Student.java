public class Student{
      private String name;
      private int ditno;
      private String address;
     
      public Student(){
          this.name = name;
          this.ditno = ditno;
          this.address = address;
     }
       
       public String getName(){
           return name;
       }
       public int getDitno(){
          return ditno;
       }
       public String getAddress(){
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

  public void getDetails() {
        System.out.println("I am a Student.\n" +
                           "My name is " + name + ".\n" +
                           "I am from " + address + ".\n" +
                           "My dit no is DIT/11/C1/0010.");
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("DIT No: " + ditno);
        System.out.println("Address: " + address);
        System.out.println();
    }
}





