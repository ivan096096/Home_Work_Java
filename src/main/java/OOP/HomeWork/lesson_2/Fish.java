package OOP.HomeWork.lesson_2;

public class Fish extends Animal implements Swim{


    public Fish(String nickname, Integer box,String color) {
        super(nickname, box,color);
    }

    @Override
    public int Dive() {
        return 100;
    }

    @Override
    public String toString() {
        return "Рыбка";
    }

    @Override
    public String say() {
        return String.format("Рыбы не говорят");
    }
}
