package Collections.ClassWork.lesson_3_Collection.Tovars;
/*
 2. Сведения о товаре состоят из наименования,
     страны-производителя, веса, цены, сорта.
      Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class New_Tovar {
    private String name; //Название
    private String Country;  // Строна_производитель
    private Integer weight;  // Вес
    private Integer price; // цена
    private Integer sort_tovar; //Сорт

    @Override
    public String toString() {
        return "New_Tovar{" +
                "name='" + name + '\'' +
                ", Country='" + Country + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", sort_tovar=" + sort_tovar +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSort_tovar() {
        return sort_tovar;
    }

    public void setSort_tovar(Integer sort_tovar) {
        this.sort_tovar = sort_tovar;
    }

    public New_Tovar(String name, String country, Integer weight, Integer price, Integer sort_tovar) {
        this.name = name;
        Country = country;
        this.weight = weight;
        this.price = price;
        this.sort_tovar = sort_tovar;
    }
}
