interface I1{
    void m1();
    void m2();
    void m3();
}
abstract class ABC implements I1{
    public void m1(){
        System.out.println("ABC");
    }
}
abstract class XYZ extends ABC{
    public void m2(){
        System.out.println("XYZ");
    }
}
class PQR extends XYZ{
    public void m3(){
        System.out.println("PQR");
    }
}
public class Test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PQR p = new PQR();
        p.m1();
        p.m2();
        p.m3();
    }
}
