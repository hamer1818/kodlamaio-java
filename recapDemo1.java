public class Main {
    public static void main(String[] args) {
        int sayi1=10,sayi2=30,sayi3=30;
        if (sayi1>sayi2 && sayi1>sayi3){
            System.out.println("en büyük sayı sayi1 dir. değeri :"+ sayi1);
        }else if (sayi2>sayi1 && sayi2>sayi3){
            System.out.println("en büyük sayı sayi2 dir. değeri :"+ sayi2);
        }else if (sayi3>sayi2 && sayi3>sayi1){
            System.out.println("en büyük sayı sayi3 dir. değeri :"+ sayi3);
        }else{
            System.out.println("sayılar birbirine eşittir:");
        }
    }
}
