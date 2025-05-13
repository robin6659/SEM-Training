package stringmethodsrevision;

public class HashCode {

    public static void main(String[] args) {

        String text1 = "Hello";
        String text2 = "World";
        String text3 = "Hello";

        int hash1 = text1.hashCode();
        int hash2 = text2.hashCode();
        int hash3 = text3.hashCode();

        System.out.println("HashCode of text1: " + hash1);
        System.out.println("HashCode of text2: " + hash2);
        System.out.println("HashCode of text3: " + hash3);
    }
}
