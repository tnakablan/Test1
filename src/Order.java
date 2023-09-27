
import java.util.ArrayList;
import java.time.LocalDate;
public abstract class Order {
    static int staticInt = 1;
    private int id;
    private String name;
    private String deliveryAddress;
    private ArrayList<OrderItem> items;
    private Customer orderCustomer;
    private double totalPrice;
    private PaymentType paymentType;
    private LocalDate orderDate;
    public Order( String name, String deliveryAddress,
                 Customer orderCustomer, PaymentType paymentType, LocalDate orderDate) {
        this.id = staticInt++;
        this.name = name;
        this.deliveryAddress = deliveryAddress;
        this.items = new ArrayList<>();
        this.orderCustomer = orderCustomer;
        this.paymentType = paymentType;
        this.orderDate = orderDate;
        calculateTotalPrice();
     //   updateCustomerFavoriteItems();
    }


      public abstract double calculateTotalPrice();

  //  private void updateCustomerFavoriteItems() {
     //   for (OrderItem item : items) {
       //     orderCustomer.addToFavoriteItems(item);
     //   }
  //  }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public Customer getCustomer() {
        return orderCustomer;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public  LocalDate getOrderDate() {
        return orderDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setItems(ArrayList<OrderItem> items) {
        this.items = items;
    }

    public void setCustomer(Customer customer) {
        this.orderCustomer = customer;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public void setOrderDate( LocalDate orderDate) {
        this.orderDate = orderDate;
    }
}
