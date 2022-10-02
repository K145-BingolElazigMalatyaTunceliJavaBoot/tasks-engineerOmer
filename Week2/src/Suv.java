public class Suv extends Car{

    int kiralamaSuresi;
    int aracinYasDurumu;
    final int aylikKiralamaKatsayisi=500;
    final double aracinYasKatSayisi = 1.3;
    public Suv(String model, String marka, String renk, int bagajKapasitesi, int gunlukKiralamaUcreti,int kiralamaSuresi,int aracinYasDurumu) {
        super(model, marka, renk, bagajKapasitesi, gunlukKiralamaUcreti);
        this.aracinYasDurumu = aracinYasDurumu;
        this.kiralamaSuresi= kiralamaSuresi;
    }


    @Override
    public void kiralamaSuresi() {
        if (aracinYasDurumu < 5) {
            System.out.println("Secilen suv model icin odenmesi gereken ucret: " + kiralamaSuresi * aylikKiralamaKatsayisi * aracinYasKatSayisi);
            System.out.println("Secmis oldugunuz " + super.getModel() + " model adiniza " + kiralamaSuresi + " gunlugune kiralanmistir...");
        } else {
            System.out.println("Secmis oldugunuz " + super.getModel() + " model adiniza " + kiralamaSuresi + " gunlugune kiralanmistir...");
            System.out.println("Secilen suv model icin odenmesi gereken ucret: " + kiralamaSuresi * aylikKiralamaKatsayisi);
        }
    }
}
