import java.util.Scanner;

/**
 *
 * @author anike
 */
public class SumOfTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
                System.out.println("Enter Value of A");
                int a = sc.nextInt();
                int n1= a%10;
                int n2=a/10;
                int res = n1 + n2;
                System.out.println(res);
    }
}
