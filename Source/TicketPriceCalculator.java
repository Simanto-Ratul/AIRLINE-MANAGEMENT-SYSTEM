package Source;

public class TicketPriceCalculator extends TicketPrice{
    private static final double pricePerTicket = 3000.0;

    public  double calculateTotalPrice(int numberOfTickets){
        return pricePerTicket * numberOfTickets;
    }
}
