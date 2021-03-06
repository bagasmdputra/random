import java.lang.Math;

public class Random{

     public static void main(String []args){
        Titik titik1 = new Random(). new Titik(1,2);
        Titik titik2 =  new Random(). new Titik(4,5);
        Garis garis = new Random(). new Garis(titik1,titik2);
        
        System.out.println("Panjang garis: " + garis.length());
     }
     
    class Titik{
        private int x,y;

        public Titik(){
            this.x = 0;
            this.y = 0;
        }

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
        
        public double distanceTo(Titik xy2) {
            return Math.sqrt(Math.pow( (this.x - xy2.getX()), 2) + Math.pow((this.y - xy2.getY()), 2));
        }
    }

    class Garis{
        private Titik a,b;

        public Garis(){
            this.a = new Titik();
            this.b = new Titik();
        }

        public Garis(Titik a, Titik b){
            this.a = a;
            this.b = b;
        }

        /**
         * @param a the a to set
         */
        public void setA(Titik a) {
            this.a = a;
        }

        /**
         * @param b the b to set
         */
        public void setB(Titik b) {
            this.b = b;
        }

        /**
         * @return the a
         */
        public Titik getA() {
            return a;
        }

        /**
         * @return the b
         */
        public Titik getB() {
            return b;
        }

        public double length() {
            return this.a.distanceTo(this.b);
        }
    }
}
