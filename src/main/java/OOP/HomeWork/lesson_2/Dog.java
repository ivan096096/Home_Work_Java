package OOP.HomeWork.lesson_2;

public class Dog extends Animal implements Runable {
 private String color;
    public Dog(String nickname, Integer box,String color) {
        super(nickname, box,color);
    }

    @Override
    public String say() {
        return "Говорит Гав-Гав";
    }

    @Override
    public int speedOfRan() {
        return 60;
    }
}
