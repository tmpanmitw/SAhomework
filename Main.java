class Transportation {
    int number;
    int fuelVolume;
    int speed;
    int maxPassenger;
    boolean drivingForm;
    int base_rate;

    void start(){
        System.out.println("출발합니다.");
    }
    void changeSpeed(){

    }
    void changeForm(){

    }
    void onboarding(){

    }

    Transportation(int fuelVolume, int speed) {
        this.fuelVolume = 100;
        this.speed = 0;
    }
}

class bus extends Transportation{
    int nowPassenger;

    bus(int maxPassenger, int drivingForm, int base_rate) {
        super(100,0 );
        this.nowPassenger = 30;
        this.drivingForm = true;
    }
}


class taxi extends Transportation{
    String destination;
    int distanceToDestination;
    int base_distance;
    int rate_per_Distance;

    void add_rate(){

    }
    void payment(){

    }
    taxi()

}







public class Main {
    public static void main(String[] args) {

    }
}
