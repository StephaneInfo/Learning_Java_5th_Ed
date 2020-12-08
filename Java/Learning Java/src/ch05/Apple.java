package ch05;

public class Apple {

    float mass;
    int size;
    static float gravAccel = 9.8F;
    static final float EARTH_ACCEL = 9.8F;
    static int SMALL = 0, MEDIUM = 1, LARGE = 2;
    private float diameter = 1.0F;
    int x, y;

    public void setDiameter(float newDiameter){
        diameter = newDiameter;
    }

    public float getDiameter(){
        return(diameter);
    }

    float getWeight(){
        return mass * gravAccel;
    }

    public static String[] getAppleSizes(){
        return(new String[]{"SMALL", "MEDIUM", "LARGE"});
    }

    public void resetEverything(){
        setSize(MEDIUM);
    }

    private void setSize(int s) {
        size = s;
    }

    public void moveTo(int x, int y){
        System.out.println("La pomme s'est déplacé à "+x+","+y);
        this.x = x;

        if(y > diameter/2){
            this.y = y;
        }
        else{
            this.y = (int)(diameter/2);
        }
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

        String niceNames[] = getAppleSizes();
        if(diameter < 5.0F){
            System.out.println("C'est une "+niceNames[SMALL]+" pomme");
        }
        else if(diameter < 10.0F){
            System.out.println("C'est une "+niceNames[MEDIUM]+" pomme");
        }
        else{
            System.out.println("C'est une "+niceNames[LARGE]+" pomme");
        }

        System.out.println(" position:("+this.x+","+y+")");
    }

}
