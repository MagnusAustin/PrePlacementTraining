class B{
    int a = 20;
    void addNum(){
        System.out.println(a);
    }
    void addNum(int x,int y){
        System.out.println(x+y);
    }
    void addNum(int x,int y,int z){
        System.out.println(x+y+z);
    }
}
public class JavaApplication5 {
    /**
     * @param args the command line arguments
     */     
    public static void main(String[] args) {
        B obj = new B();
        obj.addNum();
        obj.addNum(10,20);
        obj.addNum(10,20,30);
    }      
}
