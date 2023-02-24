package OOP.HomeWork.lesson_7.Notes;


import OOP.HomeWork.lesson_7.Notes.controllers.UserController;
import OOP.HomeWork.lesson_7.Notes.model.FileOperation;
import OOP.HomeWork.lesson_7.Notes.model.FileOperationable;
import OOP.HomeWork.lesson_7.Notes.model.Repository;
import OOP.HomeWork.lesson_7.Notes.model.RepositoryFile;
import OOP.HomeWork.lesson_7.Notes.utils.Validate;
import OOP.HomeWork.lesson_7.Notes.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperationable fileOperation = new FileOperation("notes.txt");
        Repository repository = new RepositoryFile(fileOperation);
        Validate validate = new Validate();
        UserController controller = new UserController(repository, validate);
        ViewUser view = new ViewUser(controller, validate);
        view.run();
    }
}
