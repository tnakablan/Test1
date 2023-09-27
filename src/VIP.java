import java.time.LocalDate;
import java.util.ArrayList;
public class VIP extends Order {
    public VIP(String name, String deliveryAddress, Customer orderCustomer, PaymentType paymentType, LocalDate orderDate) {
        super(name, deliveryAddress, orderCustomer, paymentType, orderDate);
    }

    @Override
    public double calculateTotalPrice() {


        double totalPrice = 0;
        for (OrderItem item : this.getItems()) {
            totalPrice += item.getItemPrice();
        }


        if (getCustomer().getCustomerType() == CustomerType.VIP) {
            if (getCustomer().getCustomerDiscount() != null) {
                totalPrice += totalPrice * getCustomer().getCustomerDiscount();
            } else {
                throw new IllegalArgumentException(this.getCustomer().getLastName()+"not VIP,VIP customer must have a discount set.");
            }
        }
        return totalPrice;
    }
}
