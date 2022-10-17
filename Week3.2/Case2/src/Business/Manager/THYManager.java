package Business.Manager;

import Business.Lists.Lists;
import Business.Services.THYService;
import Entities.Passenger;
import Entities.Seat;

import java.util.List;

public class THYManager implements THYService {
    private Lists lists;

    public THYManager(Lists lists) {
        this.lists = new Lists();
    }

    public THYManager() {

    }

    private void addSeatList() {
        Seat[] seats=new Seat[]{
                new Seat("A1",true),
                new Seat("A2",true),
                new Seat("A3",true),
                new Seat("B1",true),
                new Seat("B2",true),
                new Seat("B3",false),
        };

        for(Seat seat1:seats){
            this.lists.addSeats(seat1);
        }
    }

    @Override
    public void foodService(Passenger passenger) {
        System.out.println("Yemek servisimiz mevcuttur");
    }

    @Override
    public void buyTicket(Seat seat) {
        for(Seat seat1:this.lists.getAllSeats()){
            if (!seat1.isEmpty()){
                System.out.println("Koltuk dolu");
                break;
            }
            else {
                seat1.setEmpty(false);
                System.out.println("Bilet alma islemi tamamlandi" + seat.getSeatNo());
            }
        }

    }

    @Override
    public List<Seat> getAllSeats() {
        return this.lists.getAllSeats();
    }

    @Override
    public List<Seat> getAllEmptySeats() {
        return this.lists.getAllEmptySeats();
    }
}
