package Business.Services;

import Entities.Seat;

import java.util.List;

public interface PegasusService extends BaseService{

    List<Seat> getAllSeats();
    List<Seat> getAllEmptySeats();
}
