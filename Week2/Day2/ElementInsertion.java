import java.util.Scanner;

/**
 * ElementInsertion
 */
public class ElementInsertion {

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
             System.out.print(arr[i]+"\t");
        }
        System.out.println();
        System.out.print("Enter num to be inserted ");
        int ins = sc.nextInt();
        System.out.print("Enter loc to be inserted ");
        int loc = sc.nextInt();

        //Element insertion code
        for(int i = n;i>loc;i--){
            arr[i]=arr[i-1];
        }
        arr[loc]= ins;

        System.out.println("Final Array");
        for(int i = 0; i<=n;i++){
            System.out.print(arr[i]+"\t");
       }
    }
}
