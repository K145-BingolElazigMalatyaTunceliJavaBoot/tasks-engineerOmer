package Business.Services;

import Entities.Passenger;
import Entities.Seat;


public interface BaseService {

    void foodService(Passenger passenger);
    void buyTicket(Seat seat);
}
