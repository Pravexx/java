class employee{
    private String name;
    private double salary;

    public employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void EmployeeBonus(){
        System.out.println("Employee name : " + name);
        System.out.println("Employee salary : " + salary);
    }
}
class  Manager extends employee{
    private double bonus;
    public Manager(String name,double salary,double bonus){
        super(name, salary);
        this.bonus = bonus;
    }
    public void EmployeeBonus(){
        System.out.println("Employee name : " + getname());
        System.out.println("Employee salary :" + getSalary());
        System.out.println("bonus amount :" + bonus);
         System.out.println("Total salary amount :" + (getSalary()+bonus));
    }
}
class  Developer extends employee{
    private double bonus;
    public Developer(String name,double salary,double bonus){
        super(name, salary);
        this.bonus = bonus;
    }
    public void EmployeeBonus(){
        System.out.println("Employee name : " + getname());
        System.out.println("Employee salary :" + getSalary());
        System.out.println("bonus amount :" + bonus);
        System.out.println("Total salary amount :" + (getSalary()+bonus));
    }
}

public class EmployeePayroll {
    public static void main(String[] args) {
        Manager m1 = new Manager("ganesh", 20000, 5000);
        m1.EmployeeBonus();
        Developer D1 = new Developer("praveen", 25000, 10000);
        D1.EmployeeBonus();
    }
}
