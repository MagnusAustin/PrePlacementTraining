import java.util.Scanner;

/**
 *
 * @author anike
 */
public class SumSeries1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        double a = sc.nextDouble();
        
        System.out.println("Enter n");
        double n = sc.nextDouble();
        
        double i;
        double sum=1;
        
        for(i=1;i<=n;i++){
            
           sum=(((double) Math.pow(a,i))/i)+sum;
           
            
        }
        System.out.println(sum);
    }
    
}
