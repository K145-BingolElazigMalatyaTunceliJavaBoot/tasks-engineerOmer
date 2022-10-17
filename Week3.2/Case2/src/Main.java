import Business.Manager.THYManager;
import Business.Services.THYService;
import Entities.Passenger;
import Entities.Seat;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("Omer");
        Seat seat = new Seat("A1",true);
        THYManager thyManager = new THYManager();
        thyManager.foodService(passenger);
        thyManager.buyTicket(seat);

    }
}
