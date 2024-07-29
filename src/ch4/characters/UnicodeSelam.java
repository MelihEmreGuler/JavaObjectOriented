package ch4.characters;

public class UnicodeSelam {

    public static void main(String[] args) {
        String helloWorld1 = "\u0048\u0065\u006C\u006C\u006F\u0020\u0057\u006F\u0072\u006C\u0064";
        String helloWorld2 = "Hello World";
        System.out.println("Hello World: " + helloWorld1);

        System.out.println(helloWorld1.equals(helloWorld2));
    }
}
