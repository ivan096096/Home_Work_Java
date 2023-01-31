package OOP.HomeWork.lesson_2;

public abstract class Animal implements Speakable {
    private String nickname;
    private Integer box;
    private String color;

    public String getColor() {
        return color;
    }

    public Animal(String nickname, Integer box, String color){
        this.nickname = nickname;
        this.box = box;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Имя - %s из коробки № %s",nickname,box);
    }

    public String getNickname() {
        return nickname;
    }

    public Integer getBox() {
        return box;
    }

    public abstract String say();
}
