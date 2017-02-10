package ejerciciopoo;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author Equipo
 */
public class POO {
   private  Turtle joe;
   
   public POO(){
     this.joe =  new Turtle(); 
   }
   
   public void dibujar(){
       square(-100,-50,100,100);
       square(-50,-50,100,100);
       square(-100,0,50,50);

       circle(120,50,1);



   } 
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       POO e = new POO();
       e.dibujar();
    }


    public void square(double a, double b, int c, int d){
        joe.setX(a);
        joe.setY(b);
        for(int i=0 ;i<2;i++){
            joe.right(90);
            joe.fd(c);
            joe.right(90);
            joe.fd(d);
        }
    }

    public void triangle(double a, double b,int c){
        joe.setX(a);
        joe.setY(b);
        //triangle
            joe.right(30);
            joe.fd(c);
            joe.right(120);
            joe.fd(c);
            joe.right(120);
            joe.fd(c);
    }

    public void circle(double a, double b,int c){
        joe.setX(a);
        joe.setY(b);
        for(int i=0;i<360;i++){
            joe.right(1);
            joe.fd(c);
        }
    }
}
