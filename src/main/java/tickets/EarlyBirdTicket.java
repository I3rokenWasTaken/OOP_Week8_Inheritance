package tickets;

public class EarlyBirdTicket extends Ticket {

    public EarlyBirdTicket(String eventName, String holderName, double basePrice) {
        super(eventName, holderName, basePrice);
    }

    @Override
    public double calculatePrice() {
        return Math.max(0, super.calculatePrice() - 10);
    }
}

