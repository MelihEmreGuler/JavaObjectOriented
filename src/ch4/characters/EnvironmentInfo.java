package ch4.characters;

import java.io.InputStreamReader;
import java.util.Locale;

public class EnvironmentInfo {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        System.out.println("Encoding: " + isr.getEncoding());

        Locale locale = Locale.getDefault();
        System.out.println("Country: " + locale.getCountry());
        System.out.println("Language: " + locale.getLanguage());
        System.out.println("Display Language: " + locale.getDisplayLanguage());
        System.out.println("Display Name: " + locale.getDisplayName());
        System.out.println("ISO3 Language: " + locale.getISO3Language());
    }
}
