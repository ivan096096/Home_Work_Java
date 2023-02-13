package OOP.HomeWork.lesson_6.HomeWork;

public class Controller {
    private Functionable functionable;

    public Controller(Functionable functionable) {
        this.functionable = functionable;
    }

    public void report(User user){
        functionable.report(user);
    }
    public void save(User user){
        functionable.save(user);
    }
}
