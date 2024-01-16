import java.util.Scanner;

/**
 *
 * @author anike
 */
public class EvenNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        int i;
        int sum=0;
        for(i=1;i<=20;i++){
            if(i%2==0)
                sum=i+sum;
            
    }
        System.out.println(sum);
    }
    
}
