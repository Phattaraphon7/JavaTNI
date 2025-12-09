import javax.swing.*;

public class Lab401 {
    static void main() {
        String fullName = JOptionPane.showInputDialog("Enter your full name:");

        if(fullName == null || fullName.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter your full name!");
            return;
        }

        JOptionPane.showMessageDialog(null, "Welcome, " + fullName);
    }
}
