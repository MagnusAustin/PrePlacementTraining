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

    class PasswordException extends Exception{
        public PasswordException(){
                System.out.println("Password is invalid");
        }
    }

public class JavaApplication5 {
    /**
     * @param args the command line arguments
     */
    static void statusUsername(String name) throws UsernameException{
        if ("manas".equals(name))
            System.out.println("Plz enter your password");
        else
            throw new UsernameException();
    }
    static void statusPassword(String name) throws PasswordException{
        if ("123456".equals(name))
            System.out.println("Welcome");
        else
            throw new PasswordException();
    }
    public static void main(String[] args) throws UsernameException, PasswordException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String b = sc.next();
        JavaApplication5.statusUsername(b);   
        
        String a = sc.next();
        JavaApplication5.statusPassword(a); 
    }   
}
