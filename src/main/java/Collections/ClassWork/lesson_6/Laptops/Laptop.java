package Collections.ClassWork.lesson_6.Laptops;

public class Laptop {
    private String name_laptop;
    private String operatingSystem; // операционная система
    private int ram; // оперативная память
    private String processor; // производитель процессора
    private int storageCapacity; // объем жесткого диска
    private String color;

    public Laptop() {
    }

    public Laptop(String name, String operatingSystem, int ram, String processor, int storageCapacity, String color) {
        this.name_laptop = name;
        this.operatingSystem = operatingSystem;
        this.ram = ram;
        this.processor = processor;
        this.storageCapacity = storageCapacity;
        this.color = color;
    }

    public String getName() {
        return name_laptop;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public int getRam() {
        return ram;
    }

    public String getProcessor() {
        return processor;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        if (storageCapacity < 1000) {
            return "Ноутбук " + name_laptop + "\nОперационная система: " + operatingSystem + "\nПроизводитель процессора: "
                    + processor + "\nОбъем оперативной памяти: " + ram + " ГБ\nОбъем накопителя: " + storageCapacity
                    + " ГБ\nЦвет: " + color;
        } else {
            return "Ноутбук " + name_laptop + "\nОперационная система: " + operatingSystem + "\nПроизводитель процессора: "
                    + processor + "\nОбъем оперативной памяти: " + ram + " ГБ\nОбъем накопителя: "
                    + storageCapacity / 1000 + " ТБ\nЦвет: " + color;
        }
    }
}
