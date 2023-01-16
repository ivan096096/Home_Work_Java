package OOP.HomeWork.lesson_1;

public class Bread  extends Product{

 private String color;
 private double ves;

    public Bread(int price, String name, String color, double ves) {
        super(price, name);
        this.color = color;
        this.ves = ves;
    }

    @Override
    public String toString() {
        return String.format(" Цена : %s \n Имя продукта : %s \n Цвет : %s \n Вес : %s грамм \n",getPrice(),getName(),getColor(),getVes());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVes() {
        return ves;
    }

    public void setVes(double ves) {
        this.ves = ves;
    }
}
