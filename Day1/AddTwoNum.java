import java.util.Scanner;

/**
 *
 * @author anike
 */
public class AddTwoNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
                System.out.println("Enter Value of A");
                int a = sc.nextInt();
                System.out.println("Enter Value of B");
                int b = sc.nextInt();
                
                int res = a+b;
                System.out.println(res);
    }
}
