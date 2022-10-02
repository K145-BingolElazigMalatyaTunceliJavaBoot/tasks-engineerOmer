public class Individual extends Customer {



    public Individual(int id, String name) {
        super(id, name);
    }



    @Override
    public Car kiralanabilirAraclar(Car car) {
        System.out.println("Kiralayabileceginiz araclar: "  );
        System.out.println(car.getModel());
        return car;
    }

}
