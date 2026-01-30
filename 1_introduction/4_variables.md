# Java Variable Naming & Usage Conventions

## Objective
This document defines **standard rules for declaring, naming, and using variables in Java** to ensure readability, maintainability, and consistency across enterprise-grade codebases.

---

## 1. What Is a Variable in Java
A variable is a named memory location used to store data that can change during program execution.

```java
int totalAmount = 100;
````

---

## 2. Variable Naming Rules (Mandatory)

* Use **camelCase**
* Use **descriptive, intention-revealing names**
* Start with a **letter**, not a number
* No spaces or special characters (except `_`, rarely)
* Avoid abbreviations unless universally known
* Never use Hungarian notation

---

## 3. Naming Style (DO vs DON’T)

### ✅ Good

```java
int totalAmount;
String customerName;
boolean isVerified;
List<Order> orderList;
```

### ❌ Bad

```java
int x;
String str;
boolean flag;
List<Order> list1;
```

---

## 4. Variable Types in Java

### 4.1 Local Variables

* Declared inside methods or blocks
* Must be initialized before use
* Scope limited to the block

```java
public void calculate() {
    int sum = 0;
}
```

---

### 4.2 Instance Variables (Non-static Fields)

* Declared inside a class, outside methods
* Belong to an object
* Default values assigned by JVM

```java
public class User {
    String name;
    int age;
}
```

---

### 4.3 Static Variables (Class Variables)

* Declared with `static`
* Shared across all instances

```java
public class AppConfig {
    static int maxUsers = 100;
}
```

---

### 4.4 Constant Variables

* Declared using `static final`
* Must be immutable
* Use **UPPER_CASE**

```java
public static final int MAX_RETRY_COUNT = 3;
public static final String DEFAULT_LANGUAGE = "en";
```

---

## 5. Boolean Variable Naming

### Rules

* Must clearly express a condition
* Prefix with `is`, `has`, `can`, or `should`

### Examples

```java
boolean isActive;
boolean hasPermission;
boolean canProcess;
boolean shouldRetry;
```

❌ Avoid

```java
boolean active;
boolean permission;
```

---

## 6. Collection Variable Naming

### Rules

* Use **plural nouns**
* Indicate content type

```java
List<User> users;
Set<String> roles;
Map<Long, Order> orderMap;
```

❌ Avoid

```java
List<User> list;
Map data;
```

---

## 7. Loop Variable Naming

### Allowed Single Letters

* `i`, `j`, `k` only for small scopes

```java
for (int i = 0; i < users.size(); i++) {
}
```

### Prefer Meaningful Names for Complex Loops

```java
for (User user : users) {
}
```

---

## 8. Temporary Variables

### Rules

* Keep scope minimal
* Name based on purpose

```java
double discountedPrice;
int retryCount;
```

❌ Avoid

```java
double temp;
int value;
```

---

## 9. Avoid These Anti-Patterns

❌ Type in name (Hungarian notation)

```java
String strName;
int iCount;
```

❌ Meaningless names

```java
Object data;
String value;
```

❌ Overly long names

```java
int totalAmountAfterApplyingDiscountAndTaxCalculation;
```

---

## 10. Recommended Length

* **3–30 characters**
* Long enough to be clear
* Short enough to be readable

---

## 11. Variable Initialization Best Practices

* Initialize as close as possible to usage
* Avoid delayed initialization
* Prefer immutable variables when possible

```java
final int timeout = 5000;
```

---

## 12. Final Rules (Non-Negotiable)

* Readability > cleverness
* Variable names must explain themselves
* Poor variable naming increases bugs
* Good variable naming reduces comments

---

## Final Thought

**Variables are the smallest unit of code — and the biggest source of confusion when named poorly.**
Treat naming as part of design, not as an afterthought.

```