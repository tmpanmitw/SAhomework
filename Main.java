
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
