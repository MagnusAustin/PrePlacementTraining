import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author anike
 */
public class SemMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        
        
        System.out.println("Enter Number of Semesters");
        int n=sc.nextInt();
        int sem[]= new int[n];
        
        for(int a=0; a<sem.length;a++){
        
        System.out.println("Enter Number of Subjects in Sem "+(a+1));
        int n1=sc.nextInt();
        int res[]= new int[n1];
        
        for(int i = 0; i<res.length ; i++){
            System.out.println("Enter Marks of Subject "+(i+1));
            res[i]=sc.nextInt();
        }
        System.out.println();
        int max=0;
        for(int i = 0; i<res.length ; i++){
            if(max<res[i])
                max=res[i];
        }
        System.out.println("Max of sem "+(a+1)+" "+max);
        
        }     
        
    }
    
}
