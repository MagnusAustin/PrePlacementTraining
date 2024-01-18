import java.util.Scanner;
/**
 *
 * @author anike
 */
class NewClass{
    
    public int fact(int n){
        if(n==0){
            return 1;}
        else{
            return n*fact(n-1);}
    }
    
    public int pow(int n,int m){
        int output =1;
        for(int i = 0; i<m;i++){
            output = output*n;
        }
        return output;
    }
}

public class JavaApplication5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewClass obj = new NewClass(); 
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter Choice");
            int n = sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter Number");
                    int q = sc.nextInt();
                    System.out.println(obj.fact(q));
                    break;
                case 2:
                    System.out.println("Enter Base");
                    int a = sc.nextInt();
                    System.out.println("Enter Power");
                    int b = sc.nextInt();
                    System.out.println(obj.pow(a,b));
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }    
} 
