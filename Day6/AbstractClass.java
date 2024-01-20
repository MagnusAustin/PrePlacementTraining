abstract class ABC{
    ABC(){
        System.out.println("ABC Constructor");
    }
}
public class Test extends ABC{
    /**
     * @param args the command line arguments
     */
    Test(){
        System.out.println("Class Constructor");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new Test();
    }
}
