package ch4.characters;

public class Characters {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
        ch = 'A';
        System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
        ch = ' ';
        System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
        // Char is not a signed type, but it's not an error
        // java will add +65536 to the ch.
        ch = (char)-5;
        System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
        ch = (char) -65535;
        System.out.println("Character: " + ch + " its numeric value: " + (int)ch);

    }
}
