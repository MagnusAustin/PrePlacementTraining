class Employee{
    int esal;
    String res[] = new String[5];
    public Employee(int sal){
        esal = sal;
    }
    
    public void work(){
        System.out.println("Working on a project");
    }
    
    public void addEmployee(){
        Scanner sc = new Scanner(System.in);
          System.out.println("Entering Employee data");  
          for(int i =0; i<res.length;i++){
              res[i]=sc.next();
          }
    }
}

class HRManager extends Employee{
    public HRManager(){
        super(2000);
    }
    
    public void work(){
        super.work();
        System.out.println("Working on HR project");
    }
    
    public void getSalary(){
        System.out.println(esal);
    }
    
    public void showEmployee(){
        System.out.println("Showing Employee data");
        for (String re : res) {
            System.out.println(re);
        }
    }        
}
public class JavaApplication5 {
    /**
     * @param args the command line arguments
     */     
    public static void main(String[] args) {
        HRManager obj = new HRManager();
        obj.work();
        obj.getSalary();
        obj.addEmployee();
        obj.showEmployee();
    }      
}
