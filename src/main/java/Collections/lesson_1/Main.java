package Collections.lesson_1;
        /*+Реализовать функцию возведения числа а в степень b. a, b ∈ Z.
 Сводя количество выполняемых действий к минимуму.
        Пример 1: а = 3, b = 2, ответ: 9
        Пример 2: а = 2, b = -2, ответ: 0.25
        Пример 3: а = 3, b = 0, ответ: 1
        Пример 4: а = 0, b = 0, ответ: не определено
        Пример 5
        входные данные находятся в файле input.txt в виде
        b 3
        a 10
        Результат нужно сохранить в файле output.txt
        1000
*/
public class Main {
        public static void main(String[] args) throws Exception{
                ReadInput readF = new ReadInput();
                Pow_Write ts = new Pow_Write();
                ts.computing(readF.inputReader("a"),
                        readF.inputReader("b"));
                }
}
