package SingleResponsibility;

public class Ex1 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee.getSalary());
        employee.cleanFloor();
        employee.cook();
        employee.deliverFood();

    }
}

class Employee{
    int getSalary(){ return 10;}
    void cook(){
        System.out.println("cook");
    }
    void cleanFloor(){
        System.out.println("clean floor");
    }
    void deliverFood(){
        System.out.println("deliver food");
    }
}