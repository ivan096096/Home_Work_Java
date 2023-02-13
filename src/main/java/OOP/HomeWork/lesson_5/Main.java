package OOP.HomeWork.lesson_5;

import OOP.HomeWork.lesson_5.controllers.UserController;
import OOP.HomeWork.lesson_5.model.FileOperation;
import OOP.HomeWork.lesson_5.model.FileOperationImpl;
import OOP.HomeWork.lesson_5.model.Repository;
import OOP.HomeWork.lesson_5.model.RepositoryFile;
import OOP.HomeWork.lesson_5.utils.Validate;
import OOP.HomeWork.lesson_5.views.ViewUser;

public class Main {

    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        Validate validate = new Validate();
        UserController controller = new UserController(repository, validate);
        ViewUser view = new ViewUser(controller, validate);
        view.run();
    }
}