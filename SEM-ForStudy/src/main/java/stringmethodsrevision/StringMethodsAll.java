package stringmethodsrevision;

public class StringMethodsAll {

    public static void main(String[] args) {

        String text = "Hello World";

        //valueOf()
        String strNum = String.valueOf(123);
        System.out.println("valueOf(): " + strNum);

        //endsWith()
        System.out.println("endsWith(): " + text.endsWith("World"));

        //equals()
        System.out.println("equals(): " + text.equals("Hello World"));

        //equalsIgnoreCase()
        System.out.println("equalsIgnoreCase(): " + text.equalsIgnoreCase("hello world"));

        //getChars()
        char[] chars = new char[5];
        text.getChars(0, 5, chars, 0); // copy "Hello"
        System.out.print("getChars(): ");
        System.out.println(chars);

        //isEmpty()
        String emptyStr = "";
        System.out.println("isEmpty(): " + emptyStr.isEmpty());

        //join()
        String joined = String.join("-", "A", "B", "C");
        System.out.println("join(): " + joined);

        //lastIndexOf()
        System.out.println("lastIndexOf(): " + text.lastIndexOf('o'));

        //length()
        System.out.println("length(): " + text.length());

        //matches()
        System.out.println("matches(): " + text.matches("Hello World"));
    }
}
