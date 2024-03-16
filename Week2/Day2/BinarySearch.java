import java.util.Scanner;

/**
 * BinarySearch
 */
public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int x = sc.nextInt();
        int[] arr1 = new int[x];
        int flag = 0;
        System.out.println("Enter Array Elements");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt(); 
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j < arr1.length; j++) {
                if (arr1[i]>arr1[j]) {
                    arr1[i]=arr1[i]+arr1[j];
                    arr1[j]=arr1[i]-arr1[j];
                    arr1[i]=arr1[i]-arr1[j];
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+"\t");
        }
        System.err.println();

        System.out.println("Enter Element To Search");
        int key = sc.nextInt();

        int mid = x/2;
        int lb= 0;
        int ub= arr1.length-1;
        while (key!=arr1[mid] && lb<ub) {
            if(key<arr1[mid]){
                ub=mid-1;
            }
            else{
                lb=mid+1;
            }
            mid = (ub+lb)/2;
        }
        if (arr1[mid]==key) {
            System.out.println("Element Found at "+mid+1);
        }
    }
}