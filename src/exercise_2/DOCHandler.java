package exercise_2;

public class DOCHandler extends AbstractHandler {

    @Override
    void create() {
        System.out.println("Створити DOC файл");
    }
    @Override
    void open() {
        System.out.println("Відкрити DOC файл");
    }
    @Override
    void change() {
        System.out.println("Змінити DOC файл");
    }

    @Override
    void save() {
        System.out.println("Зберегти DOC файл");
    }
}
