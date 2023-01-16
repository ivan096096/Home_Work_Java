package OOP.HomeWork.lesson_1;

public class Product {
    private int price;
    private String name;

   public int getPrice(){
       return price;
   }
   public String getName(){
       return name;
   }
   public int setPrice(){
       return price;
   }
   public String setName(){
       return name;
   }
   public Product(int price,String name){
       this.price = price;
       this.name = name;
   }

    @Override
    public String toString() {
        return String.format("Имя Продукта -  %s, Стоимость %s",getName(),getPrice());
    }
}
