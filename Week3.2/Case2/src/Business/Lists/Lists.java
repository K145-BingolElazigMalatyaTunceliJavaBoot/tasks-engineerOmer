package Business.Lists;

import Entities.Seat;
import java.util.ArrayList;
import java.util.List;

public class Lists {

    private List<Seat> seats;

    public Lists() {
        this.seats = new ArrayList<>();
    }

    public void addSeats(Seat seat){
        this.seats.add(seat);
    }

    public List<Seat> getAllSeats(){
        return this.seats;
    }

    private boolean emptyController(Seat seat){
        return seat.isEmpty();
    }
    public List<Seat> getAllEmptySeats(){
        return this.seats.stream().filter(this::emptyController).toList();
    }


}
