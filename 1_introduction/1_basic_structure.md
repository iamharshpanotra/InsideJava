# Basic Structure of a Java Program

A Java program follows a fixed, predictable structure. Below is the **entire structure explained in one place**, top to bottom, exactly how the JVM sees it.

---

```java
// 1. Package declaration (optional)
// Must be the first line if used. It groups related classes.
package com.example.app;

// 2. Import statements (optional)
// Used to access built-in or external classes.
import java.util.Scanner;

// 3. Class declaration (mandatory)
// File name must match the public class name.
public class Main {

    // 4. Main method (mandatory entry point)
    // JVM starts execution from here.
    public static void main(String[] args) {

        // 5. Program statements
        // Actual logic of the program lives here.
        System.out.println("Hello, World!");

    }
}
