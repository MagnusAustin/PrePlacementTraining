import java.util.Scanner;

/**
 *
 * @author anike
 */
public class PassOrFail1 {

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
                
                double per= ((double)(a+b+c)/300)*100;
                if (per > 45)
                    System.out.println("Pass");
                else
                    System.out.println("FAIL");
    }
}
