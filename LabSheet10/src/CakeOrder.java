import java.util.Scanner;

public class CakeOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birthday Cake Details:");
        System.out.print("Enter a message on cake: ");
        String message = scanner.nextLine();
        System.out.print("Enter a flavor: ");
        String flavor = scanner.next();
        System.out.print("How many pound: ");
        double pound = scanner.nextDouble();


        BirthdayCake order1 = new BirthdayCake(message, pound, flavor, 350);

        System.out.println(order1);
        System.out.println();

        System.out.println("CupCake Details:");
        System.out.print("Enter a flavor: ");
        flavor = scanner.next();
        System.out.print("How many piece: ");
        int piece = scanner.nextInt();

        CupCake order2 = new CupCake(piece, flavor, 20);

        System.out.println(order2);
        System.out.println();

        System.out.println("Cheesecake Details:");
        System.out.print("Enter a name customer: ");
        String name = scanner.next();
        System.out.print("How many piece: ");
        piece = scanner.nextInt();

        CheeseCake order3 = new CheeseCake(piece,"",10,name);
        System.out.print("you need to rename: ");
        name = scanner.next();
        order3.changename(name);

        System.out.println(order3);

        System.out.println("Total price = " + (order1.calculateTotalPrice() + order2.calculateTotalPrice() + order3.calculateTotalPrice()));

    }
}
