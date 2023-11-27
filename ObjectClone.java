public class ObjectClone implements Cloneable {
    int roll;
    String name;

    ObjectClone(int r, String n){
        this.name = n; 
        this.roll = r;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
    public static void main(String[] args) {
        try {
            ObjectClone o1 = new ObjectClone(101, "ABC");
            ObjectClone o2 = (ObjectClone)o1.clone();
            System.out.println(o1.name + o1.roll);
            System.out.println(o2.name + o2.roll);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
