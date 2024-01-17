public class JavaApplication5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "Ashish";
        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);
                
        StringBuffer sb2 = new StringBuffer("Prashant");
        String str1 = sb2.toString();
        System.out.println(str1);
    }   
}
