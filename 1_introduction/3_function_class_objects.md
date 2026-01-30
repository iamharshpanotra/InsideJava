# Java Naming Conventions — Single Standard File

## Objective
This document defines **mandatory naming conventions** for Java codebases to ensure clarity, consistency, scalability, and long-term maintainability.  
These rules apply to **classes, methods, objects, variables, constants, packages, interfaces, enums, exceptions, DTOs, entities, and tests**.

---

## Global Rules
- Use **English only**
- Prefer **clarity over brevity**
- Names must describe **intent**
- Avoid abbreviations unless industry-standard (`API`, `HTTP`, `DTO`)
- Avoid single-letter names (except loop counters)
- Be consistent across the entire codebase

---

## Package Naming
**Purpose:** Logical grouping

**Rules**
- Lowercase only
- No underscores
- Reverse domain notation

**Format**
```

com.company.project.layer

````

**Examples**
```java
com.acme.user.service
com.acme.order.controller
com.acme.payment.repository
````

---

## Class Naming

**Purpose:** Blueprint / domain model / service

**Rules**

* PascalCase
* Nouns or noun phrases
* No verbs
* No underscores

**Examples**

```java
UserService
OrderController
PaymentProcessor
InventoryManager
```

❌ Avoid

```java
userService
processPayment
payment_processor
```

---

## Object Naming (Class Instances)

**Purpose:** Runtime instance of a class

**Rules**

* camelCase
* Meaningful name
* Reflect role, not type

**Examples**

```java
User user;
Order currentOrder;
PaymentProcessor paymentProcessor;
```

❌ Avoid

```java
User u;
Order obj;
PaymentProcessor p;
```

---

## Method (Function) Naming

**Purpose:** Perform actions or return data

**Rules**

* camelCase
* Must start with a **verb**
* Action-oriented
* Clearly describe behavior

**Examples**

```java
getUserById()
calculateTotalPrice()
createOrder()
validatePayment()
```

❌ Avoid

```java
Calculation()
UserData()
process()
```

---

## Variable Naming

**Purpose:** Store data

**Rules**

* camelCase
* Descriptive
* No Hungarian notation

**Examples**

```java
int totalAmount;
String customerName;
List<Order> orderList;
boolean isVerified;
```

❌ Avoid

```java
int x;
String str;
boolean flag;
```

---

## Constant Naming

**Purpose:** Fixed configuration values

**Rules**

* `public static final`
* UPPER_CASE with underscores

**Examples**

```java
public static final int MAX_LOGIN_ATTEMPTS = 5;
public static final String DEFAULT_CURRENCY = "INR";
```

---

## Boolean Naming

**Purpose:** True/false conditions

**Rules**

* Start with `is`, `has`, `can`, or `should`

**Examples**

```java
boolean isActive;
boolean hasAccess;
boolean canRetry;
boolean shouldLog;
```

---

## Interface Naming

**Purpose:** Contract / capability

**Rules**

* PascalCase
* Role-based naming
* Do NOT prefix with `I`

**Examples**

```java
UserRepository
PaymentGateway
NotificationService
```

❌ Avoid

```java
IUserRepository
IPaymentService
```

---

## Enum Naming

**Purpose:** Fixed set of constants

**Rules**

* Enum name: PascalCase
* Enum values: UPPER_CASE

**Example**

```java
public enum OrderStatus {
    PENDING,
    CONFIRMED,
    SHIPPED,
    CANCELLED
}
```

---

## Exception Naming

**Purpose:** Error handling

**Rules**

* PascalCase
* Must end with `Exception`

**Examples**

```java
UserNotFoundException
InvalidOrderException
UnauthorizedAccessException
```

---

## DTO Naming (Data Transfer Objects)

**Purpose:** API / service communication

**Rules**

* PascalCase
* End with `Dto`

**Examples**

```java
UserDto
OrderRequestDto
PaymentResponseDto
```

---

## Entity Naming (JPA / Domain Models)

**Purpose:** Database-mapped domain objects

**Rules**

* Singular nouns
* Match business language

**Examples**

```java
User
Order
Product
```

❌ Avoid

```java
Users
OrderTable
```

---

## Repository Naming

**Purpose:** Data access layer

**Rules**

* End with `Repository`

**Examples**

```java
UserRepository
OrderRepository
PaymentRepository
```

---

## Service Naming

**Purpose:** Business logic layer

**Rules**

* End with `Service`
* Business-focused naming

**Examples**

```java
UserService
OrderService
PaymentService
```

---

## Controller Naming

**Purpose:** API / Web layer

**Rules**

* End with `Controller`

**Examples**

```java
UserController
AuthController
OrderController
```

---

## Test Class Naming

**Purpose:** Validation and regression

**Rules**

* Match class under test
* End with `Test`

**Examples**

```java
UserServiceTest
OrderControllerTest
PaymentProcessorTest
```

---

## Generic Type Naming

**Purpose:** Reusable type parameters

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

**Purpose:** Logging

**Rules**

* Use `log` or `logger`

**Example**

```java
private static final Logger log =
        LoggerFactory.getLogger(UserService.class);
```

---

## Database Naming (If Applicable)

### Table Names

* snake_case
* Consistent singular/plural usage

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

## Enforcement

* Code reviews must reject violations
* Enforce using:

  * Checkstyle
  * SonarQube
  * IDE inspections

---

## Final Principle

**Good naming is not cosmetic — it is architecture.**
Poor names scale bugs. Good names scale teams.

```