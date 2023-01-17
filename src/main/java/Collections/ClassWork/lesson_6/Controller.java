package Collections.ClassWork.lesson_6;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import Collections.ClassWork.lesson_6.Laptops.Laptop;
import Collections.ClassWork.lesson_6.Laptops.Main_Laptop;

public class Controller {
    private static final List<Laptop> listLaptops = new Main_Laptop().getListLaptops();
    private static final Map<Integer, String> filters = new Main_Laptop().getListFilters();

    public static void showLaptops() {
        for (Laptop laptop : listLaptops) {
            boolean suitable = true;
            for (Entry<Integer, String> filter : filters.entrySet()) {
                
                if (!filter.getValue().equals("все")) {
                    switch (filter.getKey()) {
                        case 1: // размер оперативной памяти
                            if (laptop.getRam() < Integer.parseInt(filter.getValue().split("-")[0])
                                    || laptop.getRam() > Integer.parseInt(filter.getValue().split("-")[1])) {
                                suitable = false;
                            }
                            break;
                        case 2: // размер жесткого диска
                            if (laptop.getStorageCapacity() < Integer.parseInt(filter.getValue().split("-")[0])
                                    || laptop.getStorageCapacity() > Integer
                                            .parseInt(filter.getValue().split("-")[1])) {
                                suitable = false;
                            }
                            break;
                        case 3: // операционная система
                            if (!laptop.getOperatingSystem().equals(filter.getValue())) {
                                suitable = false;
                            }
                            break;
                        case 4: // цвет
                            if (!laptop.getColor().equals(filter.getValue())) {
                                suitable = false;
                            }
                            break;
                    }
                }
                if (!suitable) break;
            }
            if (suitable) {
                System.out.println("----------------");
                System.out.println(laptop);
            }
        }
    }

    static String getFilters(int key) {
        return filters.get(key);
    }

    static void changeFilter(int key, String value) {
        filters.put(key, value);
    }
}