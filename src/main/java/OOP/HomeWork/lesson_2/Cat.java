package OOP.HomeWork.lesson_2;

public class Cat extends Animal implements Runable {


    public Cat(String nickname, Integer box, String color) {
        super(nickname, box, color);
    }

    @Override
    public String say() {
        return "Говорит Мяу";
    }


    @Override
    public int speedOfRan() {
        return 15;
    }
}
