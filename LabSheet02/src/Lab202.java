import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat frm = new DecimalFormat("#,###");

        System.out.print("Enter number 1 : ");

        double num1 = Double.parseDouble( scan.next());

        System.out.print("Enter number 2 : ");

        double num2 = Double.parseDouble(scan.next());
        System.out.println();

        System.out.println("Summation = "+ frm.format(num1 + num2));
        System.out.println("Subtraction = "+ frm.format(num1 - num2));
        System.out.println("Multiplication = "+ frm.format(num1 * num2));
        System.out.println("Division = "+ (num1 / num2));
        System.out.println("Modulus = "+ frm.format(num1 % num2));
    }
}
