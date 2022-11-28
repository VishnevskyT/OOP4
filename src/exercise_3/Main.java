package exercise_3;

public class Main {
    public static void main(String[] args) {
    Player player = new Player();
        System.out.println("Програма відтворення та запису звуку\n");
    player.play();
    player.record();
    player.pause();
    player.stop();
    }
}
