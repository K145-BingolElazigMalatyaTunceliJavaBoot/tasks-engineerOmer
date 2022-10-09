package Business.Manager;

import Business.CherryService;
import Entities.Cherry;
import Rooms.CherryRoom;

public class CherryManager implements CherryService {

    private CherryRoom cherryRoom;
    Cherry cherry;
    public CherryManager(CherryRoom cherryRoom,Cherry cherry) {
        this.cherryRoom = cherryRoom;
        this.cherry=cherry;
    }

    @Override
    public void add(double kilo) {
        cherry.setUnitsInStock(cherry.getUnitsInStock()+kilo);
    }

    @Override
    public void buy(double kilogram) {
        if (kilogram>cherry.getUnitsInStock()){
            System.out.println("Stoktaki elma limiti asildi");
        }
        else {
            cherry.setUnitsInStock(cherry.getUnitsInStock() - kilogram);
            System.out.println("Urun basariyla satin alindi");
            System.out.println("Stok adedi: " + cherry.getUnitsInStock());

        }
    }
}
