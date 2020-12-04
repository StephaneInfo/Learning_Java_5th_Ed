package ch05;

public class Apple {

    float mass;
    private float diameter = 1.0F;
    int x, y;

    public void setDiameter(float newDiameter){
        diameter = newDiameter;
    }

    public float getDiameter(){
        return(diameter);
    }

    boolean IsTouching(Apple other){

        double xDiff = x - other.x;
        double yDiff = y - other.y;
        double distance = Math.sqrt(xDiff * xDiff + yDiff * yDiff);

        if(distance < (diameter/2 + other.diameter/2)){
            return(true);
        }
        else {
            return(false);
        }
    }

    public void printDetails(){
        System.out.println(" mass:"+this.mass);
        System.out.println(" diameter: "+diameter);
        System.out.println(" position:("+this.x+","+y+")");
    }

}
