import java.util.Scanner;

public class Lab301 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int intnum = scanner.nextInt();

        String posiOrnega = "";
        String oddOrreven = "";

        while (true){
            if(intnum == 0)
            {
                System.out.println("This is Zero number");
                break;


            }

            if(intnum % 2 == 0)
            {
                oddOrreven = "Even";
                if(intnum > 0)
                {
                    posiOrnega = "Positive";
                }
                else if (intnum < 0)
                {
                    posiOrnega = "Negative";
                }
            }

            else if(intnum % 2 == 1 || intnum % 2 == -1)
            {
                oddOrreven = "Odd";
                if(intnum > 0)
                {
                    posiOrnega = "Positive";
                }
                else if (intnum < 0)
                {
                    posiOrnega = "Negative";
                }
            }
            System.out.println("This number is " + oddOrreven +" and "+ posiOrnega + " number.");break;

        }

    }
}
