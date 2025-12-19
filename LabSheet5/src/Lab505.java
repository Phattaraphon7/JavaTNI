import javax.swing.*;

public class Lab505 {
    public static boolean is_palindrome(String word) {

        String rev = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            rev += word.charAt(i);
        }

        return word.equalsIgnoreCase(rev);
    }

    public static void main(String[] args) {

        String word = JOptionPane.showInputDialog("Enter some word :");

        if (is_palindrome(word)) {
            JOptionPane.showMessageDialog(
                    null,
                    word + " is Palindrome"
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    word + " is NOT Palindrome"
            );
        }
    }
}
