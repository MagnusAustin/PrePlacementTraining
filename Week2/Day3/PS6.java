package Week2.Day3;

public class PS6 {
int stacks[] = new int[5] ;  // Declare a Stack of size  5
int top = -1;
    public int pop(){
            return(stacks[top--]);
        }
    

    public void push(int pushed_char){
            top++;
            stacks[top]=pushed_char;
    }

    public void display(){
        for (int i = 0; i<=top;i++) {
            System.out.println(stacks[i]);
        }
    }

    public static void main(String[] args) {
        int mid = 5/2;
        PS6  a = new PS6();
        PS6  b = new PS6();

        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.push(5);

        a.display();

        for (int i = 0; i < mid; i++) {
            b.push(a.stacks[i]);
        }
        b.display();
        for (int i = mid+1; i < 5; i++) {
            b.push(a.stacks[i]);
        }
        b.display();
    }
}
