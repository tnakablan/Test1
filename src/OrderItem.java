public class OrderItem {
    static int staticInt = 1;

    private int id;
    private String itemName;
    private double itemPrice;

    public OrderItem(String itemName, double itemPrice) {
        this.id = staticInt++;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public int getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }
}
