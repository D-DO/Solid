package OpenClosed;

public class Ex1 {
    public static void main(String[] args) {

        Toyota toyota = new Toyota();
        workInTaxi(toyota);

        Toyota celica = new Celica();
        workInTaxi(celica);
    }
    static void workInTaxi(Toyota car){
        if ( car instanceof Celica ){
            car.getPassanger();
        } else{
            car.getPassangers();
        }

    }
}

class Toyota {
    void getPassangers(){
        System.out.println("get passangers");
    }
    void getPassanger(){
        System.out.println("get passanger");
    }
}

class Celica extends Toyota {

}
