public class WeatherCheck {
    public static void main(String[] args) {

        int temperature = 16;
        boolean currentlyRaining = false;

        if (temperature <= 15 && currentlyRaining) {
            System.out.println("You should wear a raincoat!");
        } else if (temperature > 15 && currentlyRaining) {
            System.out.println("You might need an umbrella!");
        } else if (temperature > 15 && !currentlyRaining) {
            System.out.println("You should wear sunscreen!");
        } else if (temperature <= 15 && !currentlyRaining) {
            System.out.println("You should wear warm clothes!");
        }
    }
}
