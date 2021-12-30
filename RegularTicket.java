package FlightBooking;

public class RegularTicket extends Ticket
{
    private Flight flight;
    private Passenger passenger;
    boolean Food,Water,Snacks;
    public RegularTicket(Flight flight,int IdCounter,double price,boolean Food,boolean water,boolean Snacks)
    {
        super(flight,IdCounter,price);
        this.Water=water;
        this.Food=Food;
        this.Snacks=Snacks;
    }
    @Override
    public String toString() {
        String one = passenger.getName() + ", Flight " + flight.getFlightNumber();
        String two = ", " + flight.getOrigin() + " to " + flight.getDestination();
        String three = ", " + flight.getDepartureTime();
        String four = ", original price: " + flight.getPrice() + "$";
        String five = ", ticket price: " + getPrice() + "$";
        String six = ", Services Requested Water "+Water+" Food "+Food+" Snacks "+Snacks;
        return one + two + three + four + five+six;
    }


    public boolean isSnacks() {
        return Snacks;
    }

    public void setSnacks(boolean snacks) {
        Snacks = snacks;
    }

    public boolean isWater() {
        return Water;
    }

    public void setWater(boolean water) {
        Water = water;
    }

    public boolean isFood() {
        return Food;
    }

    public void setFood(boolean food) {
        Food = food;
    }
}

