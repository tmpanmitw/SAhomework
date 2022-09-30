
public class Main {
    public static void main(String[] args) {
        ///////////////////////////////////////////버스 시나리오////////////////////////////////////////////////
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

        ///////////////////////////////////////////택시 시나리오////////////////////////////////////////////////

        taxi taxi1 = new taxi(1);
        taxi taxi2 = new taxi(2);

        System.out.println("주유량 = "+taxi1.fuelVolume);
        System.out.println("상태 = "+taxi1.taxi_form);

        taxi1.onboarding_taxi(2, "서울역",2);

        taxi1.fuelVolume -= 80;
        System.out.println("주유량 = "+taxi1.fuelVolume);
        taxi1.payment();

        System.out.println(taxi1.nowPassenger);
        taxi1.onboarding_taxi(5,"구로디지털단지역", 12);
        taxi1.onboarding_taxi(3,"구로디지털단지역", 12);

        taxi1.fuelVolume -= 20;
        taxi1.payment();

        System.out.println("주유량 = "+taxi1.fuelVolume);
        System.out.println("상태 = "+taxi1.taxi_form);
        System.out.println("누적 요금 = "+ taxi1.money_total);
        taxi1.changeForm_taxi();
        System.out.println("상태 = "+taxi1.taxi_form);


    }
}
