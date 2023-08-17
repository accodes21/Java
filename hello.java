import java.util.Scanner;

/**
 * hello
 */
public class hello {

    public static void main(String[] args) {
        System.out.println("Hello world");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = s.nextLine();
        System.out.println("Hello "+name);
    }
}