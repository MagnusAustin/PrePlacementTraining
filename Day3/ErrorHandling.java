import java.util.Scanner;

/**
 *
 * @author anike
 */
public class ErrorHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        try{
            int a=5;
            int b= sc.nextInt();
            int res = a/b;
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("No Termination");
    }
    
}
