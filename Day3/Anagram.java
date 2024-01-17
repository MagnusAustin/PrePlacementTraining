public class JavaApplication5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a = "heart";
        String b = "earth";
        int opr=0;
        for(int i=0; i<a.length();i++){
            for(int j=0; j<a.length();j++){
                if(a.charAt(i)==b.charAt(j)){
                    opr++;
                }
            }
        }
        if(opr==a.length())
        System.out.println("Anagram");
    }   
}
