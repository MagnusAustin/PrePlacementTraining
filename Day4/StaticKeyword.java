public class JavaApplication5 {
    /**
     * @param args the command line arguments
     */
    static{
        System.out.println("I am in static block");
    }
    
    static int num(){
        return 40;
    }
    
    public static void main(String[] args) {
        System.out.println(JavaApplication5.num());
        System.out.println("I am in main");
    }    
}
