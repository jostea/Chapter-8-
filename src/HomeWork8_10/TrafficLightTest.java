package HomeWork8_10;

public class TrafficLightTest {
    public static void main(String[] args) {

        for (TrafficLight light : TrafficLight.values()) {
            System.out.println("You light is: " + light);
            System.out.println("The duration of that trafic light value is: " + light.getDuration());
        }
    }

}
