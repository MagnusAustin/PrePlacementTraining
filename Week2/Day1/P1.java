/**
 * P1
 * Extends Thread class
 */
public class P1 {   
    public static void main(String[] args) {
        MyThread m = new MyThread();
        m.start();
        for(int i=0;i<=10;i++){
            System.out.println("Main Thread : " + i);
        }
    }
}
class MyThread extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("MyThread : " + i);
        }
    }
}