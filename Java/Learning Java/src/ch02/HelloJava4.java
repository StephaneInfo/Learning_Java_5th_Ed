package ch02;

import javax.swing.*;

/**
 * Création d'une fenêtre affichant un texte pouvant être déplacé par un
 * "drag" et "drop" aux coordonnées de la souris.
 */
public class HelloJava4 {

    public static void main(String[] args){
        JFrame frame = new JFrame("Hello, Java!");

        //frame.add(new HelloComponent2("Hello, Java!"));

        /**
         * Passe le texte en parametre lors de l'appel de commande
         * ex : C:\> java HelloJava4 "Hello, Java!"
         */
        frame.add(new HelloComponent2(args[0]));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

}
