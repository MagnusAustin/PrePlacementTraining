public class JavaApplication5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = {100,80,60,70,60,75,85};
        int res[] = new int[arr.length];
        res[0] = 1;
        
        for(int i =1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                System.out.print("1 ");
                res[i] = 1;
                }else{
                System.out.print("2 ");
            res[i]=2;}
        }
        System.out.println();
        for(int i =0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }   
}
