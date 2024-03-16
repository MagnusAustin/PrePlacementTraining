import java.util.Scanner;

/**
 *
 * @author anike
 */
public class Symbols {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
                
                System.out.println("Write a char");
                char d = sc.next().charAt(0);
                
                int a = (int)d;
               // System.out.println(a);
                
               if(a>=97 && a<=122)
                   System.out.println("Lowercase");
               else if(a>=65 && a<=90)
                   System.out.println("Uppercase");
               else if(a>=48 && a<=57)
                   System.out.println("Digits");
               else
                   System.out.println("Symbols");
       
    }
}
