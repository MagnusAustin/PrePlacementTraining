package Week2.Day3;

/**
 * PS2
 * Array Rotation
 */
public class PS2 {



    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int[] rot_array = new int[5];
        int n = 3;
        int counter = 0;
        int counter1 = array.length-n;
        
        for (int i = 0; i < n; i++) {
            rot_array[i]=array[counter1];
            counter1++;
        }

        for (int i = rot_array.length-(array.length-n); i < array.length; i++) {
            rot_array[i]=array[counter];
            counter++;
        } 
        for (int i : rot_array) {
            System.out.print(i+"\t");
        }
    }
}