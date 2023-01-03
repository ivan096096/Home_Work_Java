package lesson_3_Collection.Tovars;
/*
 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
     Найти названия книг, в которых простое количество страниц,
     фамилия автора содержит «А» и год издания не позднее 2010 г.
 */
public class Books {
    private String name_book;
    private String surname;
    private Integer publications;
    private Integer price;
    private Integer amount;

    @Override
    public String toString() {
        return "Books{" +
                "name_book='" + name_book + '\'' +
                ", surname='" + surname + '\'' +
                ", publications='" + publications + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }

    public String getName_book() {
        return name_book;
    }

    public void setName_book(String name_book) {
        this.name_book = name_book;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getPublications() {
        return publications;
    }

    public void setPublications(Integer publications) {
        this.publications = publications;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Books(String name_book, String surname, Integer publications, Integer price, Integer amount) {
        this.name_book = name_book;
        this.surname = surname;
        this.publications = publications;
        this.price = price;
        this.amount = amount;
    }
}
