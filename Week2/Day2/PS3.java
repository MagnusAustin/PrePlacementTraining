/**
 * PS3
 */
public class PS3 {

    public static void main(String[] args) {
        String email[] = {"manas@27","raj@34","amogh@34","raj@67"};
        for (int i = 0; i < email.length; i++) {
            if(email[i].startsWith("raj")){
                System.out.println("Found");
            }
        }
    }
}
