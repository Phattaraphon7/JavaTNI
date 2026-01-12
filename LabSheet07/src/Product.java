public class Product {
    public String name;
    public double price = 0;
    public int quantity = 0;


    public void addStock(int amount){
        if(amount > 0){
            quantity += amount;
            System.out.println("Added " + amount + " item to stock");
        }
    }
    public void sell(int amount){
        if(amount <= quantity){
            quantity -= amount;
            System.out.println("Sold" + amount + "item");
        }
        else System.out.println("Not enough item in stock...");
    }
    public void changePrice(double Newprice){
        if(Newprice > 0){
            price = Newprice;
            System.out.println("Change price to " + Newprice + "baht");
        }
    }
    public double stockValue(){
        return quantity * price;
    }
    public void showInfo(){
        System.out.println("Name  : " + name);
        System.out.println("Price : " + price + " Baht/Item");
        System.out.println("Stock : " + quantity + " item");
        System.out.println("Stock Value  : " + stockValue() + " Baht");
    }
}
