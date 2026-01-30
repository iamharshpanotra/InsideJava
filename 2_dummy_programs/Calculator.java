public class Calculator {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        int result;

        System.out.println("Simple Calculator Operations");

        System.out.println("Initial Variables: A = " + num1 + ", " + ", B =" + num2);

        // 2. Addition
        result = num1 + num2;
        System.out.println("A + B (Addition): " + result);

        // 3. Subtraction
        result = num1 - num2;
        System.out.println("A - B (Subtraction): " + result);

        // 4. Multiplication
        result = num1 * num2;
        System.out.println("A * B (Multiplication): " + result);

        // 5. Division (Integer division truncates the decimal part)
        result = num1 / num2;
        System.out.println("A / B (Integer Division): " + result); 

        // 6. Modulo (Returns the remainder of a division)
        result = num1 % num2;
        System.out.println("A % B (Modul/Remainder): " + result); 

        // To get a floating-point result for division, you must cast at least one operand:
        double floatResult = (double) num1 / num2;
        System.out.println("A / B (Floating-point Division): " + floatResult);
    }
}
