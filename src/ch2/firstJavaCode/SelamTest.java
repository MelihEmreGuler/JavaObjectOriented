package ch2.firstJavaCode;

public class SelamTest{
    public static void main(String[] args) {
        Selam nesne = new Selam();

        String cevap = nesne.selamSoyle("Ali");
        System.out.println(cevap);
        String var = nesne.selamSoyle("");
        System.out.println(var);
        var metin = nesne.selamSoyle("Veli");
        System.out.println(metin);
    }
}