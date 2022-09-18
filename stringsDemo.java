public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";

        System.out.println(mesaj);


        System.out.println("Eleman Sayısı : " + mesaj.length()); //mesaj uzunluğunu veriyor
        System.out.println("5. eleman : " + mesaj.charAt(4)); //4. indexde ne var onu getiriyor
        System.out.println(mesaj.concat("yaşasın")); // birleştirme işlemi
        System.out.println(mesaj.startsWith("A")); //kontrol mekanizması a ile başlıyorsa true
        System.out.println(mesaj.endsWith(".")); //kontrol mekanizması . ile bitiyorsa true
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0); //mesajın içinden 0. indexten 5. indexe kadar olan harfleri karakterler dizisine 0. karakterden başlayarak aktar
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av")); //av nın index soldan aramaya başlayarak numarasını getiriyor
        System.out.println(mesaj.lastIndexOf("a")); //a nın index sağdan aramaya başlayarak numarasını getiriyor

        String yeniMesaj = mesaj.replace(' ','-'); // cümledeki boşlukar yerine "-" işareti koyuyor
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5)); //2. index ila 5 index arasındaki sözcükleri yazıyor

        for (String kelime : mesaj.split(" ")){ // cümleyi boşluklardan bölüyor
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase()); // büyük harf yapıyor
        System.out.println(mesaj.toUpperCase()); // küçük harf yapıyor
        System.out.println(mesaj.trim()); // cümlenin sağındaki ve solundaki boşlukları alıyor

    }
}
