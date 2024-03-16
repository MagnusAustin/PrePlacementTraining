/**
 * P9
 */
public class P9 {

   public static void main(String[] args) {
    MyThread t = new MyThread();
    t.setDaemon(true);
    t.start();
    for(int i = 0; i<10;i++){
        System.out.println("Main Thread"+i);
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException ie){
            ie.printStackTrace();
        }

}
   } 
}

class MyThread extends Thread{
    public void run(){
        for(int i = 0; i<10;i++){
            System.out.println("Daemon Thread"+i);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }

    }
}
}
