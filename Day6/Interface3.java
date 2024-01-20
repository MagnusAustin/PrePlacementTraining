interface ABC{
    double m1(int a, String str);
    int m1(char ch);
}
  
public class JavaApplication5 implements ABC{
    /**
     * @param args the command line arguments
     */   
    public double m1(int a, String str){
            return 22.2;
        }
    
    public int m1(char ch){
        return 40;
    }
    
    public static void main(String[] args) {
        JavaApplication5 z = new JavaApplication5();
        int i = z.m1('m');
        System.out.println(i);
        double d = z.m1(4, "manas");
        System.out.println(d);
    }        
}
