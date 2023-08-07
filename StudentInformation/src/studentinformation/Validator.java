
package studentinformation;

/**
 *
 * @author Administrator
 */
public class Validator {
    
    String username = "1";
    String password = "1";
    
    String enteredUsername;
    String enteredPassword;

    public Validator(String enteredUsername, String enteredPassword) {
        this.enteredUsername = enteredUsername;
        this.enteredPassword = enteredPassword;
    }
    
    public boolean validate() {
        return (enteredUsername.equals(username) && enteredPassword.equals(password));
    }
    
}