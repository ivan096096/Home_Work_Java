package OOP.HomeWork.lesson_4.Weapons;
import OOP.HomeWork.lesson_4.Weaponable;


public abstract class Weapon implements Weaponable {// Оружие
    protected int pointOfDamage;

    public Weapon(int pointOfDamage) {
        this.pointOfDamage = pointOfDamage;
    }


}
