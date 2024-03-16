import java.util.Scanner;

/**
 *
 * @author anike
 */
public class SumofFour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
                System.out.println("Enter Value of A");
                int a = sc.nextInt();
                int n1= a%10;
                a=a/10;
                int n2 = a%10;
                int temp = a/10;
                int n3 = temp %10;
                int n4 = temp/10;      
                int res = n1 + n2 + n3 + n4;
                System.out.println(res);
    }
}
