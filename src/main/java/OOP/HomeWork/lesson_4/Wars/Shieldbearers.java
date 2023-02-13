package OOP.HomeWork.lesson_4.Wars;

import OOP.HomeWork.lesson_4.Warrior;
import OOP.HomeWork.lesson_4.Weaponable;
import OOP.HomeWork.lesson_4.Weapons.Shields.Shield;

public class Shieldbearers extends Warrior {
    @Override
    public String toString() {
        return "Shieldbearers , " + super.toString();
    }

    public Shieldbearers() {
        super("Вурдолак",251);

    }

    public Shieldbearers(String name, int healthPoint, Weaponable weapon) {
        super(name, healthPoint, weapon);
    }

    public int ShildEndurance() {
        return ((Shield) getWeapon()).getEndurance();
    }

}
