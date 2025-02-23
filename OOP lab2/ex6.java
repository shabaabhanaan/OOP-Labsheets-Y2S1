import java.io.*;

public class Exercise4 {
    public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the length of the cube: ");
        double length = Double.parseDouble(reader.readLine());

        System.out.print("Enter the width of the cube: ");
        double width = Double.parseDouble(reader.readLine());

        System.out.print("Enter the height of the cube: ");
        double height = Double.parseDouble(reader.readLine());

                double volume = length * width * height;

        System.out.println("The volume of the cube is: " + volume);
    }
}
