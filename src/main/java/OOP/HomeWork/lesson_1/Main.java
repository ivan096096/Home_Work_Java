package OOP.HomeWork.lesson_1;
/**
На основе кода с урока добавить еще один класс продукта,
 (Молоко, шоколад ,и т.п., можно добавить несколько классов),
  они должны наследоваться от класса Product,
  надо переопределить метод toString и попробовать включить эти классы в VendingMachine,
  вывести список товаров из VendingMachine
 */

public class Main {
    public static void main(String[] args) {
      VendingMachine vendingMachine = new VendingMachine();
      vendingMachine.getProductList().add(new Product(1200,"Яблоко"));
      vendingMachine.getProductList().add(new Product(999,"Груша"));
      vendingMachine.getProductList().add(new Product(1999,"Алыча"));
      vendingMachine.getProductList().add(new Bread(150,"Хлеб чёрный","Тёмный",250));
      vendingMachine.getProductList().add(new Milk(54,"Молоко",0.9,2.5,"Деревня Простоквашина"));
      vendingMachine.getProductList().add(new Meat(2486,"Мраморная Телятина","Мясо"));
        for (Product product : vendingMachine.getProductList()) {
            System.out.println(product);
        }
    }
}
