class ThisKeyword{
    int a;
    int b;
    
    ThisKeyword(){
        this(10,20);
    }
    ThisKeyword(int x, int y){
        a=x;
        b=y;
    }
    void show(){
        System.out.println(a);
        System.out.println(b);
    }     
}
public class JavaApplication5 {
    /**
     * @param args the command line arguments
     */     
    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword();
        obj.show();
    }      
}
