import java.util.Scanner;

/**
 *
 * @author anike
 */
public class Week {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
                
                System.out.println("What DAY it is?");
                String d = sc.next();
                
                if("sun".equals(d) || "sat".equals(d) || "fri".equals(d) )
                    System.out.println("Weekend");
                else
                    System.out.println("Weekday");
               
           
    }
}
