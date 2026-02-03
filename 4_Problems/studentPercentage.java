// WAP to calculate the percentage of a given student in CBSE Board exam. His marks from 5 subjects are to be taken as input from the user(Marks are out of 100).
// The class we usually use for input in Java is called the Scanner class
import java.util.Scanner;

public class studentPercentage{
    public static void main(String[] args){
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter marks for 5 subjects
        System.out.println("Enter marks for 5 subjects (out of 100):");

        // Read marks for each subject
        int subject1 = input.nextInt();
        int subject2 = input.nextInt();
        int subject3 = input.nextInt();
        int subject4 = input.nextInt();
        int subject5 = input.nextInt();

        // Calculate total marks
        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;

        // Calculate percentage 
        float percentage = (totalMarks/500f) * 100;

        // Display the percentage 
        System.out.println("The percentage of the student is: " + percentage + "%");

    }
}