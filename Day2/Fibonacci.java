import java.util.Scanner;

/**
 *
 * @author anike
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        
        int i;
        int f1=0;
        int f2=1;
        int f3 = 0;
        
        System.out.print(f1);
        System.out.print(" "+f2);
        
        for(i=3;i<=n;i++){
            f3=f1+f2;
            System.out.print(" "+f3);
            f1=f2;
            f2=f3;
            
        }
        System.out.println();
    }
    
}
