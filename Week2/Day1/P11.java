import java.util.*;
public class P11 {
    public static void main(String[] args) {
        ArrayList<String> color_list = new ArrayList<>(4);
        color_list.add("White");
        color_list.add("Black");
        color_list.add("Red");
        color_list.add("Blue");
        for(int i = 0; i<4;i++){
            System.err.println(color_list.get(i).toString());
        }
        System.err.println();
        ArrayList<String> sample = new ArrayList<>(3);
        sample.add("Yellow");
        sample.add("Green");
        sample.add("Brown");
        for(int i = 0; i<3;i++){
            System.err.println(sample.get(i).toString());
        }
        System.err.println();
        color_list.addAll(sample);
        for(int i = 0; i<4;i++){
            System.err.println(color_list.get(i).toString());
        }
    }
}
