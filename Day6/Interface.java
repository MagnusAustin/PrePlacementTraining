interface ABC{
    public void show();
}

class PQR{
    static int i= 20;
}   
public class JavaApplication5 extends PQR implements ABC {
    /**
     * @param args the command line arguments
     */
    public void show(){
        System.out.println("I am in ABC");
    }
    
    public static void main(String[] args) {
        ABC a;
        JavaApplication5 z = new JavaApplication5();
        a=z;
        a.show();
        System.out.println(i);
    }
         
}
