import java.util.Scanner;

public class countOccurence {
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");

        for(String a : arr){
            int count = 0;
            for(String b : arr){
                if(a.equals(b)){
                    count++;
                }
            }
            System.out.println("Count of "+a+" = "+count);
        }
    }
}
