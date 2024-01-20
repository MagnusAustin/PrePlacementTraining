public class Test {
    /**
     * @param args the command line arguments
     */        
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 0) {
            System.out.println("False");
        } else if (n == 1) {
            System.out.println("True");
        } else if (n % 4 != 0) {
            System.out.println("False");
        } else {
            int i = 1;
            int res = 1;
            while(i < n) {
                res = i * 4;
                i = res;
                if(i == n) {
                    System.out.println("True");
                }
            }
        }        
    }      
}
