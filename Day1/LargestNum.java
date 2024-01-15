import java.util.Scanner;

/**
 *
 * @author anike
 */
public class LargestNum {

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
                System.out.println("Enter Value of C");
                int c = sc.nextInt();
                System.out.println("Enter Value of D");
                int d = sc.nextInt();
                System.out.println("Enter Value of E");
                int e = sc.nextInt();
                
                int max = a;
                
                if (max < b)
                    max = b;
                if (max < c)
                    max = c;
                if (max < d)
                    max = d;
                if (max < e)
                    max = e;
                
                System.out.println(max);
                
               
                
                
    }
}
