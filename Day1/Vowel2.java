import java.util.Scanner;

/**
 *
 * @author anike
 */
public class Vowel2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter char");
        char n = sc.next().charAt(0);
        
        switch (n){
            case ('a'):
                System.out.println("Vowel");
                break;
            case ('e'):
                System.out.println("Vowel");
                break;
            case ('i'):
                System.out.println("Vowel");
                break;
            case ('o'):
                System.out.println("Vowel");
                break;
            case ('u'):
                System.out.println("Vowel");
                break;    
            default:
                System.out.println("Consonant");
                break;
        }
        
       
    }
}
