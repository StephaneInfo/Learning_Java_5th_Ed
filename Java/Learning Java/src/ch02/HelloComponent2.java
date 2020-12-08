package ch02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloComponent2 extends JComponent
        implements MouseMotionListener  {

    String theMessage;
    int messageX = 125, messageY = 95; // Coordonnées du message

    public HelloComponent2(String message){
        theMessage = message;
        addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g){
        g.drawString(theMessage, messageX, messageY );
    }

    public void mouseDragged(MouseEvent e){
        /**
         * Sauvegarde les coordonnées de la souris et "peint" le message
         */
        messageX = e.getX();
        messageY = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e){}

}
