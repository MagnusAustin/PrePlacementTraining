import java.util.Scanner;

/**
 *
 * @author anike
 */
public class ArmAny {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number");
        int a = sc.nextInt();
        int i =0;
        int b =0;
        int sum=0;
        int temp =a;
        int temp1 =a;
        
        while(temp1!=0){
            temp1=temp1/10;
            b++;
        }
        
        System.out.println(b);

        while(a!=0){
            sum =((int) Math.pow((a%10),b))+sum;
            a=a/10;
            i++;
        }
        
        if(temp==(int)sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
 
    }
}
