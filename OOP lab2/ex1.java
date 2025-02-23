import java.util.Scanner;
public class ex1{
    public static void main(String args[])
{
   Scanner scanner = new Scanner(System.in);     
System.out.println("Enter the distance:");
 float distance = scanner.nextFloat();
   float mile = 1.609f;
   float yard = 1760.0f;
    float mm = distance/1.609f;
System.out.println("In mile :"+mm);
System.out.println("In yard :"+mile/1760.0f);
}
}

      
    