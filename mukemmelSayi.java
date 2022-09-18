public class Main {
    public static void main(String[] args) {
        int sayi = 8128;
        int bolenler = 0;
        for (int i = 1;i<=sayi;i++){

            if (sayi%i==0){
                bolenler+=i;
            }
        }
        if (bolenler==(sayi*2)) {
            System.out.println("Bu sayı Mükkemel sayıdır : "+sayi);
        }else System.out.println("Bu sayı mükemmel sayı değildir : "+sayi);
    }
}
