abstract class ABC{
    abstract void m1();
    abstract void m2();
    abstract void m3();
    void m4(){
        System.out.println("Non-Abstract Method");
    }
}
public class Test extends ABC{
    /**
     * @param args the command line arguments
     */
    void m1(){
        System.out.println("Abstract Method");
    }
    void m2(){
        System.out.println("Abstract Method");
    }
    void m3(){
        System.out.println("Abstract Method");
    }
    Test(){
        System.out.println("Class Constructor");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Test z =new Test();
        z.m1();
        z.m2();
        z.m3();
        z.m4();
    }
}
