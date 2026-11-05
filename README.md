# QuickChat - Part 1

## Module
PROG5121 Programming 1A

## Project Overview
This project is a console-based Java application that implements the registration and login features for QuickChat. It allows a user to register by entering their personal details and creating login credentials. The application checks whether the information meets the required validation rules before allowing the user to log in.

## Main Features
- Username validation.
- Password complexity validation.
- Cell phone number validation.
- User registration.
- User login.
- Login success and failure messages.
- JUnit unit testing.

## Technologies Used
- Java (JDK 21)
- Apache NetBeans
- Maven
- JUnit 5
- Git and GitHub

## Project Structure
The project is organised into the following main files:

- `Main.java` – Runs the console application and receives user input.
- `Login.java` – Contains the registration, validation and login methods.
- `LoginTest.java` – Contains unit tests for checking the application’s functionality.
- `pom.xml` – Contains the Maven project configuration and JUnit dependency.

## How to Run the Application
1. Open the `QuickChatPart1` Maven project in Apache NetBeans.
2. Locate `Main.java` under Source Packages.
3. Run the `Main.java` file.
4. Follow the instructions displayed in the NetBeans Output window.

## Testing
JUnit 5 is used to test the registration and login functionality.

The `LoginTest.java` file contains eight unit tests covering valid and invalid usernames, passwords and cellphone numbers, as well as successful and unsuccessful login attempts.

The tests were run successfully, with eight tests passing and no failures or errors.

## References

- Independent Communications Authority of South Africa (ICASA). (2016). *Numbering Plan Regulations, 2016*. Government Gazette No. 39861. https://www.icasa.org.za/uploads/files/NumberingPlanReg.pdf

- Oracle. (2023). *Java SE 21: Pattern Class*. https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/regex/Pattern.html
- PROG5121 Programming 1A Part 1 Student Guide.
