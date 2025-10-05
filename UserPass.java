import javax.swing.JOptionPane;
import javax.swing.JPasswordField;


public class UserPass {
    public static boolean authenticate(){

        String username = JOptionPane.showInputDialog(null, "Username", "Login", JOptionPane.QUESTION_MESSAGE);
        if(username == null) return false;
    
        if(username.equalsIgnoreCase("sepehr")){
            JPasswordField passwordField = new JPasswordField();
            int option = JOptionPane.showConfirmDialog(null, passwordField, "Password:", JOptionPane.OK_CANCEL_OPTION);
            if(option == JOptionPane.OK_OPTION){
                String password = new String(passwordField.getPassword());
                if(password.equals("123")){
                    JOptionPane.showMessageDialog(null, "Logged in");
                    return true;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect Pass","Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        else{
            JOptionPane.showMessageDialog(null, "Incorrect Username", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    return false;
    }
}
