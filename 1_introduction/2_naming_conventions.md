# Java Naming Conventions

## Purpose
This document defines standard Java naming conventions to ensure consistency, readability, maintainability, and enterprise-level code quality across projects and teams. These conventions align with Oracle Java standards and modern industry best practices.

---

## General Principles
- Use **English words only**
- Prefer **clarity over brevity**
- Names must be **descriptive and intention-revealing**
- Avoid abbreviations unless widely accepted (e.g., `URL`, `HTTP`, `DTO`)
- Avoid single-character names except loop counters (`i`, `j`, `k`)
- Be consistent across the codebase

---

## Package Naming
- Use **lowercase letters only**
- No underscores or camelCase
- Follow reverse domain name notation

**Format**
```

com.company.project.module

````

**Examples**
```java
com.acme.user.service
com.acme.payment.controller
com.acme.inventory.repository
````

**Avoid**

```java
Com.Acme.Service
com.acme.UserService
```

---

## Class Naming

* Use **PascalCase**
* Use nouns or noun phrases
* No verbs
* No underscores

**Examples**

```java
UserService
OrderController
PaymentProcessor
InventoryManager
```

**Avoid**

```java
userService
payment_processor
ProcessPayment
```

---

## Interface Naming

* Use **PascalCase**
* Use role-based or capability-based names
* Do **not** prefix with `I`

**Examples**

```java
UserRepository
PaymentGateway
NotificationService
```

**Avoid**

```java
IUserRepository
IPaymentService
```

---

## Method Naming

* Use **camelCase**
* Must start with a **verb**
* Clearly express behavior

**Examples**

```java
getUserById()
calculateTotalAmount()
saveOrder()
validatePayment()
```

**Avoid**

```java
Calculation()
Get_User()
data()
```

---

## Variable Naming

* Use **camelCase**
* Names must be meaningful
* Avoid Hungarian notation

**Examples**

```java
int totalAmount;
String userName;
boolean isActive;
List<Order> orderList;
```

**Avoid**

```java
int x;
String str;
boolean flag;
```

---

## Constant Naming

* Must be `static final`
* Use **UPPER_CASE** with underscores

**Examples**

```java
public static final int MAX_RETRY_COUNT = 3;
public static final String DEFAULT_TIMEZONE = "UTC";
```

---

## Enum Naming

* Enum type: **PascalCase**
* Enum values: **UPPER_CASE**

**Example**

```java
public enum OrderStatus {
    PENDING,
    COMPLETED,
    CANCELLED
}
```

---

## Boolean Naming

* Prefix with `is`, `has`, `can`, or `should`

**Examples**

```java
boolean isValid;
boolean hasPermission;
boolean canProcess;
boolean shouldRetry;
```

**Avoid**

```java
boolean valid;
boolean permission;
```

---

## Exception Naming

* Must end with `Exception`
* Use **PascalCase**

**Examples**

```java
UserNotFoundException
InvalidPaymentException
UnauthorizedAccessException
```

---

## DTO Naming

* End with `Dto`
* Use **PascalCase**

**Examples**

```java
UserDto
OrderRequestDto
PaymentResponseDto
```

---

## Entity Naming (JPA / Hibernate)

* Use **singular nouns**
* Match domain terminology

**Examples**

```java
User
Order
Product
```

**Avoid**

```java
Users
OrderTable
```

---

## Repository Naming

* End with `Repository`

**Examples**

```java
UserRepository
OrderRepository
PaymentRepository
```

---

## Service Naming

* End with `Service`
* Represent business logic

**Examples**

```java
UserService
PaymentService
InventoryService
```

---

## Controller Naming

* End with `Controller`

**Examples**

```java
UserController
OrderController
AuthController
```

---

## Test Class Naming

* Match the class under test
* End with `Test`

**Examples**

```java
UserServiceTest
OrderControllerTest
PaymentProcessorTest
```

---

## Generic Type Naming

Use standard single-letter conventions:

| Letter | Meaning |
| ------ | ------- |
| T      | Type    |
| E      | Element |
| K      | Key     |
| V      | Value   |
| R      | Result  |

**Example**

```java
public class ApiResponse<T> {
    private T data;
}
```

---

## Logger Naming

* Use `log` or `logger`

**Example**

```java
private static final Logger log =
        LoggerFactory.getLogger(UserService.class);
```

---

## Database Naming (When Applicable)

### Table Names

* Use snake_case
* Be consistent (singular or plural)

```sql
user
order_item
payment_transaction
```

### Column Names

```sql
user_id
created_at
updated_at
```

---

## Final Notes

* Consistency > personal preference
* Enforce conventions using:

  * Checkstyle
  * SonarQube
  * IDE inspections
* Naming standards must be reviewed during code reviews

**Good naming is a force multiplier for scalability, velocity, and maintainability.**

```

