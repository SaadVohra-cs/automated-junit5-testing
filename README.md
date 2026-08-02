# Java Integer Overflow & JUnit 5 Testing

A Java project demonstrating secure arithmetic operations, boundary value analysis, and automated unit testing using the JUnit 5 framework.

## Overview
This project explores the mechanics of 32-bit integer overflow in Java and provides a secure methodology for handling large-number calculations. It includes a custom `RangeChecker` utility that safely processes arithmetic operations using `long` casting and explicitly throws an `ArithmeticException` when standard integer limits are exceeded.

## Features
* **Vulnerability Demonstration:** `OverflowDemo.java` contrasts silent integer overflow with secure overflow management using Java's built-in `Math.addExact()`.
* **Secure Arithmetic:** `RangeChecker.java` manually validates numeric bounds against `Integer.MAX_VALUE` and `Integer.MIN_VALUE` before returning a result.
* **Automated Testing:** `RangeCheckerTest.java` utilizes JUnit 5 `@ParameterizedTest` and `@CsvSource` to efficiently validate multiple boundary edge cases and confirm expected exception handling.

## Technologies Used
* Java
* JUnit 5 (Jupiter)

## How to Run
1. Clone the repository to your local machine.
2. Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code).
3. Ensure JUnit 5 is added to your project's build path or dependencies.
4. Run the `RangeCheckerTest.java` file to execute the automated test suite.
5. Run `OverflowDemo.java` to view the console output demonstrating silent versus managed overflows.
