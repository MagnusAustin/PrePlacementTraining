interface ABC{
    default void m1(){
        System.out.println("ABC m1");
    }
} 
interface XYZ{
    default void m1(){
        System.out.println("XYZ m1");
    }
}  
class JavaApplication5 implements ABC, XYZ{
    /**
     * @param args the command line arguments
     */   
    public void m1(){
        System.out.println("main m1");
    }
    public static void main(String[] args) {
        new JavaApplication5().m1();
        
    }        
}
