package OOP.HomeWork.lesson_1;

public class Milk extends Product {
    private Double Volume;
    private Double Fat_Content;
    private String Village;

    public Milk(int price, String name, Double volume, Double fat_Content, String village) {
        super(price, name);
        Volume = volume;
        Fat_Content = fat_Content;
        Village = village;
    }

    @Override
    public String toString() {
        return String.format(" Цена : %s \n " +
                        "Имя продукта : %s \n " +
                        "ОБьём тары : %s " +
                        "\n Содержание жира : %s процентов \n " +
                        "Место производство : %s "
                , getPrice(), getName(), getVolume(), getFat_Content(), getVillage());
    }

    public Double getVolume() {
        return Volume;
    }

    public Double getFat_Content() {
        return Fat_Content;
    }

    public String getVillage() {
        return Village;
    }
}
