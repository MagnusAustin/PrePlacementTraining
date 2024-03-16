import java.util.Scanner;

/**
 *
 * @author anike
 */
public class NotesRequired {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Amount");
        int net = sc.nextInt();
        
        System.out.println("Press 1 to start");
        int n = sc.nextInt();
        
        switch (n){
            case 1:
                int n1=net/2000; 
                net= net-2000*n1;
                System.out.println("Amount of 2000 used "+n1);
            case 2:
                int n2=net/500;
                net= net-500*n2;
                System.out.println("Amount of 500 used "+n2);
            case 3:
                int n3=net/200;
                net= net-200*n3;
                System.out.println("Amount of 200 used "+n3);
            case 4:
                int n4=net/100;
                net= net-100*n4;
                System.out.println("Amount of 100 used "+n4);
            case 5:
                int n5=net/50;
                net= net-50*n5;
                System.out.println("Amount of 50 used "+n5);
            case 6:
                int n6=net/20;
                net= net-20*n6;
                System.out.println("Amount of 20 used "+n6);
            case 7:
                int n7=net/10;
                net= net-10*n7;
                System.out.println("Amount of 10 used "+n7);
            case 8:
                int n8=net/5;
                net= net-5*n8;
                System.out.println("Amount of 5 used "+n8);
            case 9:
                int n9=net/2;
                net= net-2*n9;
                System.out.println("Amount of 2 used "+n9);
            case 10:
                int n10=net/1;
                net= net-1*n10;
                System.out.println("Amount of 1 used "+n10);
            
        }
    }
}
