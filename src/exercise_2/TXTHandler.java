package exercise_2;

public class TXTHandler extends AbstractHandler{

    @Override
    void create() {
        System.out.println("Створити TXT файл");
    }

    @Override
    void open() {
        System.out.println("Відкрити TXT файл");
    }

    @Override
    void change() {
        System.out.println("Змінити TXT файл");
    }

    @Override
    void save() {
        System.out.println("Зберегти TXT файл");
    }
}
