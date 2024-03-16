import java.util.Scanner;

/**
 *
 * @author anike
 */
public class Vowel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
                
                System.out.println("Type a letter");
                String d = sc.next();
                
                if("a".equals(d) || "e".equals(d) || "i".equals(d) || "o".equals(d) || "u".equals(d) )
                    System.out.println("Vowel");
                else
                    System.out.println("Consonant");
               
           
    }
}
