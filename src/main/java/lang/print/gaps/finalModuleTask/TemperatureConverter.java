package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        int fahrenheit = ((20*temperatureCelsius * 9/5) + 32);
        System.out.println(fahrenheit);
    }
}
