public class Sedan extends Car{
    int kiralamaSuresi;
    final int aylikKiralamaKatsayisi = 300;
    public Sedan(String model, String marka, String renk, int bagajKapasitesi, int gunlukKiralamaUcreti,int kiralamaSuresi) {
        super(model, marka, renk, bagajKapasitesi, gunlukKiralamaUcreti);
        this.kiralamaSuresi=kiralamaSuresi;
    }

    @Override
    public void kiralamaSuresi() {
        if (kiralamaSuresi>=30){
            System.out.println("Secmis oldugunuz " + super.getModel() + " model adiniza " + kiralamaSuresi + " gunlugune kiralanmistir...");
            System.out.println("Aylik kiralama durumunda odemeniz gerek toplam tutar: " + kiralamaSuresi*aylikKiralamaKatsayisi);
        }
        else {
            System.out.println("Secmis oldugunuz " + super.getModel() + " model adiniza " + kiralamaSuresi + " gunlugune kiralanmistir...");
            System.out.println("Islemin tamamlanmasi icin odemeniz gereken tutar: " + kiralamaSuresi * 400);
        }
    }
}
