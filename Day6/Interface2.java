interface ABC{
    public void show1();
    interface PQR{
        public void show2();
    }
}
  
public class JavaApplication5 implements ABC, ABC.PQR {
    /**
     * @param args the command line arguments
     */
    public void show1(){
        System.out.println("I am in ABC");
    }
    
    public void show2(){
        System.out.println("I am in PQR");
    }
    
    public static void main(String[] args) {
        JavaApplication5 z = new JavaApplication5();
        z.show1();
        z.show2();
    }        
}
