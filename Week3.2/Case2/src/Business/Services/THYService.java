package Business.Services;

import Entities.Seat;

import java.util.List;

public interface THYService extends BaseService{

    List<Seat> getAllSeats();
    List<Seat> getAllEmptySeats();

}
