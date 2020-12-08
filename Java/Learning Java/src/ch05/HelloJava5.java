package ch05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class HelloJava5 extends JFrame {

    public static void main(String[] args){
        HelloJava5 demo = new HelloJava5();
        demo.setVisible(true);
    }

    public HelloJava5(){
        super("HelloJava5");
        add(new HelloComponent3("Hello, inner Java!"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
    }

    /**
     * Class interne de HelloJava5
     * !!! A noter son constucteur HelloComponent3(String message) !!!
     */
    class HelloComponent3 extends JComponent{
        String theMessage;
        int messageX = 125, messageY = 95;

        public HelloComponent3(String message){
            theMessage = message;

            addMouseMotionListener(new MouseMotionListener(){
                public void mouseDragged(MouseEvent e) {
                    messageX = e.getX();
                    messageY = e.getY();
                    repaint();
                }

                public void mouseMoved(MouseEvent e) {}

            });

        }

        public void paintComponent(Graphics g){
            g.drawString(theMessage, messageX,messageY);
        }
    }

}
