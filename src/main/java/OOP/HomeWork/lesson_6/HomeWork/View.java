package OOP.HomeWork.lesson_6.HomeWork;

public class View {
    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void run(User user){
        controller.report(user);
        controller.save(user);
    }
}

