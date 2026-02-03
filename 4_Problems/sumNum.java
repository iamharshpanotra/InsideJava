import java.util.Scanner;

public class sumNum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = input.nextInt();

        System.out.println("Enter second number");
        int num2 = input.nextInt();

        System.out.println("Enter third number");
        int num3 = input.nextInt();

        System.out.println("The sum of three numbers is: " + (num1 + num2 + num3));}
};