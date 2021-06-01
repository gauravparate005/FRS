public class Flight {
    private String flightNumber,airline;
    private int capacity;
    private int bookedSeats;
    private int counter=1;

    //constructor
    public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;

    }

    //copy constructor
    public Flight(Flight flight){
        this.flightNumber = flight.flightNumber;
        this.airline = flight.airline;
        this.capacity = flight.capacity;
        this.bookedSeats = flight.bookedSeats;
    }

    public Flight() {

    }


    //getters and setters
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }


    //methods

    public String getFlightDetails(){
        return this.flightNumber+"\n"+this.airline;
    }

    public boolean checkAvailability(){

        if(capacity>bookedSeats) {
            return true;
        }else {
            return false;
        }
    }

    public void incrementBookingCounter(){
        counter++;
    }


}

