import java.util.Scanner;

public class Lab601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];

        for (int i =0;i < number.length;i++){
            System.out.print("Enter number " + (i+1) + ": ");
            number[i] = sc.nextInt();

            while (number[i] <1 ){
                System.out.print("Enter number must bo positive! Enter number again: ");
                number[i] = sc.nextInt();
            }

        }
        System.out.println();
        System.out.print("List of Even number: ");
        for(int num : number){
            if (num % 2 == 0){
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.print("List of odd number: ");
        for(int num : number){
            if (!(num % 2 == 0)){
                System.out.print(num + " ");
            }
        }

    }
}
