
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