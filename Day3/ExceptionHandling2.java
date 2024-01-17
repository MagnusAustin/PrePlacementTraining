public class ExceptionHandling {

    /**
     * @param args the command line arguments
     */
    class DemoException{
        static void checkAge(int age){
            if(age>17)
                System.out.println("Can marry");
            else
                throw new ArithmeticException("Cannot marry");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int b = 18;
        DemoException.checkAge(b);
        
    }
    
}
