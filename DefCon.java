class NewClass{
    double a;
    double b;
    double c;
    double s;
    
    public NewClass(){
        a =4;
        b= 5;
        c=6;
        s=(a+b+c)/2;
        System.out.println(a+b+c);
        System.out.println(Math.sqrt((s*(s-a)*(s-b)*(s-c))));
        
    }
    
}

public class JavaApplication5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewClass obj = new NewClass(); 

    }    
} 
