import java.util.Scanner;
public class PS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = {70, 60, 90, 88, 155, 96, 76, 72, 81};

        int min=marks[0],loc=0,temp;

        for (int i = 0; i < marks.length; i++) {
            min = marks[i];
            loc = i;
            for (int j = i + 1; j < marks.length; j++) {
                if (min > marks[j]) {
                    min = marks[j];
                    loc = j;
                }
            }
            if (loc != i) {
                temp = marks[i];
                marks[i] = marks[loc];
                marks[loc] = temp;
            }
        }

        System.out.print("Sorted array is: ");
        for(int i = 0; i < 10; i++) {
            System.out.print(marks[i]+"\t");
        }
        System.out.println();
    }
}