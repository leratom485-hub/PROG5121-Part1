/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quickchatpart1;


public class Login {

    // User information
    private String username;
    private String password;
    private String cellPhone;
    private String firstName;
    private String lastName;
    private String enteredUsername;
    private String enteredPassword;

    // Constructor
    public Login(String username, String password, String cellPhone,
                 String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.cellPhone = cellPhone;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Check whether the username is valid
    public boolean checkUserName() {
        return username.contains("_") && username.length() <= 5;
    }
    // Check whether the password meets the requirements
public boolean checkPasswordComplexity() {

    boolean hasUppercase = false;
    boolean hasNumber = false;
    boolean hasSpecialCharacter = false;

    for (char character : password.toCharArray()) {

        if (Character.isUpperCase(character)) {
            hasUppercase = true;
        }

        if (Character.isDigit(character)) {
            hasNumber = true;
        }

        if (!Character.isLetterOrDigit(character)) {
            hasSpecialCharacter = true;
        }
    }

    return password.length() >= 8
            && hasUppercase
            && hasNumber
            && hasSpecialCharacter;
}
// Check whether the cellphone number is valid
public boolean checkCellPhoneNumber() {

    String regex = "^\\+\\d{1,3}\\d{7,10}$";

    return cellPhone.matches(regex);
}
// Register the user
public String registerUser() {

    if (!checkUserName()) {
        return "Username is incorrectly formatted.";
    }

    if (!checkPasswordComplexity()) {
        return "Password does not meet the complexity requirements.";
    }

    if (!checkCellPhoneNumber()) {
        return "Cellphone number is incorrectly formatted.";
    }

    return "User registered successfully.";
}
// Store the details entered during login
public void setLoginDetails(String enteredUsername, String enteredPassword) {
    this.enteredUsername = enteredUsername;
    this.enteredPassword = enteredPassword;
}
// Check whether the login details match the registered details
public boolean loginUser() {
    return username.equals(enteredUsername)
            && password.equals(enteredPassword);
}
// Return the login status message
public String returnLoginStatus() {

    if (loginUser()) {
        return "Welcome " + firstName + " " + lastName
                + ", it is great to see you again.";
    } else {
        return "Username or password incorrect, please try again.";
    }
}
}
