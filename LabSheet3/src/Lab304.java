import javax.swing.*;
import java.text.DecimalFormat;

public class Lab304 {
    public static void main(String[] args) {
        DecimalFormat frm = new DecimalFormat("####.00");
        double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight (kg.): "));

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height (cm.): "));

        double heightM = height /100;
        double bmi = weight / (heightM * heightM);

        String result = "";
        if(bmi < 18.5)
        {
              result = "UnderWeight";
        }
        else if (bmi >= 18.5 && bmi <= 24.9)
        {
            result = "Healthly Weight";
        }
        else if (bmi >= 25 && bmi <= 29.9)
        {
            result = "Overweight";
        }
        else if (bmi > 30)
        {
            result = "Obese";
        }

        JOptionPane.showMessageDialog(null,
                "Your bmi is " + frm.format(bmi) + "\nBmi result is " + result);

    }
}
