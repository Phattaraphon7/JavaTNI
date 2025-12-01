import javax.swing.*;
import java.util.Scanner;

public class Lab302 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = JOptionPane.showInputDialog("Enter your name : ");

        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height (cm) : "));
        String pronoun = "";
        double weight = 0;

        int geMale = JOptionPane.showConfirmDialog(null,
                "Are you biological Male?",
                "Gender",JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);

        if(geMale == JOptionPane.YES_OPTION)
        {
            weight = height - 100;
            pronoun = "Mr.";
            JOptionPane.showMessageDialog(null,
                    "Hello " + pronoun + name +
                            "\nif your height is " + height +" cm" +
                            "\nYour weight should be " + weight + "kg");

        } else if (geMale == JOptionPane.NO_OPTION)
        {
            int FeMale = JOptionPane.showConfirmDialog(null,
                    "Are you biological Female?",
                    "Gender",JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);
            if(FeMale == JOptionPane.YES_OPTION)
            {
                weight = height - 110;
                pronoun = "Ms.";
                JOptionPane.showMessageDialog(null,
                        "Hello " + pronoun + name +
                                "\nif your height is " + height +" cm" +
                                "\nYour weight should be " + weight + "kg");
            }
            else if (FeMale == JOptionPane.NO_OPTION)
            {
                JOptionPane.showMessageDialog(null,
                        "You can use BMI to measure your weight and height");
            }
        }

    }
}
