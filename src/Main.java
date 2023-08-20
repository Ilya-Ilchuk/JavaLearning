import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Java is awesome!");
        System.out.println(getCentury(101));
    }
    public static int getCentury(int year) {
        // WRITE YOUR CODE BELOW THIS LINE
        return (year + 99) / 100;
        // WRITE YOUR CODE ABOVE THIS LINE
    }
}