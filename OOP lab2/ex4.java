import java.util.*;
public class ex2{
    public static void main(String args[])
{
  Scanner scanner = new Scanner(System.in);     
  System.out.println("Enter the length:");
  float length = scanner.nextFloat();
   System.out.println("Enter the width:");
float width = scanner.nextFloat();
   System.out.println("Enter the height:");
  
float height = scanner.nextFloat();


float volume = length * width * height;
   System.out.println("Volume :"+volume);
  

 }
}

      