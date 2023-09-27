import java.util.ArrayList;

import Gifts.Tickets;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        OrderItem item1 = new OrderItem("1",  10.0);
        OrderItem item2 = new OrderItem("2",  15.0);
        OrderItem item3 = new OrderItem("3",  20.0);

        // Create a Customer
        Customer customer1 = new Customer("101", "John", "Doe", "john@example.com",
                CustomerType.REGULAR, null);

        // Create an Order for the Customer
        ArrayList<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(item1);
        orderItems.add(item2);
        VIP order1 = new VIP("A", "Order 1", customer1, PaymentType.CREDIT_CARD, LocalDate.now());


        // Display Customer Information
        System.out.println("Customer Information:");
        System.out.println("Name: " + customer1.getFirstName() + " " + customer1.getLastName());
        System.out.println("Email: " + customer1.getEmail());
        System.out.println("Delivery Address: " + customer1.getDeliveryAddress());
        System.out.println("Customer Type: " + customer1.getCustomerType());

        // Display Favorite Items of Customer
        System.out.println("Favorite Items of Customer:");
        for (OrderItem favoriteItem : customer1.getFavoriteItems()) {
            System.out.println(favoriteItem.getItemName());
        }

        // Display Order Information
        System.out.println("Order Information:");
        System.out.println("Order ID: " + order1.getId());
        System.out.println("Order Name: " + order1.getName());
        System.out.println("Delivery Address: " + order1.getDeliveryAddress());
        System.out.println("Total Price: $" + order1.getTotalPrice());
        System.out.println("Payment Type: " + order1.getPaymentType());
        System.out.println("Order Date: " + order1.getOrderDate());

        // Giving a gift to the customer

        Tickets tickets = new Tickets();
        customer1.setCustomerGift(tickets);
        customer1.getCustomerGift().openGift();


    }
}
