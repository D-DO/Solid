package OpenClosed;

public class Ex1Decision {

    public static void main(String[] args) {

        TaxiCar toyota = new Toyota1();
       workInTaxi(toyota);

        TaxiCar celica = new Celica1();
        workInTaxi(celica);
    }
    static void workInTaxi(TaxiCar car){
        car.workInTaxi();
  }
}
interface TaxiCar{
    void workInTaxi();
}
class Toyota1 implements TaxiCar {
    void getPassangers(){
        System.out.println("get passangers");
    }
    void getPassanger(){
        System.out.println("get passanger");
    }

    @Override
    public void workInTaxi() {
        getPassangers();
    }
}

class Celica1 extends Toyota implements TaxiCar{

    @Override
    public void workInTaxi() {
      getPassanger();
    }
}
