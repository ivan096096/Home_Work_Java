package OOP.HomeWork.lesson_2;

public class Сrocodile extends Animal implements Speakable,Swim{

    private int Length;

    public Сrocodile(String nickname, Integer box, String color) {
        super(nickname, box, color);
    }

    @Override
    public String say() {
        return "Крокадил не говорит";
    }

    @Override
    public int Dive() {
        return 20;
    }
}
