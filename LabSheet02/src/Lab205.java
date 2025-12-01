import javax.swing.*;

public class Lab205 {
    public static void main(String[] args) {
        int minute = Integer.parseInt(JOptionPane.showInputDialog("Input minutes: "));
        int Hour = minute / 60;
        int Min = minute % 60;

        JOptionPane.showMessageDialog(null,
                minute + " minutes is " + Hour + " hour " + Min +" minutes ");
    }
}
