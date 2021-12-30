package FlightBooking;
import  java.util.*;
public abstract class Ticket {
    private Flight flight;

    private Passenger passenger;
    private double price;
    private int number;
    private static int IdCounter=0;


    public Ticket(Flight flight,int IdCounter,double price) {
        this.flight = flight;
        this.price=price;
        IdCounter++;
        number=IdCounter;
    }







    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static int getIdCounter() {
        return IdCounter;
    }

    public static void setIdCounter(int idCounter) {
        IdCounter = idCounter;
    }


}



