// Write a program to calculate the cgpa using marks of three subjects (Out of 100)
import java.util.Scanner;

public class cgpa{
    public static void main(String[] args){
        Scanner value = new Scanner(System.in);

        System.out.println("Enter the marks of first subject");
        float subject1  = value.nextFloat();

        System.out.println("Enter the marks of second subject");
        float subject2  = value.nextFloat();

        System.out.println("Enter the marks of third subject");
        float subject3  = value.nextFloat();

        float totalMarks = subject1 + subject2 + subject3;
        float cgpa = (totalMarks / 300f) * 10;

        System.out.println("The CGPA is: " + cgpa);
    }
}

