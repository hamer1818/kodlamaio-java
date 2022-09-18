public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int bulunacak = 5;
        boolean varMi = false;

        for (int sayi:sayilar){
            if (bulunacak==sayi) {
                varMi = true;
                break;
            }

        }
        if (varMi)
        System.out.println("dizinin içinde Sayı bulundu ");
        else System.out.println("dizinin içinde Sayı bulunamadı ");
    }
}
