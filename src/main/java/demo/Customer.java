package demo;

public class Customer extends Person {

    private int customerNumber;
    private boolean mailingList;

    // No-argument constructor
    public Customer() {
        super();
    }

    // Constructor with all fields
    public Customer(String name, String address, String phoneNumber,
                    int customerNumber, boolean mailingList) {

        super(name, address, phoneNumber);

        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    // Getters
    public int getCustomerNumber() {
        return customerNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    // Setters
    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Customer Number: " + customerNumber
                + ", Mailing List: " + mailingList;
    }
}
