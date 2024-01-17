public class JavaApplication5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a = "a";
        String b = "awercd";
        int i =0;
        int j =0;
        int opr=0;
        
        if(a.length()>b.length()){
            System.out.println(a.length()-b.length());}
        else if(a.length()<b.length()){
            System.out.println(b.length()-a.length());}   
        else{
        for(i =0; i<a.length()-1;i++){
            if(a.charAt(i)!=b.charAt(j)){ 
                opr++; 
            }
        j++;    
        }
        System.out.println(opr);
        }
    }   
}
