package ch05;

public class PrintAppleDetails3 {

    public static void main(String args[]){

        Apple a1 = new Apple();
        a1.printDetails();

        a1.mass = 10.0F;
        a1.x = 20;
        a1.y = 42;
        System.out.println("\n");
        System.out.println("Update a1:");
        a1.printDetails();
    }

}
