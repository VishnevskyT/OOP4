package exercise_5;

public class ConverterTemperature {
    public void convert (double celsius) {
        double fahrenheit = (celsius * 1.8) +32;
        double kalvin = celsius + 273.15;
        System.out.println(fahrenheit + " \u00b0F;\n" + kalvin + " K.");
    }


}
