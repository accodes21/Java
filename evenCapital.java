public class evenCapital {
    public static String evenIndexCapital(String s){
        String s1 = "";
        for(int i = 0; i<s.length(); i++){
            if(i%2==0){
                s1 += s.substring(i, i+1).toUpperCase();
            }
            else{
                s1 += s.substring(i, i+1).toLowerCase();
            }
        }
        return s1;
    }

    public static void main(String[] args) {
        String s = "abcde";
        String s1 = evenIndexCapital(s);
        System.out.println(s1);
    }
}
