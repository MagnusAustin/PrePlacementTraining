public class NumOfDigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number");
        int a = sc.nextInt();
        int i =0;

        while(a!=0){
            a=a/10;
            i++;
        }
        
        System.out.println(i);
  
    }
}
