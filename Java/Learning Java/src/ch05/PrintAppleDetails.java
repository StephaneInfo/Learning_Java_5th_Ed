package ch05;

public class PrintAppleDetails {

    public static void main(String args[]){

        String nicesNames[] = Apple.getAppleSizes();
        Apple a1 = new Apple();
        System.out.println("Apple a1:");
        System.out.println("mass: "+a1.mass);
        System.out.println(" diameter: "+a1.getDiameter());
        System.out.println(" position:("+a1.x+","+a1.y+")");

        if(a1.getDiameter() < 5.0F ){
            System.out.println("C'est une "+nicesNames[Apple.SMALL]+ " pomme");
        }
        else if(a1.getDiameter() < 10.0F){
            System.out.println("C'est une "+nicesNames[Apple.MEDIUM]+ " pomme");
        }
        else{
            System.out.println("C'est une "+nicesNames[Apple.LARGE]+ " pomme");
        }

    }

}
