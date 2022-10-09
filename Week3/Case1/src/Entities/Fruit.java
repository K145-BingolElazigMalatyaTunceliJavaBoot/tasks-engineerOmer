package Entities;

public abstract class Fruit {
    private double unitsInStock;

    public Fruit(double unitsInStock) {
        this.unitsInStock = unitsInStock;
    }



    public double getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(double unitsInStock) {
        this.unitsInStock = unitsInStock;
    }
}
