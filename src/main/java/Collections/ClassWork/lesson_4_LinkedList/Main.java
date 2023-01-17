package Collections.ClassWork.lesson_4_LinkedList;
/*
Добрый день, думаю этих 2-х хватит:
1) Вывести список на экран в перевернутом виде (без массивов)
Пример:
1 -> 2->3->4
Вывод:
4->3->2->1
2) Определить является ли список знакочередующимся? (без массивов)
 */

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

//        Resalt(list);
//        Resalt2(list);


   }




    public static void Resalt(LinkedList<Integer> list) {
        Iterator<Integer> iterator = list.descendingIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ",");

        }
        System.out.println();
    }

    public static void Resalt2(LinkedList<Integer> list) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer integer : list) {
            linkedList.addFirst(integer);
        }
        System.out.println("Список до изменения - " + list);
        System.out.println("Список после изменения - " + linkedList);
    }
}
