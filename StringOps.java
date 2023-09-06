import java.util.Scanner;

public class StringOps {
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("enter substring:");
        String s1 = sc.nextLine();

        if(s.contains(s1)){
            int pos = s.indexOf(s1);
            System.out.println(s.substring(pos+s1.length()));
        }
    }
}
