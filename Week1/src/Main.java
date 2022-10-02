import java.util.Random;

public class Main {
    public static void main(String[] args){
        int point;
        Random random = new Random();
        point= random.nextInt(100);
        if (point>70){
            System.out.println("AA");
        }
        else if (point>50 && point<70){
            System.out.println("BB");
        }
        else if (point>50 && point<70){
            System.out.println("DC");
        }
        else{
            System.out.println("FF");
        }
        System.out.println("***********************************************");



        int total = 0;
        for (int i = 3; i < 100; i++) {
            if(isPrime(i)){
                total+=i;
            }
        }
        System.out.println(total);

        System.out.println("************************************************");

        int toplam = 0;
        int diger= 0;
        for (int i = 200; i<500;i++){
            if (i%3==0){
                diger +=i;//3 ile tam bolunenlerin toplami
            }
            else
                toplam= toplam+i;
        }
        System.out.println(diger);
        System.out.println(toplam);

        System.out.println("***************************************************");


        Random random2 = new Random();
        boolean kontrol = true;
        int sayac = 0,randomSayi = 0;

        while (kontrol) {
            randomSayi = random.nextInt(500);
            sayac++;
            if (randomSayi >= 50 && randomSayi < 100) {
                kontrol = false;
            }
        }
        System.out.println("Bulunan sayi:"+ randomSayi +" Kacıncı secimde bulundu:"+sayac);
    }

    private static boolean isPrime(int number) {
        int i = 2;
        while (number>2 && i!=number){
            if(number%i==0){
                return false;
            }
            i++;
        }
        return true;
    }


}

