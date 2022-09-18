public class Main {
    public static void main(String[] args) {
        double[] myList = {1.2, 1.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0];

        for (double mynumber : myList) {
            if (max < mynumber) {
                max = mynumber;
            }
            total = total + mynumber;
            System.out.println(mynumber);
        }

        System.out.println("Toplam: " + total);
        System.out.println("En büyük: " + max);
    }
}
