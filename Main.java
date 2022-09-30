class Transportation {
    int number;
    int maxPassenger;
    int fuelVolume;
    int speed;
    int base_rate;

    void start(){
        System.out.println("출발합니다.");
    }
    void changeSpeed(){

    }
    void changeForm(){

    }

    Transportation(int fuelVolume, int speed) {
        this.fuelVolume = 100;
        this.speed = 0;

    }
}
////////////////////////////////////////////////BUS 모델링///////////////////////////////////////////////////////
class bus extends Transportation{
    int nowPassenger;
    int bus_number;
    String bus_form;       // 운행, 차고지행

    void start_driving(){

    }

    void changeForm_bus(){
        if(fuelVolume<7){
            bus_form = "차고지행";
        }else if (fuelVolume < 10){
            System.out.println("주유가 필요하다");
            }
        }
    void onboarding_bus(int passenger){
        if (bus_form == "운행"){
            if (((nowPassenger+passenger) <= maxPassenger)){
                nowPassenger += passenger;
                System.out.println("탑승 승객 수 = "+passenger);
                System.out.println("잔여 승객 수 = "+(maxPassenger-nowPassenger));
                System.out.println("요금 확인 = "+(passenger*base_rate));
            }else{
                System.out.println("알럿 '최대 승객 수 초과'");
            }
        }


    }
    void changespeed_bus(int changespeed){
        if(fuelVolume >= 10){
            speed += changespeed;
        }else{
            System.out.println("주유량을 확인해 주세요");
        }
    }
    bus(int bus_number) {
        super(100,0 );
        this.maxPassenger = 30;
        this.bus_form = "운행";
        this.base_rate = 1000;
        System.out.println(bus_number+"번 버스 생성");
    }

}
/////////////////////////////////////////////TAXI 모델링/////////////////////////////////////////////////////////

class taxi extends Transportation{
    int bus_number;
    String destination;
    int distanceToDestination;
    int base_distance;
    int rate_per_Distance;
    String taxi_form;           //운행중, 일반, 운행불가
    int rate_total;

    void start_driving(){

    }
    void changeForm_taxi(){
        if(fuelVolume>=10){
            taxi_form = "운행";
        }
    }
    void onboarding_taxi(int passenger){
        if ( taxi_form == "일반"){
            taxi_form = "운행중";
        }else{
            System.out.println("탑승불가");
        }
    }
    void changespeed_taxi(int changespeed){
            speed += changespeed;
    }

    void add_rate(int distanceToDestination){
        if(distanceToDestination>base_distance){
            rate_total = base_rate + (distanceToDestination-base_distance)/rate_per_Distance;
        }else{
            rate_total = base_rate;
        }
    }
    void payment(){
        System.out.println("최종요금 : "+rate_total );
    }
    taxi(){
        super(100, 0);
        this.maxPassenger = 4;
        this.base_rate = 3000;
        this.rate_per_Distance = 1000;
        this.base_distance = 1;
        this.fuelVolume = 100;
        this.taxi_form = "일반";
        this.speed = 0;

    }
}

public class Main {
    public static void main(String[] args) {
        bus bus1 = new bus(1);
        bus bus2 = new bus(2);

        bus1.onboarding_bus(2);

        bus1.fuelVolume -= 50;
        System.out.println("주유량 = "+bus1.fuelVolume);

        bus1.bus_form = "차고지행";
        bus1.fuelVolume += 10;

        System.out.println("상태 = "+bus1.bus_form);
        System.out.println("주유량 = "+bus1.fuelVolume);

        bus1.bus_form = "운행";
        bus1.onboarding_bus(45);

        bus1.onboarding_bus(5);

        bus1.fuelVolume -=55;
        System.out.println("주유량 = "+bus1.fuelVolume);
        bus1.changeForm_bus();
        System.out.println("상태 = "+bus1.bus_form);




    }
}
