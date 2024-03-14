/**
 * P4
 * Thread Priorities
 */
public class P4 extends Thread{
    public void run(){
        System.out.println("Inside run method");
    }
    public static void main(String[] args) {
        P4 t1 = new P4();
        P4 t2 = new P4();
        P4 t3 = new P4();
        
        System.out.println("t1 Thread priority"+ t1.getPriority());
        System.out.println("t2 Thread priority "+ t2.getPriority());
        System.out.println("t3 Thread priority "+ t3.getPriority());
        
        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);

        // t1.setPriority(23); Throws Error

        System.out.println("t1 Thread priority"+ t1.getPriority());
        System.out.println("t2 Thread priority "+ t2.getPriority());
        System.out.println("t3 Thread priority "+ t3.getPriority());

        System.out.println("Current Thread Name: "+Thread.currentThread().getName());
        System.out.println("Main Thread Priority: "+ Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(MAX_PRIORITY);
        System.out.println("Main Thread Priority: "+ Thread.currentThread().getPriority());
    }
}
