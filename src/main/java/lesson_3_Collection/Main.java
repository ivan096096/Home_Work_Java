package lesson_3_Collection;
/*
    1. Дан массив записей: наименование товара, цена, сорт.
     Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
    2. Сведения о товаре состоят из наименования,
     страны-производителя, веса, цены, сорта.
      Получить наименования товаров заданного сорта с наименьшей ценой.
    3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
     Найти названия книг, в которых простое количество страниц,
     фамилия автора содержит «А» и год издания не позднее 2010 г.
    4. при входном массиве, вернуть массив массивов со всеми перестановками его элементов. (со звездочкой)
    Пример входных данных:
    [1,2,3]
    Пример выходных данных:
    [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 */

import lesson_3_Collection.Tovars.Books;
import lesson_3_Collection.Tovars.New_Tovar;
import lesson_3_Collection.Tovars.Tovar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Task_1();
//        Task_2();
        Task_3();
    }

    private static void Task_3() {  // Не могу понять как прикрутить проверку с простыми числами
        List resalt = new ArrayList<>();
        Books books1 = new Books("Мистер Мерседес", "Кинг", 2014, 1900, 138);
        Books books2 = new Books("Операция Вода", "Акунин", 1983, 1250, 130);
        Books books3 = new Books("Доживём до понидельника", "Стругацкие", 1986, 1900, 128);
        Books books4 = new Books("Мерседес", " Бармолеев", 2012, 1900, 121);
        List<Books> myList = new ArrayList<>();
        myList.add(books1);
        myList.add(books2);
        myList.add(books3);
        myList.add(books4);
        for (int i = 0; i < myList.size(); i++) {
            Books books = myList.get(i);
            String str = "A";
            int year = 2010;
            if ((books.getPublications()<= year) || (books.getSurname().contains(str))){
                System.out.println("Название книги : " + books.getName_book());
            }

        }

    }


    private static void Task_2() {
        New_Tovar new_tovar1 = new New_Tovar("Рис", "Австрия", 100, 210, 1);
        New_Tovar new_tovar2 = new New_Tovar("Картофель", "Россия", 58, 180, 2);
        New_Tovar new_tovar3 = new New_Tovar("Свекла", "Италия", 94, 300, 2);
        New_Tovar new_tovar4 = new New_Tovar("Марковь", "Китай", 27, 300, 2);

        ArrayList<New_Tovar> myList = new ArrayList<>();
        myList.add(new_tovar1);
        myList.add(new_tovar2);
        myList.add(new_tovar3);
        myList.add(new_tovar4);
        for (int i = 0; i < myList.size(); i++) {
            New_Tovar myElem = myList.get(i);
            New_Tovar my_Tovar = myList.stream()
                    .min(Comparator.comparingInt(New_Tovar::getPrice))
                    .get();
            if (myElem.equals(my_Tovar)) {
                System.out.println("Наименование товара : " + my_Tovar.getName() + "\n" + "Сорт товара: " + my_Tovar.getSort_tovar());
            }

        }
    }

    private static void Task_1() {
        Tovar tovar_1 = new Tovar("Высшая", "Рис", 28, 1);
        Tovar tovar_2 = new Tovar("Средняя", "Гречка", 25, 1);
        Tovar tovar_3 = new Tovar("Высшая", "Овсяные хлопья", 27, 2);
        Tovar tovar_4 = new Tovar("Низшая", "Перловка", 21, 2);


        ArrayList<Tovar> mylist = new ArrayList<>();
        mylist.add(tovar_1);
        mylist.add(tovar_2);
        mylist.add(tovar_3);
        mylist.add(tovar_4);
        for (int i = 0; i < mylist.size(); i++) {
            Tovar tovar = mylist.get(i);
            Tovar tov = mylist.stream()
                    .max(Comparator.comparingInt(Tovar::getPrice))
                    .get();
            if (tovar.getCategory().equals("Высшая") && tovar.equals(tov)) {
                System.out.println("Цена = " + tovar.getPrice() + " Рублей " + "\n" + "Наименование товара = " + tovar.getName());
            }
        }
    }
}

