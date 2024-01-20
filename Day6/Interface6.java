interface ABC{
    void m1();
    default void m2(){
        System.out.println("Default");
    }
    static void m3(){
        System.out.println("Static");
    }
} 
class JavaApplication5 implements ABC{
    /**
     * @param args the command line arguments
     */   
    public void m1(){
        System.out.println("Abstract");
    }
    public static void main(String[] args) {
        JavaApplication5 z =new JavaApplication5();
        z.m1();
        z.m2();
        ABC.m3();
    }        
}
