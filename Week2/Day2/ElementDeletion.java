import java.util.Scanner;

public class ElementDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Array ");
        int n = sc.nextInt();

        int arr[] = new int[n+1];

        System.out.println("Enter Array Elements");
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements in Array");
        for(int i = 0; i<n;i++){
            System.out.print(i+"\t");
        }
        System.err.println();
        for(int i = 0; i<n;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

        System.out.print("Enter loc to be deleted ");
        int loc = sc.nextInt();
        
        //Element deletion code
        for(int i=loc;i<n;i++){
            arr[i]=arr[i+1];
        }

        System.out.println("Elements in Array");
        for(int i = 0; i<n-1;i++){
             System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
}
