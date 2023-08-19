import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Java is awesome!");
        String hello = "kangaroo";
        System.out.println(hello.length());
        System.out.println(hello.charAt((int) 2.0));
        System.out.println(Arrays.toString(markStringEnds("hello")));
    }
    public static String[] markStringEnds(String originalString) {
        // write your code below this line
        String firstChar = originalString.substring(0,1).toUpperCase();
        String secondChar = originalString.substring(originalString.length()-1).toUpperCase();

        String[] result = {firstChar + originalString.substring(1),
                originalString.substring(0, originalString.length()-1) + secondChar};
        return result;
        // write your code above this line
    }
}