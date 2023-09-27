import Gifts.Gift;

import java.util.ArrayList;


public class Customer {
    static int staticInt1 = 1;
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String deliveryAddress;
    private CustomerType customerType;
    private Double customerDiscount;
    private ArrayList<OrderItem> favoriteItems;
    private Gift customerGift;

    public Customer( String firstName, String lastName, String email, String deliveryAddress,
                    CustomerType customerType, Double customerDiscount) {
        this.id = staticInt1++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.favoriteItems = new ArrayList<>();
        this.deliveryAddress = deliveryAddress;
        this.customerType = customerType;
        this.customerDiscount = customerDiscount;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public void setCustomerDiscount(Double customerDiscount) {
        this.customerDiscount = customerDiscount;
    }

    public void setFavoriteItems(ArrayList<OrderItem> favoriteItems) {
        this.favoriteItems = favoriteItems;
    }

    public void setCustomerGift(Gift customerGift) {
        this.customerGift = customerGift;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public Double getCustomerDiscount() {
        return customerDiscount;
    }

    public ArrayList<OrderItem> getFavoriteItems() {
        return favoriteItems;
    }

    public static int getStaticInt1() {
        return staticInt1;
    }

    public Gift getCustomerGift() {
        return customerGift;
    }

    public void addToFavoriteItems(OrderItem item) {
        if (!favoriteItems.contains(item)) {
            favoriteItems.add(item);
        }
    }

    public void removeFromFavoriteItems(OrderItem item) {
        favoriteItems.remove(item);
    }

    public void takeGift(Gift gift) {
        customerGift = gift;
    }

    public void openGift() {
        if (customerGift != null) {
            customerGift.openGift();
        }
    }


}








