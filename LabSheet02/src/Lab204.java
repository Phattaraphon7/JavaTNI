import java.util.Scanner;

public class Lab204 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input hour : ");
        int Hour = Integer.parseInt( scan.next());

        System.out.print("Input minute : ");
        int Min = Integer.parseInt(scan.next());

        int Totaltime = (Hour*60) + Min;

        System.out.println("Total time is "+ Totaltime +" Minute");

    }
}
