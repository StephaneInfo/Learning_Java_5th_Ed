package ch05;

public class PrintAppleDetails4 {

    public static void main(String args[]){

        Field f = new Field();
        f.setupApples();
        System.out.println("Pomme a1:");
        f.a1.printDetails();
        System.out.println("\n Pomme a2:");
        f.a2.printDetails();

        f.detectCollisions();

    }

}
