import java.util.Scanner;

public class ProductMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product product1 = new Product();
        product1.name = "Pens";
        product1.price = 10.5;
        product1.quantity = 50;
        Product product2 = new Product();
        product2.name = "Notebooks";
        product2.price = 25.75;
        product2.quantity = 20;

        System.out.println("Welcome to Mini Shop");
        System.out.println("-----------------------------------");
        System.out.println("Press [1] to buy Pen");
        System.out.println("Press [2] to buy Notebook");

        int num = 0;
        while (true){

                System.out.print("Enter a number : ");
                num = scanner.nextInt();


            if(num > 2 || num<1){
                System.out.print("Invalid number! Enter a number, again : ");
            }
            if(num == 1){
                product1.showInfo();
                System.out.println("----------------------------------------");
                System.out.print("How many Pen do you want to buy : ");
                int amPen = scanner.nextInt();
                product1.sell(amPen);
                product1.showInfo();
                
            } else if (num == 2) {
                product2.showInfo();
                System.out.println("----------------------------------------");
                System.out.print("How many Notebook do you want to buy : ");
                int amNotebook = scanner.nextInt();
                product2.sell(amNotebook);
                product2.showInfo();
            }
            break;


        }



    }
}
