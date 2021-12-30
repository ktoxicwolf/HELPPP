package FlightBooking;


public class Passenger {

     Address address;
     Contact contact;
    //Address Attributes
    private  String Street;
    private String City;
    private String State;

    //Contact Attributes
    private   long PhoneNumber;
    private String name;
    private  String Email;


    private static int IdCounter;

    Passenger (Address address,Contact contact)
    {
       this.address= address;
       this.contact=contact;
       IdCounter++;

    }

     static class Address{
        private Passenger passenger;
        //(String Street, String City, String State)
        private  String Street;
        private String City;
        private String State;
        public Address(String Street, String City, String State) {
            this.Street=Street;
            this.State=State;
            this.City=City;
        }
        }

     static class Contact{
        private Passenger passenger;
            //(String name, String email, long pNo)
            private   long PhoneNumber;
        private String name;
        private  String Email;
        public Contact(String name, String email, long pNo)
                {
                    this.Email=Email;
                    this.name=name;
                    this.PhoneNumber= PhoneNumber;


                }
            }
    @Override
    public String toString(){
        String one = getName();
        Address two = getAddress();
        Contact three = getContact();
        String four = "PNR "+getPassengerCount();
        return one+two+three+four;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    int getPassengerCount()
    {
        return IdCounter;

    }
}





