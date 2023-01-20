package OOP.HomeWork.lesson_2;

public class Horse extends Animal implements Runable {
    public Horse(String nickname, Integer box,String color) {
        super(nickname, box,color);
    }

    @Override
    public String say() {
        return "Говорит Иго-го ";
    }

    @Override
    public int speedOfRan() {
        return 80;
    }
}
