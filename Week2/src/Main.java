public class Main {

    public static void main(String[] args) {



        Car car1 = new HatchBack("hatcback","Opel","Beyaz",354,350,1);
        Car car2 = new Sedan("Sedan","Volvo","Siyah",250,420,35);
        Car car3 = new Suv("Suv","Ford","Kirmizi",400,500,15,7);

        Customer corporation = new Corporation(1,"Kodluyoruz");
        Customer individual = new Individual(2,"Ahmet");
        individual.kiralanabilirAraclar(car1);
        corporation.kiralanabilirAraclar(car3);
        corporation.kiralanabilirAraclar(car1);
        corporation.kiralanabilirAraclar(car2);



        car1.kiralamaSuresi();
        car2.kiralamaSuresi();
        car3.kiralamaSuresi();

    }
}
