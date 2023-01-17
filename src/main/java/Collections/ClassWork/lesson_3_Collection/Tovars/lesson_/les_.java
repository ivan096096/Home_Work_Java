package Collections.ClassWork.lesson_3_Collection.Tovars.lesson_;

import java.util.*;

public class les_ {
    public static void main(String[] args) {
        reversed();
        Percent();
        Arabic();


    }

    private static void Arabic() {
        String s = "MCMXCIV";
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int sum = map.get(s.charAt(s.length()-1));
        for (int i = 0; i < s.length()-1; i++) {
            if(map.get(s.charAt(i))>=map.get(s.charAt(i+1))){
                sum+=map.get(s.charAt(i));
            }else{
                sum-=map.get(s.charAt(i));
            }
        }
        System.out.println("arabic = "+sum);
    }




    private static void Percent() {
        //1)Дан массив чисел, посчитать процент уникальных чисел.
        //*процент уникальных чисел =
        // количество уникальных чисел * 100 / общее количество чисел в массиве.
        List<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,1,2));
        Set<Integer> set = new HashSet<>(array);
        double percent = set.size()*100/ array.size();
        System.out.println("percent ="+percent);
    }


    private static void reversed() {
        LinkedList<Integer> li = new LinkedList<>(Arrays.asList(1,2,3,4));
        while (!li.isEmpty()){
            System.out.println(li.pollLast());
        }
    }

}
