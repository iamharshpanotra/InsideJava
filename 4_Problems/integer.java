//Write a program to find out if the value added by the user is an integer or not
import java.util.Scanner;

public class integer{
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a value: ");

        if (number.hasNextInt()) {
            int value = number.nextInt();
            System.out.println("Yes, '" + value + "' is an integer.");
        } else {
            String input = number.nextLine(); // consume the wrong input
            System.out.println("No, '" + input + "' is NOT an integer.");
        }

        number.close();

    }
}