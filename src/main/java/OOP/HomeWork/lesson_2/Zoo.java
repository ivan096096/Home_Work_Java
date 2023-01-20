package OOP.HomeWork.lesson_2;


import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;
    private Radio radio = new Radio();

    public Zoo() {
        animals = new ArrayList<Animal>();
    }

    public Zoo addAnimals(Animal a) {
        animals.add(a);
        return this;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Speakable> getSpeekable() {
        List<Speakable> answer = new ArrayList<Speakable>();
        for (Animal ani : animals) {
            answer.add(ani);
        }
        answer.add(radio);
        return answer;
    }

    public List<Runable> getRanner() {
        List<Runable> resalt = new ArrayList<Runable>();
        for (Animal animal : animals) {
            if (animal instanceof Runable) {
                resalt.add((Runable) animal);
            }
        }
        return resalt;
    }

    public int RanOfChampion() {
        int maxRan = 0;
        for (Runable runable : getRanner()) {
            if (maxRan < runable.speedOfRan()) {
                maxRan = runable.speedOfRan();
            }
        }
        return maxRan;
    }

    public int FlyOfChampion() {
        int maxFly = 0;
        for (Fly fly : getFly()) {
            if (maxFly < fly.speedFly()) {
                maxFly = fly.speedFly();
            }
        }
        return maxFly;
    }

    public List<Swim> getSwim() {
        List<Swim> swim_resalt = new ArrayList<Swim>();
        for (Animal animal : animals) {
            if (animal instanceof Swim) {
                swim_resalt.add((Swim) animal);
            }
        }
        return swim_resalt;
    }

    public List<Fly> getFly(){
        List<Fly> resaltFly = new ArrayList<Fly>();
        for (Animal animal : animals) {
            if (animal instanceof Fly){
                resaltFly.add((Fly)animal);
            }

        }
        return resaltFly;
    }


    public Radio getRadio() {
        return radio;
    }


}
