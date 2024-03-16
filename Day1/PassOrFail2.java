import java.util.Scanner;

/**
 *
 * @author anike
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
                System.out.println("Enter Value of First Paper");
                int a = sc.nextInt();
                System.out.println("Enter Value of Second Paper");
                int b = sc.nextInt();
                System.out.println("Enter Value of Third Paper");
                int c = sc.nextInt();
                
                System.out.println("Enter Your Gender");
                String d = sc.next();
                
                System.out.println("Enter Your Gender");
                
                double per= ((double)(a+b+c)/300)*100;
                if ("f".equals(d) && per > 62)
                    System.out.println("Pass");
                else
                    System.out.println("FAIL");
    }
}
