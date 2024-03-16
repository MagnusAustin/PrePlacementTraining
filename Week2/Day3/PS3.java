package Week2.Day3;

/**
 * PS3
 * Incomplete
 */
public class PS3 {

    static int jug5[] = new int[5];
    static int jug3[] = new int[3];
    
    public void fill(int stack[]){
        for (int i = 0; i < stack.length; i++) {
            stack[i]=1;
        }
    }

    public void swap(int stack1[],int stack2[]){
        if (stack1.length<stack2.length) {
            for (int i = 0; i < stack1.length; i++) {
                stack2[i]=stack1[i];
                stack1[i]=0;
            }
        }
        else{
            for (int i = 0; i < stack1.length; i++) {
                if(i>=stack2.length){
                    break;
                }
                stack2[i]=stack1[i];
                stack1[i]=0;
            }
        }
    }

    public void empty(int stack[]){
        for (int i = 0; i < stack.length; i++) {
            stack[i]=0;
        }
    }

    public static void main(String[] args) {

        PS3 p = new PS3();

        p.fill(jug5);
        p.swap(jug5, jug3);
        for (int i = 0; i < jug5.length; i++) {
            System.out.println(jug5[i]);
        }
        System.err.println();
        for (int i = 0; i < jug3.length; i++) {
            System.out.println(jug3[i]);
        }
        p.empty(jug3);
        p.swap(jug5, jug3);
        System.err.println();
        for (int i = 0; i < jug3.length; i++) {
            System.out.println(jug3[i]);
        }
    }
}