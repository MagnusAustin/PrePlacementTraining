class A{
    int a = 10;
    void addNum(){
        System.out.println(a);
    }
}

class B extends A{
    int a = 20;
    void addNum(){
        System.out.println(a);
    }
}
public class JavaApplication5 {
    /**
     * @param args the command line arguments
     */     
    public static void main(String[] args) {
        B obj = new B();
        obj.addNum();
    }      
}
