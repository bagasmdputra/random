public class Random{

     public static void main(String []args){
        System.out.println("Hello World");
     }
     
}


class Titik{
    private int x,y;
    
    public Titik(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }
}
