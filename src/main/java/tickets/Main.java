package tickets;

public class Main {

    public static void main(String[] args) {


        Ticket standard = new Ticket(
                "Summer Concert", "Alice", 80
        );


        StudentTicket student = new StudentTicket(
                "Summer Concert", "Bob", 80, "S12345"
        );


        VIPTicket vip = new VIPTicket(
                "Summer Concert", "Charlie", 80
        );


        EarlyBirdTicket earlyBird1 = new EarlyBirdTicket(
                "Summer Concert", "David", 50
        );

        EarlyBirdTicket earlyBird2 = new EarlyBirdTicket(
                "Summer Concert", "Emma", 7
        );


        System.out.println("Event: " + standard.getEventName());


        System.out.printf(
                "Standard Ticket - Alice: €%.2f%n",
                standard.calculatePrice()
        );

        System.out.printf(
                "Student Ticket - Bob: €%.2f%n",
                student.calculatePrice()
        );

        System.out.printf(
                "VIP Ticket - Charlie: €%.2f%n",
                vip.calculatePrice()
        );

        System.out.printf(
                "Early Bird Ticket - David: €%.2f%n",
                earlyBird1.calculatePrice()
        );

        System.out.printf(
                "Early Bird Ticket - Emma: €%.2f%n",
                earlyBird2.calculatePrice()
        );


        System.out.println("Student ID: S12345");


        System.out.println("Benefits: Priority entry and reserved seating");
    }
}

