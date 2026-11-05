/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quickchatpart1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    @Test
    public void testValidUsername() {
        Login login = new Login(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Lerato",
                "Moshoeshoe"
        );

        assertTrue(login.checkUserName());
    }

    @Test
    public void testInvalidUsername() {
        Login login = new Login(
                "kyle!!!!!!!",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Lerato",
                "Moshoeshoe"
        );

        assertFalse(login.checkUserName());
    }
        @Test
    public void testValidPassword() {
        Login login = new Login(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Lerato",
                "Moshoeshoe"
        );

        assertTrue(login.checkPasswordComplexity());
    }

    @Test
    public void testInvalidPassword() {
        Login login = new Login(
                "kyl_1",
                "password",
                "+27838968976",
                "Lerato",
                "Moshoeshoe"
        );

        assertFalse(login.checkPasswordComplexity());
    }
        @Test
    public void testValidPhoneNumber() {
        Login login = new Login(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Lerato",
                "Moshoeshoe"
        );

        assertTrue(login.checkCellPhoneNumber());
    }

    @Test
    public void testInvalidPhoneNumber() {
        Login login = new Login(
                "kyl_1",
                "Ch&&sec@ke99!",
                "08966553",
                "Lerato",
                "Moshoeshoe"
        );

        assertFalse(login.checkCellPhoneNumber());
    }
        @Test
    public void testSuccessfulLogin() {
        Login login = new Login(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Lerato",
                "Moshoeshoe"
        );

        login.setLoginDetails("kyl_1", "Ch&&sec@ke99!");

        assertTrue(login.loginUser());
    }

    @Test
    public void testUnsuccessfulLogin() {
        Login login = new Login(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Lerato",
                "Moshoeshoe"
        );

        login.setLoginDetails("wrong", "password");

        assertFalse(login.loginUser());
    }
}
