import java.util.Scanner; // Import the Scanner class to read user input

/**
 * UserInputDemo.java
 * This program demonstrates how to read different types of input from the console
 * using the java.util.Scanner class.
 */
public class UserInputDemo {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the standard input (System.in)
        // 
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- User Input Demo ---");

        // 1. Read a String (Word)
        System.out.print("Enter your first name: ");
        String firstName = scanner.next(); // Reads one word (stops at the first space)
        
        // 2. Read an Integer
        System.out.print("Enter your age (as a whole number): ");
        int age = scanner.nextInt(); // Reads an integer
        
        // 3. Read a floating-point number (Decimal)
        System.out.print("Enter your height in meters (e.g., 1.75): ");
        double height = scanner.nextDouble(); // Reads a double (floating-point number)
        
        // 4. Consume the rest of the line (important after nextInt/nextDouble)
        // This is necessary to clear the newline character left in the buffer.
        scanner.nextLine(); 

        // 5. Read an entire line of text (Sentence)
        System.out.print("Tell me a fun fact about yourself: ");
        String funFact = scanner.nextLine(); // Reads the entire line until the user hits Enter

        // Output the collected information
        System.out.println("\n--- Your Profile Summary ---");
        System.out.println("Name: " + firstName);
        System.out.println("Age: " + age + " years old.");
        System.out.println("Height: " + height + " meters.");
        System.out.println("Fun Fact: " + funFact);
        
        // Always close the scanner object when you are finished using it
        scanner.close();
        System.out.println("Scanner closed. Program finished.");
    }
}