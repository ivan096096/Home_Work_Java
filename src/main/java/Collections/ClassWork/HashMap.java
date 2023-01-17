package Collections.ClassWork;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {

////    Посчитать количество вхождений каждой буквы в текст.
//Map<Character, Integer> map = new HashMap<>();
//String str = "qqqq we ee assss";
//        for (int i = 0; i < str.length(); i++) {
//        map.putIfAbsent(str.charAt(i),0);
//        map.put(str.charAt(i),map.get(str.charAt(i))+1);
////            if (map.containsKey(str.charAt(i))) {
////                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
////            } else {
////                map.put(str.charAt(i),1);
////            }
//    }
////        for (Map.Entry<Character, Integer> entry :map.entrySet()) {
//        for (var entry :map.entrySet()) {
//        System.out.println("буква - "+entry.getKey()+"  , встретилась : "+entry.getValue());
//    }


//    //2)	Определить, есть ли в массиве дубликаты, если найден хоть один,
//    // вывести на экран (true),
//    //В противном случае (false).
//    int[] arr = new int[]{1, 2, 3, 4, 5, 3};
//    Set<Integer> set = new HashSet<>();
//    boolean f = true;
//        for (int i = 0; i < arr.length; i++) {
//        set.add(arr[i]);
//    }
//        if (arr.length != set.size()) {
//        System.out.println("false");
//    } else {
//        System.out.println("true");
//    }
//}
//    //2)	Определить, есть ли в массиве дубликаты, если найден хоть один,
//    // вывести на экран (true),
//    //В противном случае (false).
//    int[] arr = new int[]{1, 2, 3, 4, 5, 3};
//    Set<Integer> set = new HashSet<>();
//    boolean f = true;
//        for (int i = 0; i < arr.length; i++) {
//        if (set.contains(arr[i])) {
//        f = false;
//        break;
//        } else {
//        set.add(arr[i]);
//        }
//        }
//        System.out.println(f);
//        }
//        //2)	Определить, есть ли в массиве дубликаты, если найден хоть один,
//        // вывести на экран (true),
//        //В противном случае (false).
//        List<Integer> arr2 = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//        arr2.add(i);
////            arr2.add(i);
//        }
//        Set<Integer> set = new HashSet<>(arr2);
//        if (arr2.size() != set.size()) {
//        System.out.println("false");
//        } else {
//        System.out.println("true");
//        }
//        }
////3)	Найти пересечение двух массивов: Пример:
//        int[] nums1 = new int[]{1, 2, 47,87, 4, 7,3};
//        int[] nums2 = new int[]{3, 5, 6, 3, 47};
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums1.length; i++) {
//        set.add(nums1[i]);
//        }
////        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i < nums2.length; i++) {
//        if (set.contains(nums2[i])) {
//        System.out.println("значение: " + nums2[i]);
//        set.remove(nums2[i]);
//        }
//        }
//        }
//
////3)	различия hash set linked hash
//        Map<Integer,Integer> map1 = new HashMap<>();
//        map1.put(3,3);
//        map1.put(1,1);
//        map1.put(2,2);
//        System.out.println("map1 = "+map1);
//        Map<Integer,Integer> map2 = new LinkedHashMap<>();
//        map2.put(3,3);
//        map2.put(1,1);
//        map2.put(2,2);
//        System.out.println("map2 = "+map2);
//
//
//
//
    }
}