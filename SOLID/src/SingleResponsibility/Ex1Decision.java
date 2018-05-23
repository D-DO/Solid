package SingleResponsibility;

public class Ex1Decision {

    public static void main(String[] args) {
        EmployeeFacade employee =  new EmployeeFacade();
        System.out.println(employee.getSalary());
        employee.cleanFloor();
        employee.cook();
        employee.deliverFood();
    }
}

interface IEmployee {
    int getSalary();
}

class Cook implements IEmployee {
    void cook() {
        System.out.println("cook");
    }

    @Override
    public int getSalary() {
        return 10;
    }
}

class Cleaner implements IEmployee {
    void cleanFloor() {
        System.out.println("clean floor");
    }

    @Override
    public int getSalary() {
        return 7;
    }
}

class Waiter implements IEmployee {
    void deliverFood() {
        System.out.println("deliver food");
    }

    @Override
    public int getSalary() {
        return 8;
    }
}

class EmployeeFacade implements IEmployee{
    Cleaner cleaner = new Cleaner();
    Cook cook = new Cook();
    Waiter waiter = new Waiter();

    void  cleanFloor(){ cleaner.cleanFloor(); }

    void cook() { cook.cook();}

    void deliverFood() { waiter.deliverFood();}

    @Override
    public int getSalary() {
        return 9;
    }
}