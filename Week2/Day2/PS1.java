import java.util.Scanner;

public class PS1 {
    public static void main(String[] args) {
        long arr1[] = {3234567890L, 4345678901L, 1456789012L, 2567890123L, 6123457890L, 9123456780L, 5123467890L, 8123456790L, 7123456890L, 1234567890L};
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

        for (int i = 0; i < arr1.length; i++) {
            if (i==3 || i==6) {
                System.out.println(arr1[i]+" Hi");
            }
            System.out.println(arr1[i]+" Hello");
        }

    }
}
