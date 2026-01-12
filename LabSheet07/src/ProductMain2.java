public class ProductMain2 {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "Pens";
        product1.price = 10.5;
        product1.quantity = 50;
        Product product2 = new Product();
        product2.name = "Notebooks";
        product2.price = 25.75;
        product2.quantity = 20;

        System.out.print("Welcome to Mini Shop");
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println();
        System.out.print("Press [1] to buy Pen");
        System.out.print("Press [2] to buy Notebook");

    }
}
