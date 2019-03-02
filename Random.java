import java.lang.Math;

public class Random{

     public static void main(String []args){
        Garis garis = new Garis(new Titik(1,2), new Titik(4,5));
        
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

        public int length() {
            int x1 = this.a.getX();
            int x2 = this.b.getX();
            int y1 = this.a.getY();
            int y2 = this.b.getY();
            return Math.sqrt(Math.pow( (x1 - x2), 2) + Math.pow((y1 - y2), 2));
        }
    }
}
