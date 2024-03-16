public class InsertionSort {
    public static void main(String[] args) {
        
        int arr[] = {9,8,7,6,5,4,3,2,1};
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int loc = i-1;
            while(loc>=0 && arr[loc]>temp) {
                arr[loc+1]=arr[loc];
                loc--;
            }
            arr[loc+1]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}