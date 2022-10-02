public class HatchBack extends Car{
    int kiralamaSuresi;


    public HatchBack(String model, String marka, String renk, int bagajKapasitesi, int gunlukKiralamaUcreti,int kiralamaSuresi) {
        super(model, marka, renk, bagajKapasitesi, gunlukKiralamaUcreti);
        this.kiralamaSuresi=kiralamaSuresi;
    }



    @Override
    public void kiralamaSuresi() {
        if (kiralamaSuresi>1){
            System.out.println("HatchBack Modeller 1 gunden fazla kiralanamaz");
        }
        else {
            System.out.println("Secmis oldugunuz " + super.getModel() + " model adiniza bir gunlugune kiralanmistir...");
            System.out.println("Islemin tamamlanmasi icin odemeniz gereken tutar: " + getGunlukKiralamaUcreti());
        }

    }
}
