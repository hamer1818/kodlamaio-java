public class Main {
    public static void main(String[] args) {
        int sayi1 = 17296, sayi2 = 18416, toplam1 = 0, toplam2 = 0;
        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0)
                toplam1 += i;
            if (sayi2 % i == 0)
                toplam2 += i;

        }
        if (sayi1 == toplam2 && sayi2 == toplam1)
            System.out.println(sayi1 + " : sayının bölenlerinin toplamı : " + toplam1 + "\n" + sayi2 + " : sayının bölenlerinin toplamı : " + toplam2 + "\nSayılar arkadaş sayıdır!!!");
        else System.out.println("Sayılar arkadaş sayı değildir!!");
    }
}
