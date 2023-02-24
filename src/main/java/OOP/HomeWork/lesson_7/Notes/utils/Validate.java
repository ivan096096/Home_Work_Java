package OOP.HomeWork.lesson_7.Notes.utils;

public class Validate {

    public void checkField(String str) throws Exception {
        if(str.equals("")) {
            throw new NameException("Пустая строка. Попробуйте еще раз");
        }
    }
}
