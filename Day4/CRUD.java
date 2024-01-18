import java.util.Scanner;
/**
 *
 * @author anike
 */
class CRUD{
    int rollno[] = new int[5];
    String name[] = new String[5];
    String city[] = new String[5];
    String mob[] = new String[5];
    int i = 0;
    
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        int rnum = sc.nextInt();
        rollno[i] = rnum;
        String sname = sc.next();
        name[i]= sname;
        String cname = sc.next();
        city[i]= cname;
        String mnum = sc.next();
        mob[i]= mnum;
        i++;
    }
    
    public void showData(String n){
        Scanner sc = new Scanner(System.in);
        if(n.equals("yes")){
        System.out.println("Rollno\tName\tCity\tMobile");
        for(int b=0;b<i;b++){
            if(name[b]==null)
            System.out.println("Missing information");
            else{
                System.out.print(rollno[b]+"\t");
                System.out.print(name[b]+"\t");
                System.out.print(city[b]+"\t");
                System.out.print(mob[b]+"\t");
                System.out.println();
                }
            }}
        else{
            System.out.println("Enter Serial number");
            int s= sc.nextInt();
            s=s-1;
            System.out.println("Rollno\tName\tCity\tMobile");
            if(name[s]==null)
            System.out.println("Missing information");
            else{
                System.out.print(rollno[s]+"\t");
                System.out.print(name[s]+"\t");
                System.out.print(city[s]+"\t");
                System.out.print(mob[s]+"\t");
                System.out.println();
                }
        }
        
    }
    
    public void updateData(int n){
        Scanner sc = new Scanner(System.in);
        int rnum = sc.nextInt();
        rollno[n] = rnum;
        String sname = sc.next();
        name[n]= sname;
        String cname = sc.next();
        city[n]= cname;
        String mnum = sc.next();
        mob[n]= mnum;
    }
    
    public void deleteData(int n){
        for(int c=n;c<4;c++){
            rollno[c] = rollno[c+1];
            name[c]= name[c+1];
            city[c]= city[c+1];
            mob[c]= mob[c+1];
        }
    }
}

public class JavaApplication5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CRUD obj = new CRUD(); 
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter Choice");
            int n = sc.nextInt();
            switch(n){
                case 1:
                    obj.inputData();
                    break;
                case 2:
                    System.out.println("Do you want to see entire table?");
                    String sr = sc.next();
                    obj.showData(sr);
                    break;
                case 3:
                    System.out.println("Enter Serial number");
                    int srn = sc.nextInt();
                    obj.updateData(srn-1);
                    break;
                case 4:
                    System.out.println("Enter Serial number");
                    srn = sc.nextInt();
                    obj.deleteData(srn-1);
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }    
}
