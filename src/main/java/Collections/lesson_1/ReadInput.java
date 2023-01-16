package Collections.lesson_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.stream.Collectors;

public class ReadInput {


    String Str_1;
    String Str_2;
    int a;
    int b;


    public int inputReader(String variable) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("filereade.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            if (str.contains("a")) {
                Str_2 = str.chars().filter(c -> !Character.isLetter(c))
                        .mapToObj(c -> String.valueOf((char) c))
                        .collect(Collectors.joining())
                        .trim();

            } else if (str.contains("b")) {
                Str_1 = str.chars().filter(c -> !Character.isLetter(c))
                        .mapToObj(c -> String.valueOf((char) c))
                        .collect(Collectors.joining())
                        .trim();
            } else {
                System.out.println("Неверный формат!\n запишите в виде:\nb [число]\na [число]");
                break;
            }
        }
        br.close();

        if (variable == "a") {
            return a = Integer.parseInt(Str_2);
        } else {
            return b = Integer.parseInt(Str_1);
        }
    }

}

