public class ExceptionExample {
    public static void main(String[] args) {
        // try {
        //     int result = 10/0;
        //     System.out.println("Result" + result);
        // } catch (Exception e) {
        //     System.out.println("Exception occured" + e.getMessage());
        // }
        // finally{
        //     System.out.println("Will always execute");
        // }
        try {
            int [] arr = {1,2,3};
            try {
                System.out.println("element at index 4" + arr[4]);
            } catch (Exception e) {
                System.out.println("Exception occured" + e.getMessage());
            }
            int r = 10/0;
            System.out.println("Result" + r);
        } catch (Exception e) {
            System.out.println("Exception occured" + e.getMessage());
        }
        finally{
            System.out.println("Aways executed");
        }
    }
}
