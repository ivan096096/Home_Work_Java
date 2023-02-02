// Реализовать абстрактный класс Warrior, с полями name, weapon, healthPoint
package OOP.HomeWork.lesson_4;

import OOP.HomeWork.lesson_4.Weaponable;

public abstract class Warrior { // Воин
    private String name;
    private int healthPoint;
    private Weaponable weapon;
    
    public Warrior(String name, int healthPoint, Weaponable weapon) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
    }

    public Warrior(String name, int healthPoint) {
        this.name = name;
        this.healthPoint = healthPoint;
    }

    public String getName() {
        return name;
    }
    public int getHealthPoint() {
        return healthPoint;
    }
    public Weaponable getWeapon() {
        return weapon;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        return "Warrior [name = " + name + ", healthPoint = " + healthPoint + ", weapon = " + weapon + "]";
    }
}
