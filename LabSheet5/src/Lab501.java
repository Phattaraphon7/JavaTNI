import javax.swing.*;

public class Lab501 {
    public static double cal_bmi(double weight, double height_cm) {
    double height_m = height_cm / 100;
    return weight / (height_m * height_m);
}


    public static String check_bmi(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }


    public static void main(String[] args) {

        int confirm = JOptionPane.showConfirmDialog(
                null,
                "Do you want to check your BMI?",
                "Confirm",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {

            double weight = Double.parseDouble(
                    JOptionPane.showInputDialog("Enter weight (kg):")
            );

            double height = Double.parseDouble(
                    JOptionPane.showInputDialog("Enter height (cm):")
            );

            double bmi = cal_bmi(weight, height);
            String result = check_bmi(bmi);

            JOptionPane.showMessageDialog(
                    null,
                    String.format("Your BMI = %.2f\nYour BMI result = %s", bmi, result)
            );

        } else {
            JOptionPane.showMessageDialog(null, "END PROGRAM!!");
        }



    }
}
