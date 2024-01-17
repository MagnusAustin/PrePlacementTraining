import java.util.Scanner;

/**
 *
 * @author anike
 */
    class UsernameException extends Exception{
        public UsernameException(){
                System.out.println("Username is invalid");
        }
    }

public class JavaApplication5 {
    /**
     * @param args the command line arguments
     */
    static void status(String name) throws UsernameException{
        if ("manas".equals(name))
            System.out.println("Welcome");
        else
            throw new UsernameException();
    }
    public static void main(String[] args) throws UsernameException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String b = sc.next();
        JavaApplication5.status(b);   
    }   
}
