package OOP.HomeWork.lesson_4.Weapons.Shields;


import OOP.HomeWork.lesson_4.Weapons.Weapon;

public class Shield extends Weapon {
    @Override
    public String toString() {
        return "Shield{" +
                "endurance=" + endurance +
                '}';
    }

    protected int endurance;   //  Прочность

    public Shield(int pointOfDamage) {
        super(pointOfDamage);
    }

    public Shield(int pointOfDamage, int endurance) {
        super(pointOfDamage);
        this.endurance = endurance;
    }

    public int getEndurance() {
        return endurance;
    }

    @Override
    public int damage() {
        return 0;
    }
}
