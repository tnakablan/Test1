
import java.time.LocalDate;
import java.util.ArrayList;

public class Regular extends Order {

    public Regular(String name, String deliveryAddress, Customer orderCustomer, PaymentType paymentType, LocalDate orderDate) {
        super(name, deliveryAddress, orderCustomer, paymentType, orderDate);
    }

    @Override
    public double calculateTotalPrice() {


        double totalPrice = 0;
        for (OrderItem item : this.getItems()) {
            totalPrice += item.getItemPrice();
        }
        return totalPrice;
    }

}
