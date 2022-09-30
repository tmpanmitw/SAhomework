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