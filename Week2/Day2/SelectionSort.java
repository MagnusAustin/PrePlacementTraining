public class SelectionSort {
    public static void main(String[] args) {
        int arr1[] = {1,6,2,5,4,8,3,9};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
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
