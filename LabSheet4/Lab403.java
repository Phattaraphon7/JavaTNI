import javax.swing.*;

public class Lab403 {
    static void main() {
        final String USERNAME = "admin";
        final String PASSWORD = "Admin1234";

        String user = JOptionPane.showInputDialog("Enter username:");
        String pass = JOptionPane.showInputDialog("Enter password:");

        if(user == null || user.trim().equals("") ||
                pass == null || pass.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter username and password!");
            return;
        }


        if(user.equals(USERNAME) && pass.equals(PASSWORD)) {
            JOptionPane.showMessageDialog(null, "Login Success!");
        }
        else if(user.equals(USERNAME) && !pass.equals(PASSWORD)) {
            JOptionPane.showMessageDialog(null, "Login Fail : Incorrect Password");
        }
        else if(!user.equals(USERNAME) && pass.equals(PASSWORD)) {
            JOptionPane.showMessageDialog(null, "Login Fail : Incorrect Username");
        }
        else {
            JOptionPane.showMessageDialog(null, "Login Fail ");
        }
    }
}
