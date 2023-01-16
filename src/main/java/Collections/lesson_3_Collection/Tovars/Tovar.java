package Collections.lesson_3_Collection.Tovars;


public class Tovar {
    private String category;
    private String name;
    private Integer price;
    private Integer Sort;

    @Override
    public String toString() {
        return "Tovar{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", Sort=" + Sort +
                '}';
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSort() {
        return Sort;
    }

    public void setSort(Integer sort) {
        Sort = sort;
    }

    public Tovar(String category, String name, Integer price, Integer sort) {
        this.category = category;
        this.name = name;
        this.price = price;
        Sort = sort;
    }




}
