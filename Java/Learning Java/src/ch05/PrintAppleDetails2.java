package ch05;

public class PrintAppleDetails2 {

    public static void main(String args[]){

        Apple a1 = new Apple();
        System.out.println("Apple a1:");
        System.out.println("mass: "+a1.mass);
//        System.out.println(" diameter: "+a1.diameter);
        System.out.println(" position:("+a1.x+","+a1.y+")");

        a1.mass = 10.0F;
        a1.x = 20;
        a1.y = 42;
        System.out.println("\n Update a1:");
        System.out.println("mass: "+a1.mass);
//        System.out.println(" diameter: "+a1.diameter);
        System.out.println(" position:("+a1.x+","+a1.y+")");
    }
}
