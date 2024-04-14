public class TrafficLightTest {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        Color red = new Color("Red", 10);
        Color green = new Color("Green", 15);
        Color yellow = new Color("Yellow", 5);

        trafficLight.colors.add(red);
        trafficLight.colors.add(green);
        trafficLight.colors.add(yellow);

        trafficLight.checkColor("Red"); // Ожидаемый результат: "This color is Red"
        trafficLight.checkColor("Green"); // Ожидаемый результат: "This color is Green"
        trafficLight.checkColor("Yellow"); // Ожидаемый результат: "This color isn't Red or Green"

        trafficLight.renameColor("Red", "Crimson");

        System.out.println(trafficLight.colors); // Ожидаемый результат: [TrafficLightColor{colorName='Crimson'}, TrafficLightColor{colorName='Green'}, TrafficLightColor{colorName='Yellow'}]
    }
}
