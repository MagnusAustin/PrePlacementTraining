class Rats{
    public void m1(int r, int unit, int... arr){
        int food = r*unit;
        int total = 0;

        for(int a1:arr){
        total = total+a1;
        }
        System.out.println("The total is"+total);
        if (food<total){
            System.out.println("food is enough");

        }
    }
}
public class E18 {
    public static void main(String[] args) {
        Rats obj = new Rats();
        obj.m1(2, 7, 1,2,3,4,5);
    }
    
}
