class BankAccount{
    int i =0;
    int money[] = new int[5];
    int flag[] = new int[5];
    String name[] = new String[5];
    String city[] = new String[5];
    String mob[] = new String[5];
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        String sname = sc.next();
        name[i]= sname;
        String cname = sc.next();
        city[i]= cname;
        String mnum = sc.next();
        mob[i]= mnum;
        System.out.println("Enter Amount");
        int deposit = sc.nextInt();
        money[i]=1000;
        money[i] = money[i] + deposit;
        flag[i]=0;
        i++;
    }
    public void display(){
        for(int a=0;a<i;a++){
            System.out.println(money[a]);
        }
    }
    public void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number");
        int acc = sc.nextInt();
        System.out.println("Enter Amount");
        int deposit = sc.nextInt();
        money[acc-1]=money[acc-1]+deposit;
    }  
    public void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number");
        int acc = sc.nextInt();
        System.out.println("Enter Amount");
        int withdraw = sc.nextInt();
        money[acc-1]=money[acc-1]-withdraw;
    }
}
class SavingsAccount extends BankAccount{
    public void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number");
        int acc = sc.nextInt();
        if(flag[acc-1]==1){       
        System.out.println("Enter Amount");
        int withdraw = sc.nextInt();
        int temp = money[acc-1]-withdraw;
        if(temp<1000)
            System.out.println("Invalid Withdraw");
        else
            money[acc-1]=money[acc-1]-withdraw;}
        else
            super.withdraw();
    }
}

public class JavaApplication5 {
    /**
     * @param args the command line arguments
     */            
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount obj = new SavingsAccount();
        while(true){
            System.out.println("Enter Your Choice");
            int n = sc.nextInt();
            switch (n){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    obj.inputData();
                    break;
                case 2:
                    obj.display();
                    break;
                case 3:
                    obj.deposit();
                    break;
                case 4:
                    obj.withdraw();
                    break;
            }
        }
    }      
}
