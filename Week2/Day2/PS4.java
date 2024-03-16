/**
 * PS4
 */
public class PS4 {

    public static void main(String[] args) {
        String str = "learning java is not as fun as it seems";
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' '){
                rev += str.charAt(i);
            }
            if (str.charAt(i) == ' ') {
                rev +=  " ";
            }
            
        //String rev = "seems it as fun as not is java learning";
        System.out.println(rev);
    }
}
}