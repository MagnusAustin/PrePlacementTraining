/**
 * P7
 * Thread Interruption
 */
public class P7 {

    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        t.interrupt();
        for(int i=0;i<=10;i++){
            System.out.println("Main Thread");
            Thread.sleep(1000);
        }       
    }
}

class MyThread extends Thread{
    public void run(){
        try{
            for(int i=0;i<=10;i++){
                System.out.println("Child Thread");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println("Caught Interrupted Exception");
        }
    }
    
}