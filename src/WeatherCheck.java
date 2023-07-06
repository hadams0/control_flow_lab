public class WeatherCheck {
    public static void main(String[] args) {

        int temperature = 16;
        boolean currentlyRaining = false;

        if (temperature <= 15 && currentlyRaining) {
            System.out.println("Today it is cold and you should wear a raincoat!");
        } else if (temperature > 15 && currentlyRaining) {
            System.out.println("Today it is hot but you might need an umbrella!");
        } else if (temperature > 15 && !currentlyRaining) {
            System.out.println("Today is hot, you should wear sunscreen!");
        } else if (temperature <= 15 && !currentlyRaining) {
            System.out.println("Today it's colder so you should wear warm clothes!");
        }
    }
}
