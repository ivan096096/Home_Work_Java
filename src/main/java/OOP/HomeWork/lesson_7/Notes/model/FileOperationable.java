package OOP.HomeWork.lesson_7.Notes.model;

import java.util.List;

public interface FileOperationable {
    List<String> readAllLines();

    void saveAllLines(List<String> lines);
}
