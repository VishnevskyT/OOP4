package exercise_3;

public class Player implements Playable, Recordable{
    @Override
    public void play() {
        System.out.println("\u25b6 Почати відтворення");
    }

    @Override
    public void record() {
        System.out.println("\u23fa Почати запис");
    }

    @Override
    public void pause() {
        System.out.println("\u23f8 Призупинити відтворення/запис");
    }

    @Override
    public void stop() {
        System.out.println("\u23f9 Завершити відтворення/запис");
    }


}
