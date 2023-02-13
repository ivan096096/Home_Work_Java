package OOP.HomeWork.lesson_4;

import OOP.HomeWork.lesson_4.Wars.Archer;
import OOP.HomeWork.lesson_4.Wars.Shieldbearers;

import java.util.*;

public class Team<E extends Warrior> implements Iterable<E> {
    private List<E> team = new ArrayList<>();

    public Team<E> addWarriorToTeam(E person) {
        team.add(person);
        return this;
    }

    @Override
    public Iterator<E> iterator() {
        return team.iterator();
    }

    public int maxTeamRange() {
        int maxRange = 0;
        for (E item : team) {
            if (item instanceof Archer) {
                if (((Archer) item).shotRange() > maxRange) maxRange = ((Archer) item).shotRange();
            }
        }
        return maxRange;
    }

//    public int minEndurance() {
//        int minEndurance = 0;
//        for (E item : team) {
//            if (item instanceof Shieldbearers) {
//                if (((Shieldbearers) item).ShildEndurance() < minEndurance) minEndurance = ((Shieldbearers) item).ShildEndurance();
//            }
//        }
//        return minEndurance;
//    }
}
