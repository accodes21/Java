interface drawable{
    void draw();
}

interface printable{
    void print();
    default void display(){
        System.out.println("display");
    }
}

class Rectangle implements drawable,printable{
    public void draw(){
        System.out.println("rectangle");
    }
    public void print(){
        System.out.println("print rectangle");
    }
}

class Circle implements drawable{
    public void draw(){
        System.out.println("circle");
    }
}

public class interfacePractice {
    public static void main(String[] args) {
        drawable d1 = new Circle();
        d1.draw();
        drawable d2 = new Rectangle();
        d2.draw();
        Rectangle r = new Rectangle();
        r.draw();
        r.print();
        r.display();
    }
}
