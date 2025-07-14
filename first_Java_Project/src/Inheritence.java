class Pen{
    public Pen(){
        System.out.println("invoking Pen constructor");
    }
    String colour;
    String type;
    public void printcolour(){
        System.out.println(this.colour);
    }
}
class V7 extends Pen{// Inheritance
    public V7 () {
        System.out.println("invoking V7 constructor");
    }
}

public class Inheritence {
    public static void main(String args[]) {
        System.out.println("Main Started..");

        Pen pen1 = new Pen();
        pen1.colour = "blue";
        pen1.type = "gel";

        pen1.printcolour();


        V7 V7RT = new V7();
        V7RT.colour = "black";
        V7RT.printcolour();
    }
}
