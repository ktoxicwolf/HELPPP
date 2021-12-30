package FlightBooking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MAIN {
    List<Flight> flights;
    List<RegularTicket> RegularTickets;
    List<TouristTicket> TouristTickets;

    public MAIN() {
        flights = new ArrayList<>();
        RegularTickets = new ArrayList<>();
        TouristTickets = new ArrayList<>();
    }

    // To create a flight details
    public void createFlights() {
        int flightNumber, capacity;
        double price;
        String origin, destination, departureTime;
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Enter flight Number");
        flightNumber = scan1.nextInt();
        System.out.println("Enter flight origin");
        origin = scan2.nextLine();
        System.out.println("Enter flight destination");
        destination = scan2.nextLine();
        System.out.println("Enter flight departure time and date");
        departureTime = scan2.nextLine();
        System.out.println("Enter flight capacity");
        capacity = scan1.nextInt();
        System.out.println("Enter original price of ticket");
        price = scan3.nextDouble();
        Flight flight = new Flight(flightNumber, origin, destination, departureTime, capacity, price);
        flights.add(flight);
        System.out.println("The following flight has been created:");
        System.out.println(flight);


    }

    //To display flight availability
    public void displayAvailableFlights() {
        int size;

        size = flights.size();
        for (int i = 0; i < size; i++) {


                    System.out.println("List of available flights:");

                System.out.println(flights.get(i));
            }
    }

    public Flight getFlight(int flightNumber) {

        for (Flight flight : flights) {
            if (flight.getFlightNumber() == flightNumber) {
                return flight;
            }

        }
        return null;
    }

    public void RegularbookSeat(int flightNumber) {
        int size = flights.size();
        boolean flag = false;
        int index = 0, seats;


        for (int i = 0; i < size; i++) {
            if (flights.get(i).getFlightNumber() == flightNumber) {
                flag = true;
                index = i;
                break;
            }

        }
        //Contact details
        int IdCounter = 0;
        IdCounter++;


        double price;
        seats = flights.get(index).getNumberOfSeatsleft();
        if (flag && (seats > 0)) {
            flights.get(index).bookASeat();
            price = flights.get(index).getPrice();

            boolean Food, water, Snacks;
            System.out.println("ENTER TRUE IF U NEED FOOD ELSE FALSE");
            Scanner input1 = new Scanner(System.in);
            Food = input1.nextBoolean();
            System.out.println("ENTER TRUE IF U NEED WATER ELSE FALSE");
            water = input1.nextBoolean();
            System.out.println("ENTER TRUE IF U NEED SNACKS ELSE FALSE");
            Snacks = input1.nextBoolean();
            RegularTicket a = new RegularTicket(flights.get(index), IdCounter, price, Food, water, Snacks);
            RegularTickets.add(a);
            System.out.println("you have successfully booked a seat for flight " + flightNumber);
            System.out.println("ticket: " + a);
        } else {
            if (flag && seats == 0) {
                System.out.println("The Flight " + flightNumber + " is full you cannot book a ticket for this flight");

            } else if (!flag) {
                System.out.println("The Flight " + flightNumber + " does not exist");
            }
        }
    }

    public void TouristbookSeat(int flightNumber) {
        int size = flights.size();
        boolean flag = false;
        int index = 0, seats;
        for (int i = 0; i < size; i++) {
            if (flights.get(i).getFlightNumber() == flightNumber) {
                flag = true;
                index = i;
                break;
            }

        }

        int IdCounter = 0;
        IdCounter++;
        double price;
        seats = flights.get(index).getNumberOfSeatsleft();
        if (flag && (seats > 0)) {
            flights.get(index).bookASeat();
            price = flights.get(index).getPrice();
            String Hotel_address, Places;
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER THE HOTEL ADDRESS PASSENGER STAYS");
            Hotel_address = sc.next();
            System.out.println("ENTER MAX 5 PLACES PASSENGER WANTS TO STAY");
            Places = sc.next();
            TouristTicket a = new TouristTicket(flights.get(index), IdCounter, price, Hotel_address, Places);
            TouristTickets.add(a);
            System.out.println("you have successfully booked a seat for flight " + flightNumber);
            System.out.println("ticket: " + a);
        }
        else {
            if (flag && seats == 0) {
                System.out.println("The Flight " + flightNumber + " is full you cannot book a ticket for this flight");

            } else if (!flag) {
                System.out.println("The Flight " + flightNumber + " does not exist");
            }
        }
    }




    public static void main(String[] args) {
        MAIN M = new MAIN();
        Flight F;
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        String input,  name;
        int  flightNumber;
        boolean  flag = false;

        while (!flag) {
            System.out.println("Enter 1 if you would like to create a flight (creatFlight method)  ");
            System.out.println(" \nEnter 2 if you would like to display all flights (displayAvailableFlights method)  ");
            System.out.println(" \nEnter 3 if you would like to get information on a flight (getFlight method)");
            System.out.println(" \nEnter 4 if you would like to book a seat (bookSeat method)");
            System.out.println(" \nEnter 5 if you would like to terminate the program");
            input = scan1.nextLine();
            switch (input) {
                case "1" -> M.createFlights();
                case "2" -> M.displayAvailableFlights();
                case "3" -> {
                    System.out.println("Enter Flight number");
                    flightNumber = scan2.nextInt();
                    F = M.getFlight(flightNumber);
                    if (F == null) {
                        System.out.println("Flight " + flightNumber + " does not exist");
                    } else {
                        System.out.println("Info for Flight " + flightNumber + ":");
                        System.out.println(F);
                    }
                }
                case "4" -> {
                    System.out.println("ENTER THE NAME OF THE PASSENGER");
                    Scanner sc = new Scanner(System.in);
                    name = sc.next();
                    System.out.println("ENTER THE CONTACT NUMBER");
                    long pNo;
                    Scanner dou = new Scanner(System.in);
                    pNo = dou.nextLong();
                    System.out.println("ENTER THE Email ADDRESS");
                    String Email;
                    Email = sc.next();
                    Passenger.Contact contact = new Passenger.Contact(name, Email, pNo);

                    //Address
                    System.out.println("ENTER THE ADDRESS STREAT ");
                    String Street;
                    Street = sc.next();
                    System.out.println("ENTER CITY");
                    String City;
                    City = sc.next();
                    System.out.println("ENTER STATE");
                    String State;
                    State = sc.next();
                    System.out.println("Enter Flight number");
                    flightNumber = scan2.nextInt();
                    Passenger.Address address = new Passenger.Address(Street, City, State);
                    Passenger passenger = new Passenger(address, contact);
                    System.out.println("REGULAR TICKET enter r,FOR TOURIST TICKET enter t");
                    input = scan1.nextLine();
                    if (input.equals("r")) {
                        M.RegularbookSeat(flightNumber);

                    } else if (input.equals("t")) {

                        M.TouristbookSeat(flightNumber);
                    }
                }
                case "5" -> {
                    flag = true;
                    System.out.println("Program is terminated");
                }
                default -> System.out.println("You entered an invalid option");
            }
        }
    }
}






