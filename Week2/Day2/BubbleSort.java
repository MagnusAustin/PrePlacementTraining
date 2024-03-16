public class BubbleSort {
    public static void main(String[] args) {
        
        int arr1[] = {9,8,7,6,5,4,3,2,1};
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
            for (int j = i+1; j < arr1.length; j++) {
                if (arr1[i]<arr1[j]) {
                    arr1[i]=arr1[i]+arr1[j];
                    arr1[j]=arr1[i]-arr1[j];
                    arr1[i]=arr1[i]-arr1[j];
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+"\t");
        }
    }
}
