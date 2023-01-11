package lesson_5_Map;
/*

3) Найти пересечения слов в массивах и указать их общее количество.
Пример:
mas1= [“qwe”,”asd”,”qwe”,”x”]
mas2=[“qwe”,”v”]
Результат:
qwe=3
 */

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Task_1();
        Task_2();
        Task_3();
    }

    private static void Task_3() {
        String[] mass_1 = {"qwe", "asd", "qwe", "x"};
        String[] mass_2 = {"qwe", "v"};

        Map<String, Integer> map_1 = ArrayWord(mass_1);
        Map<String, Integer> map_2 = ArrayWord(mass_2);

        Map<String, Integer> resalt = new HashMap<>();
        for (var s : map_1.entrySet()) {
            String key = s.getKey();
            int Map1 = s.getValue();
            int Map2 = map_2.getOrDefault(key, 0);
            if (Map2 > 0) {
                resalt.put(key, Map1 + Map2);
            }
        }

        for (Map.Entry<String, Integer> entry : resalt.entrySet()) {
            System.out.println("Слово - " + entry.getKey() + " содержит  = " + entry.getValue() + " пересечения ");
        }
    }

    public static Map<String, Integer> ArrayWord(String[] array) {
        Map<String, Integer> map = new HashMap<>();

        for (String current : array) {
            int count = map.getOrDefault(current.toLowerCase(), 0);
            map.put(current.toLowerCase(), ++count);
        }

        return map;
    }

    private static void Task_2() {
        //2) Подсчитать количество искомого слова, через map (наполнением значение,
        // где искомое слово будет являться ключом)
        Map<String, Integer> map = new HashMap<>();
        String seach_world = "россия";
        String str = "Россия идет вперед всей планеты. Планета — это не Россия";
        String[] item = str.toLowerCase().split(" ");
        for (String s : item) {
            if (!seach_world.equals(s)) {
                continue;
            }
            Integer count = map.getOrDefault(seach_world, 0);
            map.put(s, ++count);
        }
        System.out.println("Слово : " + seach_world + "  Найдено  = "
                + map.getOrDefault(seach_world, 0) + " Раза");
    }

    private static void Task_1() {
//1) Подсчитать количество вхождения каждого слова
//Пример:
//Россия идет вперед всей планеты. Планета — это не Россия.
//toLoverCase().
        Map<String, Integer> map = new HashMap<>();
        String str = "Россия идет вперед всей планеты. Планета — это не Россия";
        String[] item = str.toLowerCase().split(" ");
        for (String s : item) {
            map.putIfAbsent(s, 0);
            map.put(s, map.get(s) + 1);
        }
        for (var entry : map.entrySet()) {
            System.out.println("Слово = " + "< " + entry.getKey() + " >" + " Попадается " + entry.getValue());
        }
    }
}

