import java.util.Scanner;

/**
 * Search
 */
public class Search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int x = sc.nextInt();
        int[] arr = new int[x];
        int flag = 0;
        System.out.println("Enter Array Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); 
        }
        System.out.println("Enter Element To Search");
        int key = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println("Found "+key+" at "+i+1+" position");
                flag = 1;
                System.exit(0);
            }
        }
        if (flag == 0) {
            System.out.println("Element Not Found");
        }
    }
}