package OOP.HomeWork.lesson_2;

public class Duck extends Animal implements Runable,Speakable,Swim,Fly{

    public Duck(String nickname, Integer box, String color) {
        super(nickname, box, color);
    }

    @Override
    public String toString() {
        return "Утка";
    }

    @Override
    public String say() {
        return String.format("Кря-кря");
    }

    @Override
    public int speedOfRan() {
        return 15;
    }

    @Override
    public int Dive() {
        return 5;
    }

    @Override
    public int speedFly() {
        return 85;
    }
}
