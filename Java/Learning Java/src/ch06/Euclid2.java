package ch06;

public class Euclid2 {

    public static void main(String args[]){
        int a = 2701;
        int b = 222;

        if(args.length == 2){
            try {
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
            }
            catch (NumberFormatException nfe){
                System.err.println("Les arguments fournis ne sont pas tous les " +
                        "deux des nombres. Utilisation des valeurs par defaut : " +
                        "a = 2701 et b = 222.");
            }
        }
        else{
            System.err.println("Le nombre d'arguments n'est pas respecté (2 attendus)." +
                    " Utilisation des valeurs par défaut.");
        }

        System.out.print("The GCD of "+a+" and "+b+" is ");
        while(b != 0){
            if(a > b){
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        System.out.println(a);

    }
}
