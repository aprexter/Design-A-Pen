# 🖊️ Pen Management System (Java Low-Level Design)

## Overview

The **Pen Management System** is a Java-based Low-Level Design (LLD) project that models different types of pens using Object-Oriented Design principles and design patterns.

This project focuses on designing an extensible and maintainable system rather than simply implementing functionality. It demonstrates how real-world objects can be modeled using abstraction, composition, and polymorphism.

---

## Problem Statement

"Design a Pen" is a common Low-Level Design interview problem used to evaluate a candidate's ability to model real-world systems while following sound object-oriented design principles.

The goal of this project is to build a flexible design that allows new pen types and behaviors to be added with minimal changes to the existing code.

---

## Features

* Supports multiple pen types

  * Ball Pen
  * Gel Pen
  * Fountain Pen

* Models pen properties such as:

  * Company
  * Price
  * Body Color
  * Pen Type
  * Refill Compatibility
  * Writing Behavior

* Extensible architecture for adding new pen types

* Clean separation of responsibilities

---

## Design Patterns Used

### Builder Pattern

Used to construct complex Pen objects while keeping object creation readable and flexible.

Benefits:

* Eliminates telescoping constructors
* Improves readability
* Makes object creation easier

---

### Strategy Pattern

Used for interchangeable writing behaviors.

Examples:

* Smooth Writing
* Fast Writing
* Rough Writing

Benefits:

* Removes conditional logic
* Promotes composition over inheritance
* Makes behaviors easily replaceable

---

## Object-Oriented Principles

This project demonstrates:

* Abstraction
* Encapsulation
* Inheritance
* Polymorphism
* Composition

---

## SOLID Principles Applied

* **Single Responsibility Principle (SRP)** – Every class has a well-defined responsibility.
* **Open/Closed Principle (OCP)** – New pen types and behaviors can be added without modifying existing classes.
* **Liskov Substitution Principle (LSP)** – Child classes can replace parent types safely.
* **Interface Segregation Principle (ISP)** – Interfaces expose only the required functionality.
* **Dependency Inversion Principle (DIP)** – High-level classes depend on abstractions instead of concrete implementations.

---

## Project Structure

```text
src/
├── builder/
├── enums/
├── pen/
├── refill/
├── strategy/
├── factory/        (if applicable)
├── interfaces/
└── Main.java
```

---

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Design Patterns
* Maven (if applicable)

---

## Sample Object Creation

```java
BallPen pen = new BallPen.Builder()
        .company(Company.PARKER)
        .price(new BigDecimal("50"))
        .bodyColor(Color.BLUE)
        .writingBehaviour(new SmoothWritingBehaviour())
        .refill(refill)
        .build();
```

---

## Future Enhancements

* Factory Pattern for pen creation
* Inventory Management
* Pen Store Management
* REST API using Spring Boot
* Database Integration
* Unit Testing using JUnit
* Dependency Injection using Spring

---

## Learning Outcomes

Through this project, I learned how to:

* Design real-world systems using Object-Oriented Programming
* Apply design patterns appropriately
* Build extensible and maintainable software
* Think from an interview-oriented Low-Level Design perspective
* Improve code readability and scalability

---



If you found this project interesting or have suggestions for improvement, feel free to connect with me on LinkedIn or raise an issue in this repository.

⭐ If you like this project, consider giving it a star!
