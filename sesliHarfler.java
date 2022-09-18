public class Main {
    public static void main(String[] args) {
        char[] kalınSesli = {'a', 'ı', 'o', 'u'};
        char[] inceSesli = {'e', 'i', 'ö', 'ü'};

        char harf = 'ç';
        int counter = 0;
        for (char sesliHarf : kalınSesli){
            if (harf == sesliHarf){
                System.out.println("harf kalın sesli harfdir");
            }else{
                counter++;
            }
        }
        for (char sesliHarf : inceSesli){
            if (harf == sesliHarf){
                System.out.println("harf ince sesli harfdir");
            }else {
                counter++;
            }

        }
        if (counter==8){
            System.out.println("harf sessiz harfdir");
        }

    }
}
