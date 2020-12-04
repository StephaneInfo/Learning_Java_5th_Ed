package ch05;

public class Field {

    Apple a1 = new Apple();
    Apple a2 = new Apple();

    public void setupApples(){
        a1.setDiameter(3.0F);
        a1.mass = 5.0F;
        a1.x = 20;
        a1.y = 40;

        a2.setDiameter(8.0F);
        a2.mass = 10.0F;
        a2.x = 25;
        a2.y = 40;
    }

    public void detectCollisions(){
        if(a1.IsTouching(a2)){
            System.out.println("\n Collision détectée");
        }
        else{
            System.out.println("\n Les pommes ne se touchent pas !");
        }
    }

}
