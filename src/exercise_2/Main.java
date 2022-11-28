package exercise_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Програма для роботи з документами DOC, TXT, XML.\nВведіть повну назву файлу: _");
        String fileFormat = scanner.next();
        if (fileFormat.length() > 2) {
        String substring = fileFormat.substring(fileFormat.length() - 3);
        if (substring.equalsIgnoreCase("DOC")) {
            DOCHandler docHandler = new DOCHandler();
            docHandler.open();
            docHandler.create();
            docHandler.change();
            docHandler.save();
        } else if (substring.equalsIgnoreCase("TXT")) {
            TXTHandler txtHandler = new TXTHandler();
            txtHandler.open();
            txtHandler.create();
            txtHandler.change();
            txtHandler.save();
        } else if (substring.equalsIgnoreCase("XML")) {
            XMLHandler xmlHandler = new XMLHandler();
            xmlHandler.create();
            xmlHandler.open();
            xmlHandler.change();
            xmlHandler.save();
        } else {
            System.out.println("Нажаль, з такими файлами програма не працює :(");
        }
    } else {
            System.out.println("Нажаль, з такими файлами програма не працює :(");
        }

    }
}
