# Data Types in Java

## Objective
This document defines **all data types in Java**, their categories, usage rules, memory characteristics, and best practices.  
It is intended for **professional Java development**, interviews, and enterprise-grade applications.

---

## 1. What Is a Data Type in Java
A data type defines:
- The **type of data** a variable can hold
- The **memory size** allocated
- The **operations** allowed on the data

```java
int age = 25;
````

---

## 2. Categories of Data Types in Java

Java data types are divided into **two main categories**:

1. **Primitive Data Types**
2. **Non-Primitive (Reference) Data Types**

---

## 3. Primitive Data Types

Primitive data types store **actual values** directly in memory.
Java has **8 primitive data types**.

---

### 3.1 byte

* Size: **1 byte (8 bits)**
* Range: `-128` to `127`
* Default value: `0`

```java
byte retryCount = 5;
```

**Use case**

* Memory-sensitive data
* Streams, files, network buffers

---

### 3.2 short

* Size: **2 bytes**
* Range: `-32,768` to `32,767`
* Default value: `0`

```java
short portNumber = 8080;
```

---

### 3.3 int

* Size: **4 bytes**
* Range: `-2^31` to `2^31 - 1`
* Default value: `0`

```java
int totalUsers = 100000;
```

✅ **Most commonly used integer type**

---

### 3.4 long

* Size: **8 bytes**
* Range: `-2^63` to `2^63 - 1`
* Default value: `0L`

```java
long transactionId = 9876543210L;
```

---

### 3.5 float

* Size: **4 bytes**
* Precision: ~7 decimal digits
* Default value: `0.0f`

```java
float discountRate = 10.5f;
```

❌ Not recommended for financial calculations

---

### 3.6 double

* Size: **8 bytes**
* Precision: ~15 decimal digits
* Default value: `0.0d`

```java
double accountBalance = 15432.75;
```

✅ Preferred for decimal calculations (non-financial)

---

### 3.7 char

* Size: **2 bytes**
* Stores a single Unicode character
* Default value: `'\u0000'`

```java
char grade = 'A';
```

---

### 3.8 boolean

* Size: JVM dependent (logically 1 bit)
* Values: `true` or `false`
* Default value: `false`

```java
boolean isActive = true;
```

---

## 4. Primitive Data Type Summary Table

| Type    | Size    | Default  | Example             |
| ------- | ------- | -------- | ------------------- |
| byte    | 1 byte  | 0        | `byte b = 10;`      |
| short   | 2 bytes | 0        | `short s = 100;`    |
| int     | 4 bytes | 0        | `int i = 1000;`     |
| long    | 8 bytes | 0L       | `long l = 10L;`     |
| float   | 4 bytes | 0.0f     | `float f = 1.5f;`   |
| double  | 8 bytes | 0.0d     | `double d = 1.5;`   |
| char    | 2 bytes | '\u0000' | `char c = 'A';`     |
| boolean | JVM     | false    | `boolean b = true;` |

---

## 5. Non-Primitive (Reference) Data Types

Non-primitive data types store **references (memory addresses)** instead of actual values.

---

### 5.1 String

* Immutable
* Stored in String Pool
* Most commonly used reference type

```java
String name = "Alice";
```

---

### 5.2 Arrays

* Fixed size
* Can store primitives or objects

```java
int[] numbers = {1, 2, 3};
String[] names = new String[5];
```

---

### 5.3 Classes

* Blueprint for objects

```java
class User {
    String name;
    int age;
}
```

---

### 5.4 Objects

* Instance of a class

```java
User user = new User();
```

---

### 5.5 Interfaces

* Contract without implementation

```java
interface PaymentService {
    void processPayment();
}
```

---

### 5.6 Enums

* Fixed set of constants

```java
enum Status {
    ACTIVE,
    INACTIVE
}
```

---

### 5.7 Wrapper Classes

Object representation of primitive types.

| Primitive | Wrapper   |
| --------- | --------- |
| byte      | Byte      |
| short     | Short     |
| int       | Integer   |
| long      | Long      |
| float     | Float     |
| double    | Double    |
| char      | Character |
| boolean   | Boolean   |

```java
Integer count = 10;
```

---

## 6. Primitive vs Non-Primitive (Key Differences)

| Feature       | Primitive | Non-Primitive         |
| ------------- | --------- | --------------------- |
| Stores value  | Yes       | No (stores reference) |
| Null allowed  | No        | Yes                   |
| Default value | Fixed     | null                  |
| Memory        | Stack     | Heap                  |
| Performance   | Faster    | Slightly slower       |

---

## 7. Type Casting in Java

### 7.1 Implicit Casting (Widening)

```java
int x = 10;
double y = x;
```

---

### 7.2 Explicit Casting (Narrowing)

```java
double price = 99.99;
int roundedPrice = (int) price;
```

---

## 8. Best Practices

* Use `int` by default for integers
* Use `double` instead of `float`
* Never use floating types for money → use `BigDecimal`
* Prefer primitives over wrappers unless null is required
* Avoid unnecessary casting

---

## 9. Common Mistakes

❌ Using `float` for currency
❌ Forgetting `L` for long literals
❌ Comparing wrapper objects with `==`
❌ Assuming default values for local variables

---

## Final Principle

**Choosing the correct data type is a design decision, not a syntax detail.**
Right data types improve performance, reduce bugs, and clarify intent.

```