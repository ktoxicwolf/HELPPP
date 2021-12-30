package FlightBooking;

public class TouristTicket extends Ticket
{
    private Flight flight;
    private Passenger passenger;
    String Hotel_address;
    String Places ;

//Flight flight,int number,int IdCounter,String Hotel_address, String Places   super(flight,number,IdCounter);
    public TouristTicket(Flight flight,int IdCounter,double price,String Hotel_address, String Places )
    {
        super(flight,IdCounter,price);
        this.Hotel_address=Hotel_address;
        this.Places= Places;
    }
    @Override
    public String toString() {
        String one = passenger.getName() + ", Flight " + flight.getFlightNumber();
        String two = ", " + flight.getOrigin() + " to " + flight.getDestination();
        String three = ", " + flight.getDepartureTime();
        String four = ", original price: " + flight.getPrice() + "$";
        String five = ", ticket price: " + getPrice() + "$";
        return one + two + three + four + five;
    }


    public String getHotel_address() {
        return Hotel_address;
    }

    public void setHotel_address(String hotel_address) {
        Hotel_address = hotel_address;
    }


    public String getPlaces() {
        return Places;
    }

    public void setPlaces(String places) {
        Places = places;
    }
}
