public class RemovingArray {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a = "listen";
        String b = "i";
        char res[] = new char[a.length()];

            for(int i=0; i<a.length();i++){
                if(a.charAt(i)!=b.charAt(0)){
                    res[i]=a.charAt(i);
                }
            }
        String result = new String(res);
        System.out.println(result);
    }   
}
