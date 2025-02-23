import java.util.Scanner;

class EvenOddNumber {
   
    public boolean findEvenOrOdd(int i) {
        return i % 2 == 0; 
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EvenOddNumber evenOdd = new EvenOddNumber();

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isEven = evenOdd.findEvenOrOdd(number);

   
        System.out.println("The number " + number + " is " + (isEven ? "Even" : "Odd"));
    }
}
