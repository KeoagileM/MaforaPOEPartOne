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
public class MaforaPOEPartOneTest {
    
    public MaforaPOEPartOneTest() {
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

    //Testing the method main
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MaforaPOEPartOne.main(args);
        // If it failed
        fail("Wrong");
    }

    //Tests the method registerUser
    @Test
    public void testRegisterUser() {
        System.out.println("Register the user");
        MaforaPOEPartOne.registerUser();
        // If it failed
        fail("Wrong");
    }

    //Test the method loginStatus
    @Test
    public void testLoginStatus() {
        System.out.println("login the user");
        MaforaPOEPartOne.loginStatus();
        // If it failed
        fail("Wrong");
    }
    
}
