package OOP.HomeWork.lesson_1;

public class Meat extends Product {
    private String type;

    @Override
    public String toString() {
        return String.format("\n Имя : %s \n Тип : %s \n Цена : %s Рублей", getName(), getType(), getPrice());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Meat(int price, String name, String type) {
        super(price, name);
        this.type = type;
    }
}
