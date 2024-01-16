import java.util.Scanner;

/**
 *
 * @author anike
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number");
        int a = sc.nextInt();
        int fact=1;

        while(a!=0){
            fact=fact*a;
            a--;
        }
        System.out.println(fact);
    }
}
