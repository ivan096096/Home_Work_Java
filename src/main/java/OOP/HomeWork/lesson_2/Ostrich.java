package OOP.HomeWork.lesson_2;

public class Ostrich extends Animal implements Speakable,Runable{
    private  int Height;

    public Ostrich(String nickname, Integer box, String color) {
        super(nickname, box, color);
    }

    @Override
    public String say() {
        return "Курлы-курлы";
    }

    @Override
    public int speedOfRan() {
        return 150;
    }
}
