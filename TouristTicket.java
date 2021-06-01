public class TouristTicket extends Ticket{
    private  String hotelAddress;
    private String[] selectedTouristLocation;



    public TouristTicket(String hotelAddress,String pnr, String from, String to, String departureDateTime, String arraivalDateTime, String seatNo, Flight flight, Passenger passenger, float price, boolean cancelled) {
        super(pnr, from, to, departureDateTime, arraivalDateTime, seatNo, flight, passenger, price, cancelled);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation=new String[5];

    }

    //getters and setters
    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }

    public String getHotelAddress(){
        return hotelAddress;
    }

    //methods
    public String[] getSelectedTouristLocation(){
        return this.selectedTouristLocation;
    }

    public void removeTouristLocations(String[] location){
        this.selectedTouristLocation=location;
        location=null;
    }

    public void addTouristLocations(String[] location){
        this.selectedTouristLocation=location;
    }

}
