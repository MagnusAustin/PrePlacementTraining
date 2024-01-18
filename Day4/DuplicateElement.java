import java.util.Scanner;
/**
 *
 * @author anike
 */
public class JavaApplication5 {
    /**
     * @param args the command line arguments
     */     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        
        int arr[] = new int[len];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int opr=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Repeat");
                    opr++;
                    break;}
            }
            if(opr>0)
                break;
        }
    }      
}
