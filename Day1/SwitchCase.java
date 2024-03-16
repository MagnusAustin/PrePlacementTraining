import java.util.Scanner;

/**
 *
 * @author anike
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Value of First Num");
        int a = sc.nextInt();
        System.out.println("Enter Value of Second Num");
        int b = sc.nextInt();
        
        System.out.println("Enter Operation");
        int n = sc.nextInt();
        
        switch (n){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println((double)a/b);
                break;
            case 5:
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid");
                break;
        }
        
       
    }
}
