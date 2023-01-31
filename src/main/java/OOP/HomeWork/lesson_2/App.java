package OOP.HomeWork.lesson_2;

/**
 * На основе работы на уроке сделать:
 * Создать интерфейс, скорость плаванья
 * Добавить новое животное, способное плавать
 * Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 * . * Для тех, кому это показалось просто:
 * написать программу для проведения исследований с генеалогическим древом,
 * каждый ребенок имеет двух родителей. Программа должна выводить всех предков выбранного ребенка,
 * всех потомков выбранного родителя.
 */

public class App {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimals(new Cat("Vasya", 1, "белый"))
                .addAnimals(new Horse("Скакун", 2, "Рыжий"))
                .addAnimals(new Dog("Бобик", 3, "Чёрный"))
                .addAnimals((new Fish("Долли", 4, "Золотой")))
                .addAnimals(new Duck("Дональд", 5, "Белый"))
                .addAnimals(new Ostrich("Бегун",6,"Красно-Жёлтый"))
                .addAnimals(new Fish("Малыш",7,"Красный"))
                .addAnimals(new Сrocodile("Гена",8,"Зелёный"));
        for (Animal animal : zoo.getAnimals()) {
            System.out.println(animal);
            System.out.println(animal.say());

        }
        System.out.println("---------------");
        for (Speakable speakable : zoo.getSpeekable()) {
            System.out.println(speakable.say());
        }
        System.out.println("---------------");

        int maxRan = zoo.RanOfChampion();
        System.out.printf("Максимальная скорость бега = %s", maxRan);
        System.out.println();
        int maxFly = zoo.FlyOfChampion();
        System.out.printf("Максимальная скорость полёта = %s ", maxFly);

        System.out.println();

        for (Runable runable : zoo.getRanner()) {
            System.out.printf("Cкорость : %s %n", runable.speedOfRan());
        }
        System.out.println("---------------");

        for (Swim swim : zoo.getSwim()) {
            System.out.printf("Я умею нырять на глубину = %s Метров%n", swim.Dive());
            System.out.println();
        }
        System.out.println("---------------");

        for (Fly fly : zoo.getFly()) {
            System.out.printf("Я летаю со скоростью %s км/ч", fly.speedFly());
        }
        System.out.println();

        int Fly_max = zoo.FlyOfChampion();
        System.out.printf("Скорость чемпиона = %s км/ч", Fly_max);
        System.out.println();
    }
}
