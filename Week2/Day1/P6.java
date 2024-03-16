/**
 * P6
 * Join Method
 */
public class P6{

    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        t.join();
        for(int i =0;i<=10;i++){
            System.err.println("Main Thread");
        }
    }
}

class MyThread extends Thread{
    public void run(){
        for(int i = 0;i<=10;i++){
            System.out.println("Child Thread");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException ie){}
        }
    }
}