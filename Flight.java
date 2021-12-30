package FlightBooking;

public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity ;
    private int numberOfSeatsleft ;
    private double Price;

    public Flight(int flightNumber, String origin, String destination,String departureTime,int capacity, double price)
    {
        if (destination.equals(origin)) {
            throw new IllegalArgumentException("destination and origin are the same");
    }

        this.flightNumber=flightNumber;
        this.origin=origin;
        this.destination=destination;
        this.departureTime=departureTime;
        this.capacity=capacity;
        this.Price=price;
    }
    public boolean bookASeat() {
        if (numberOfSeatsleft > 0) {
            numberOfSeatsleft = numberOfSeatsleft - 1;
            return true;

        }
        return false;
    }

    public int getFlightNumber() {
        return flightNumber;
    }



    public String getOrigin() {

        return origin;
    }



    public String getDestination() {
        return destination;
    }



    public String getDepartureTime() {
        return departureTime;
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumberOfSeatsleft() {
        return numberOfSeatsleft;
    }


    public double getPrice() {
        return Price;
    }


    @Override
    public String toString() {
        String one = "Flight "+ flightNumber;
        String two = "\n"+ origin +" to "+ destination;
        String three = "\n"+ departureTime;
        String four = "\noriginal price:" +"₹ "+Price;
        return one + two + three + four;
    }
}



