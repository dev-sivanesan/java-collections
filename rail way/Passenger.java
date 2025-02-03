public class Passenger {
    String name;
    int age;
    String gender;
    String berthPreference;
    String allottedBerth;
    String ticketId;

    public Passenger(String name, int age, String gender, String berthPreference, String allottedBerth, String ticketId) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.berthPreference = berthPreference;
        this.allottedBerth = allottedBerth;
        this.ticketId = ticketId;
    }

    public Passenger(String bookingId, String passengerName, int age2, int seats) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Ticket ID: " + ticketId + ", Name: " + name + ", Age: " + age +
                ", Gender: " + gender + ", Berth: " + allottedBerth;
    }

    public int getSeatsBooked() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSeatsBooked'");
    }
}
