public class Main {
    public static void main(String[] args) {
        //sayının asal olup olmadığını kontrol edeceğiz
        int sayi = 20;
        int sayac = 0;
        for(int i = 2;i<sayi;i++){
            if (sayi%i==0){
                System.out.println("Asal sayı değil: "+sayi+"\t Bölünen sayı: "+i);
                sayac++;
            }
        }
        if (sayac==0 && sayi > 1){
            System.out.println("Sayı Asal!!");
        }else if(sayi<2){
            System.out.println("Sayı 2 den küçük olduğu için hesaplanmamıştır.");
        }
    }
}
