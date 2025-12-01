import java.util.Scanner;

public class Lab305 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstnum =Integer.parseInt(scan.next());

        System.out.print("Enter the second number: ");
        int secondnum =Integer.parseInt(scan.next());

        for (int i = firstnum; i <= secondnum; i++){
            if (i % 2 == 0){
                System.out.print("" + i + " ");
            }
        }
    }
}
