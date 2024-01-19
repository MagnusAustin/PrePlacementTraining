class A{
    int speed = 130;
    public void speedShow(){
        System.out.println(speed);
    }
} 

class B extends A{
    int speed = 140;
    public void speedShow(){
        System.out.println(speed);
        System.out.println(super.speed);
    }
} 
public class JavaApplication5 {
    /**
     * @param args the command line arguments
     */     
    public static void main(String[] args) {
        B b = new B();
        b.speedShow();
    }      
}
