public class CheeseCake extends Bakery{
    private int piece;
    private String name;

    public CheeseCake(int piece, String flavor, double unitPrice, String name){
        super(flavor, unitPrice);
        this.piece = piece;
        this.name = name;
    }

    public boolean isPackingBox(){
        return piece >= 1;
    }

    public int getBoxNumber(){
        if(isPackingBox()){
            return piece / 1;
        }
        return 0;
    }
    public String getName(){
        return this.name;
    }
    public String changename(String new_name){
        return  this.name = new_name ;
    }

    @Override
    public int getPackingCost(){
            return getBoxNumber() * super.getPackingCost();
    }
    @Override
    public double calculateTotalPrice(){
        return this.piece * getUnitPrice() + getPackingCost();
    }

    public String toString(){
        return super.toString() + "\n" + this.name  + " \nCheeseCake " + super.getFlavor() + " with " + getBoxNumber() + " Box " +
                "\nTotal of CheeseCake = " + calculateTotalPrice();
    }
}
