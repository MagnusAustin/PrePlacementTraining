class ThisKeyword{
    int a;
    int b;
    
    ThisKeyword(int a, int b){
        this.a=a;
        this.b=b;
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
        ThisKeyword obj = new ThisKeyword(10,20);
        obj.show();
    }      
}
