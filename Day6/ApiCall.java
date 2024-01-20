class API{
    public int[] res;
    public API(int x, int y){
        res = new int[x];
        for(int i = 0;i<res.length;i++){
            if(i<y-1)
                res[i]=0;
            else
                res[i]=1;
        }
        System.out.println(Arrays.toString(res));
    }
    public boolean isBadVersion(int x){ //incomplete
        if(res[x]==1)
        return true;
        return false;
    }
}
public class Test {
    /**
     * @param args the command line arguments
     */     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        API a = new API(10,4);
        System.out.println(a.isBadVersion(4));
    }      
}
