import java.util.Scanner;
public class Demo{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        EvenOddNumber obj = new EvenOddNumber();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (obj.findEvenOrOdd(num)) {
            System.out.println(num + " is an Even number.");
        } else {
            System.out.println(num + " is an Odd number.");
        }
        sc.close();
}
}