public abstract class Car {

    private String model;
    private String marka;
    private String renk;
    private int bagajKapasitesi;
    private int gunlukKiralamaUcreti;

    public Car(String model, String marka, String renk, int bagajKapasitesi, int gunlukKiralamaUcreti) {
        this.model = model;
        this.marka = marka;
        this.renk = renk;
        this.bagajKapasitesi = bagajKapasitesi;
        this.gunlukKiralamaUcreti = gunlukKiralamaUcreti;
    }

    public Car(){

    }

     abstract public void kiralamaSuresi();


    public String getModel() {
        return model;
    }

    public String getMarka() {
        return marka;
    }

    public String getRenk() {
        return renk;
    }

    public int getBagajKapasitesi() {
        return bagajKapasitesi;
    }

    public int getGunlukKiralamaUcreti() {
        return gunlukKiralamaUcreti;
    }


}
