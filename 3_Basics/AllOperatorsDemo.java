public class AllOperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        boolean x = true;
        boolean y = false;

        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b  = " + (a + b));     // + : Addition
        System.out.println("a - b  = " + (a - b));     // - : Subtraction
        System.out.println("a * b  = " + (a * b));     // * : Multiplication
        System.out.println("a / b  = " + (a / b));     // / : Division (integer division)
        System.out.println("a % b  = " + (a % b));     // % : Modulus (remainder)

        System.out.println("\n=== Unary Operators ===");
        int c = 7;
        System.out.println("c             = " + c);
        System.out.println("++c (pre)     = " + (++c));   // ++ (pre-increment): increment first, then use
        System.out.println("c++ (post)    = " + (c++));   // ++ (post-increment): use first, then increment
        System.out.println("c after post  = " + c);
        System.out.println("--c (pre)     = " + (--c));   // -- (pre-decrement): decrement first, then use
        System.out.println("c-- (post)    = " + (c--));   // -- (post-decrement): use first, then decrement
        System.out.println("c after post  = " + c);
        System.out.println("+c (unary plus)  = " + (+c));  // + : Unary plus (no effect on positive numbers)
        System.out.println("-c (unary minus) = " + (-c));  // - : Unary minus (changes sign)
        System.out.println("!x (logical not) = " + (!x));  // ! : Logical NOT (negates boolean)

        System.out.println("\n=== Assignment Operators ===");
        int z = 20;
        System.out.println("z = " + z);                    // = : Simple assignment
        z += 5;   System.out.println("z += 5   → " + z);  // += : Add and assign
        z -= 3;   System.out.println("z -= 3   → " + z);  // -= : Subtract and assign
        z *= 2;   System.out.println("z *= 2   → " + z);  // *= : Multiply and assign
        z /= 4;   System.out.println("z /= 4   → " + z);  // /= : Divide and assign
        z %= 3;   System.out.println("z %= 3   → " + z);  // %= : Modulus and assign
        z &= 7;   System.out.println("z &= 7   → " + z);  // &= : Bitwise AND and assign
        z |= 12;  System.out.println("z |= 12  → " + z);  // |= : Bitwise OR and assign
        z ^= 10;  System.out.println("z ^= 10  → " + z);  // ^= : Bitwise XOR and assign
        z <<= 2;  System.out.println("z <<= 2  → " + z);  // <<= : Left shift and assign
        z >>= 1;  System.out.println("z >>= 1  → " + z);  // >>= : Right shift (signed) and assign
        z >>>= 1; System.out.println("z >>>=1  → " + z);  // >>>= : Unsigned right shift and assign

        System.out.println("\n=== Relational (Comparison) Operators ===");
        System.out.println("a == b   → " + (a == b));   // == : Equal to
        System.out.println("a != b   → " + (a != b));   // != : Not equal to
        System.out.println("a > b    → " + (a > b));    // >  : Greater than
        System.out.println("a < b    → " + (a < b));    // <  : Less than
        System.out.println("a >= b   → " + (a >= b));   // >= : Greater than or equal to
        System.out.println("a <= b   → " + (a <= b));   // <= : Less than or equal to

        System.out.println("\n=== Logical Operators ===");
        System.out.println("x && y   → " + (x && y));   // && : Logical AND (short-circuit)
        System.out.println("x || y   → " + (x || y));   // || : Logical OR (short-circuit)
        System.out.println("!x       → " + (!x));       // !  : Logical NOT

        System.out.println("\n=== Bitwise Operators ===");
        int p = 5;   // Binary: 0101
        int q = 3;   // Binary: 0011
        System.out.println("p & q    → " + (p & q));    // &  : Bitwise AND
        System.out.println("p | q    → " + (p | q));    // |  : Bitwise OR
        System.out.println("p ^ q    → " + (p ^ q));    // ^  : Bitwise XOR
        System.out.println("~p       → " + (~p));       // ~  : Bitwise NOT (one's complement)
        System.out.println("p << 2   → " + (p << 2));   // << : Left shift
        System.out.println("p >> 1   → " + (p >> 1));   // >> : Right shift (signed/arithmetic)
        System.out.println("p >>> 1  → " + (p >>> 1));  // >>>: Unsigned right shift (zero-filled)

        System.out.println("\n=== Ternary (Conditional) Operator ===");
        int max = (a > b) ? a : b;                      // ? : : Ternary operator (if-then-else)
        System.out.println("max of a and b = " + max);  // (condition) ? valueIfTrue : valueIfFalse
    }
}