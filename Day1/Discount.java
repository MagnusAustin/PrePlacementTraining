import java.util.Scanner;

/**
 *
 * @author anike
 */
public class Discount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
                
                System.out.println("Write a amount");
                int d = sc.nextInt();
                
                System.out.println("Are you a student");
                String a = sc.next();
                
                double net;
                
                if("yes".equals(a))
                    if(d>=500)
                        net =d-((double)d)*(0.10);
                    else
                        net =d-((double)d)*(0.05);
                else
                    if(d>=500)
                        net =d-((double)d)*(0.08);
                    else
                        net =d-((double)d)*(0.02);
                System.out.println(net);
       
    }
}
