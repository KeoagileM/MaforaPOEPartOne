/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package rc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Keoagile Mafora (ST10457036)
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    //Test Method getFirstName
    @Test
    public void testGetFirstName() {
        System.out.println("get first name");
        Login instance = new Login();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // If it failed
        fail("Wrong");
    }

    //Test getLastName
    @Test
    public void testGetLastName() {
        System.out.println("get last name");
        Login instance = new Login();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // If it failed
        fail("Wrong");
    }

    //Test method getUserName
    @Test
    public void testGetUserName() {
        System.out.println("get user name");
        Login instance = new Login();
        String expResult = "";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // If it failed
        fail("Wrong");
    }

    //Test method getPassword
    @Test
    public void testGetPassword() {
        System.out.println("get password");
        Login instance = new Login();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // If it failed
        fail("Wrong");
    }

    //Test method setFirstName
    @Test
    public void testSetFirstName() {
        System.out.println("set first name");
        String firstName = "";
        Login instance = new Login();
        instance.setFirstName(firstName);
        // If it failed
        fail("Wrong");
    }

    //test method setLastName
    @Test
    public void testSetLastName() {
        System.out.println("set last name");
        String lastName = "";
        Login instance = new Login();
        instance.setLastName(lastName);
        // If it failed
        fail("Wrong");
    }

    // test method setUserName
    @Test
    public void testSetUserName() {
        System.out.println("set username");
        String userName = "";
        Login instance = new Login();
        instance.setUserName(userName);
        // If it failed
        fail("Wrong");
    }

    //Test method setPassword
    @Test
    public void testSetPassword() {
        System.out.println("set Password");
        String password = "";
        Login instance = new Login();
        instance.setPassword(password);
        // If it failed
        fail("Wrong");
    }

    //Test method checkUserName
    @Test
    public void testCheckUserName() {
        System.out.println("check the userName");
        String userName = "kul_1";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkUserName();
        assertEquals(expResult, result);
        // If it failed
        fail("Wrong");
    }

    //Test method checkPasswordComplexity
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("Check the Password Complexity");
        String passWord ="Ch&&sec@ke99!";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity();
        assertEquals(expResult, result);
        // If it failed
        fail("Wrong");
    }

    //Test method isSpecialCharacter
    @Test
    public void testIsSpecialCharacter() {
        System.out.println("Password has special character");
        char c = ' ';
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.isSpecialCharacter(c);
        assertEquals(expResult, result);
        // If it failed
        fail("Wrong");
    }

    //Test method loginUser
    @Test
    public void testLoginUser() {
        System.out.println("Login the User");
        String LoginUsername = "kyl_1";
        String loginPassword = "Ch&&sec@ke99!";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginUser(LoginUsername, loginPassword);
        assertEquals(expResult, result);
        // If it failed
        fail("Wrong");
    }

    //Test method returnLogin
    @Test
    public void testReturnLogin() {
        System.out.println("Return the Login");
        boolean status = false;
        Login instance = new Login();
        String expResult = "";
        String result = instance.returnLogin(status);
        assertEquals(expResult, result);
        // If it failed
        fail("Wrong");
    }
    
}
