public abstract class Customer {

    private Object Customer;
    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }



    abstract public Car kiralanabilirAraclar(Car car);


}

