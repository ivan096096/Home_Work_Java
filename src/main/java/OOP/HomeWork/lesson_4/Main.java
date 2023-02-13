/**
 * На основе работы на уроке.
 * Создать класс щита, разработать разные типы щитов,
 * добавить в семейство классов Warriors обобщения в виде щитов.
 * Реструктуризировать код в конечных классах семейства Warriors.
 * Добавить метод определения минимального щита в команде.
 * * Продумать, как можно сделать воина без щита.
 */
package OOP.HomeWork.lesson_4;


import OOP.HomeWork.lesson_4.Wars.Archer;
import OOP.HomeWork.lesson_4.Wars.Shieldbearers;
import OOP.HomeWork.lesson_4.Wars.Swordman;
import OOP.HomeWork.lesson_4.Weapons.*;
import OOP.HomeWork.lesson_4.Weapons.Shields.AllShilds;


public class Main {
    public static void main(String[] args) {
        System.out.println("==== Мечники====");
        Team<Swordman> team1 = new Team<>();
        team1.addWarriorToTeam(new Swordman("Vasya", 250, new Sword(25)))
                .addWarriorToTeam(new Swordman("John", 200, new Sword(50)));

        for (Swordman swordman : team1) {
            System.out.println(swordman);
        }

        System.out.println("==== Лучники====");
        Team<Archer> team2 = new Team<>();
        team2.addWarriorToTeam(new Archer("Kolya", 150, new Bow(100, 50)))
                .addWarriorToTeam(new Archer("Paul", 200, new Bow(75, 70)));

        for (Archer person : team2) {
            System.out.println(person);
        }
        System.out.println("==== Щитоносцы====");
        Team<Shieldbearers> shieldbearersTeam = new Team<>();
        shieldbearersTeam.addWarriorToTeam(new Shieldbearers(
                        "Nicola", 100, new AllShilds(175, "Железный Щит")))
                .addWarriorToTeam(new Shieldbearers(
                        "Ivan", 115, new AllShilds(82, "Деревянный Щит")))
                .addWarriorToTeam(new Shieldbearers());

        for (Shieldbearers shieldbearers : shieldbearersTeam) {
            System.out.println(shieldbearers);
        }

        System.out.printf("Максимальный радиус действие оружия = %s Метров \n",team1.maxTeamRange());

        System.out.printf("Максимальный радиус действие оружия = %s Метров \n" ,team2.maxTeamRange());

    }


}
