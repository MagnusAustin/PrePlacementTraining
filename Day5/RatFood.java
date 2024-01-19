public class JavaApplication5 {
    /**
     * @param args the command line arguments
     */            
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        
        int r=2;
        int unit = 7;
        int tot=0;
        for(int i =0;i<5;i++){
            tot=tot+arr[i];
        }
        System.out.println(tot);
        if(r*unit<tot)
            System.out.println("Success");
    }      
}
