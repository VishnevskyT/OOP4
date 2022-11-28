package exercise_2;

public class XMLHandler extends AbstractHandler {

    @Override
    void create() {
        System.out.println("Створити XML файл");
    }

    @Override
    void open() {
        System.out.println("Відкрити XML файл");
    }

    @Override
    void change() {
        System.out.println("Змінити XML файл");
    }

    @Override
    void save() {
        System.out.println("Зберегти XML файл");
    }
}
