import java.util.Scanner;

/**
 *
 * @author anike
 */
    class DemoException extends Exception{
        public DemoException(){
                System.out.println("Cannot marry");
        }
    }

public class JavaApplication5 {
    /**
     * @param args the command line arguments
     */
    static void status(int age) throws DemoException{
        if (age >18)
            System.out.println("Can Marry");
        else
            throw new DemoException();
    }
    public static void main(String[] args) throws DemoException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        JavaApplication5.status(b);   
    }   
}
