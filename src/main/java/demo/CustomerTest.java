package demo;

public class CustomerTest {

    public static void main(String[] args) {

        // Create a Customer using the full constructor
        Customer first = new Customer(
                "Alice Smith",
                "Galway",
                "091123456",
                1001,
                true
        );

        // Create a Customer using the no-argument constructor
        Customer second = new Customer();

        // Use setters to give the second customer details
        second.setName("Bob Jones");
        second.setAddress("Limerick");
        second.setPhoneNumber("061987654");
        second.setCustomerNumber(1002);
        second.setMailingList(false);

        // Display both customers
        System.out.println(first);
        System.out.println(second);
    }
}