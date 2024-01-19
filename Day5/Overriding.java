class A{
    public A(){
        System.out.println("A Default Constructor");
    }
    void showA(){
        System.out.println("I am in A");
    }
}

class B extends A{
    public B(){
        System.out.println("B Default Constructor");
    }
    void showB(){
        System.out.println("I am in B");
    }
}
public class JavaApplication5 {
    /**
     * @param args the command line arguments
     */     
    public static void main(String[] args) {
        B obj = new B();
        obj.showB();
        obj.showA();
    }      
}
