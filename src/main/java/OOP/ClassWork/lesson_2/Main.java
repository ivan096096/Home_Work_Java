package OOP.ClassWork.lesson_2;
/**
 * Создать список по аналогии LinkedList (список связанных элементов),
 * реализовать в нем iterable интерфейс.
 * Список должен содержать элементы со ссылкой на следующий элемент
 * (если показалось мало, то реализовать ссылку и на предыдущий элемент)
 */

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
       Personal personal = new Personal();
       personal.addUser(new User("Ivan","Lebedev",30));
       personal.addUser(new User("Igor","Ivanov",45));
        for (User user : personal) {
            System.out.println(user);
        }
        System.out.println("==============");
        Collections.sort(personal.getUsers());

        for (User user : personal) {
            System.out.println(user);
        }

        User boss = new User("Генадий","Гвоздин",45);
        boss.addSubordinates(personal);
    }
}
