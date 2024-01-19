class A{
    void showA(){
        System.out.println("I am in A");
    }
}

class B extends A{
    void showB(){
        System.out.println("I am in B");
    }
}

class C extends B{
    void showC(){
        System.out.println("I am in C");
    }
}

class D extends A{
    void showD(){
        System.out.println("I am in D");
    }
}
public class JavaApplication5 {
    /**
     * @param args the command line arguments
     */     
    public static void main(String[] args) {
        C c = new C();
        c.showA();
        c.showB();
        c.showC();
        D d = new D();
        d.showA();
        d.showD();
    }      
}
