# Anatomy of a Java Program

## Objective
This document explains the **complete structure (anatomy) of a Java program**, breaking down every component from top to bottom.  
It is intended to help developers understand **how a Java program is organized, compiled, and executed**.

---

## 1. What Is a Java Program
A Java program is a collection of **classes and methods** written using Java syntax that is compiled into **bytecode** and executed by the **Java Virtual Machine (JVM)**.

At minimum, a Java program requires:
- A **class**
- A **main method** (entry point)

---

## 2. Basic Structure of a Java Program

```java
package com.example.app;

import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
````

Each part of this program has a specific role.
The following sections explain each component in detail.

---

## 3. Package Declaration

```java
package com.example.app;
```

### Purpose

* Groups related classes
* Avoids class name conflicts
* Improves modularity and maintainability

### Rules

* Must be the **first statement** in the file
* Written in **lowercase**
* Optional (default package exists but not recommended)

---

## 4. Import Statements

```java
import java.util.Scanner;
import java.util.*;
```

### Purpose

* Allows access to classes defined in other packages
* Reduces need for fully qualified class names

### Rules

* Written after package declaration
* Multiple imports allowed
* Wildcard imports allowed but discouraged in large projects

---

## 5. Class Declaration

```java
public class MainApplication {
}
```

### Purpose

* Blueprint for objects
* Container for methods and variables

### Key Points

* Every Java program must have **at least one class**
* File name must match the public class name
* `public` allows JVM access

---

## 6. Access Modifiers

Common access modifiers used in Java:

| Modifier  | Scope                    |
| --------- | ------------------------ |
| public    | Accessible everywhere    |
| protected | Same package or subclass |
| default   | Same package only        |
| private   | Same class only          |

```java
public class UserService {
    private int count;
}
```

---

## 7. Main Method (Entry Point)

```java
public static void main(String[] args)
```

### Purpose

* Starting point of program execution
* JVM always looks for this method

### Breakdown

* `public` → JVM can access it
* `static` → No object needed
* `void` → No return value
* `String[] args` → Command-line arguments

---

## 8. Method Body

```java
{
    System.out.println("Hello, World!");
}
```

### Purpose

* Contains executable statements
* Defines program behavior

---

## 9. Statements

```java
System.out.println("Hello, World!");
```

### Purpose

* Individual instructions executed by JVM
* Must end with a semicolon (`;`)

---

## 10. Comments

### Single-line Comment

```java
// This is a comment
```

### Multi-line Comment

```java
/*
 This is a
 multi-line comment
*/
```

### Documentation Comment

```java
/**
 * This method prints a message
 */
```

### Purpose

* Improve readability
* Explain intent
* Generate documentation (JavaDoc)

---

## 11. Variables

```java
int count = 10;
String name = "Alice";
```

### Purpose

* Store data
* Can be local, instance, or static

---

## 12. Methods (Functions)

```java
public int add(int a, int b) {
    return a + b;
}
```

### Purpose

* Encapsulate logic
* Promote reusability and modularity

---

## 13. Objects

```java
User user = new User();
```

### Purpose

* Runtime instance of a class
* Used to access class members

---

## 14. Control Flow Statements

### Conditional

```java
if (count > 0) {
    System.out.println("Positive");
}
```

### Loop

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

---

## 15. Complete Execution Flow

1. `.java` file is written
2. Compiled using `javac`
3. Bytecode (`.class`) is generated
4. JVM loads the class
5. JVM calls `main()`
6. Program executes line by line

---

## 16. Minimal Valid Java Program

```java
class Main {
    public static void main(String[] args) {
    }
}
```

---

## 17. Key Rules to Remember

* Java is **case-sensitive**
* One public class per file
* File name must match public class name
* Main method signature must be exact
* Statements end with semicolons

---

## Final Principle

**Understanding the anatomy of a Java program is foundational.**
Every framework, library, and enterprise system in Java builds on this structure.

```