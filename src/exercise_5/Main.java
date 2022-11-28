package exercise_5;

import java.util.Scanner;

public class Main extends ConverterTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Конвертор температури\nВведіть значення температури у градусах Цельсіях: _");
        double celsius = scanner.nextDouble();
        ConverterTemperature converterTemperature = new ConverterTemperature();
        System.out.println("Результат:");
        converterTemperature.convert(celsius);

    }
}
