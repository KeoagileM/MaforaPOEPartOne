package rc;

import javax.swing.JOptionPane;

/**
 * @author Keoagile Mafora (ST10457036)
 */
public class MaforaPOEPartOne {
    static Login objLogin = new Login();
    public static void main(String[] args) {
    registerUser();
    loginStatus();
    
    
    }
   
    //Method to promt the user for input
    public static void registerUser() {
    
    objLogin.setFirstName(JOptionPane.showInputDialog("Enter First Name"));
    objLogin.setLastName(JOptionPane.showInputDialog("Enter Last Name"));
    
    
    
    do {
        
    objLogin.setUserName(JOptionPane.showInputDialog(null,"Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length ","Username Validation",JOptionPane.QUESTION_MESSAGE));
  
    }while (objLogin.checkUserName());
          JOptionPane.showMessageDialog(null, "Username successfully captured", "Thank You", JOptionPane.INFORMATION_MESSAGE);
    do{
    objLogin.setPassword(JOptionPane.showInputDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.", "Password Validation", JOptionPane.QUESTION_MESSAGE));
    }while (!objLogin.checkPasswordComplexity());
           JOptionPane.showMessageDialog(null, "Password successfully captured", "Thank You", JOptionPane.INFORMATION_MESSAGE);
           
    }
    
    //Method for login 
    
    public static void loginStatus() {
        String loginUsername, loginPassword;
        loginUsername = JOptionPane.showInputDialog("Enter your registered username:");
        loginPassword = JOptionPane.showInputDialog("Enter your registered password:");
        
        
        boolean loggedUser = objLogin.loginUser(loginUsername, loginPassword);
        System.out.println("logged user:"+ loggedUser);
        
        String status = objLogin.returnLogin(loggedUser);
        JOptionPane.showMessageDialog(null, status);
        System.out.println(status);
    }
    
}
 