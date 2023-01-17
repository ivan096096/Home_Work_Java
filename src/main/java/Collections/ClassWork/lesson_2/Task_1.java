package Collections.ClassWork.lesson_2;

import java.util.Scanner;

/*
      +  1)Дана последовательность N целых чисел.
        Найти количество положительных чисел, после которых следует отрицательное число.

       + 2) Дана последовательность целых чисел, оканчивающаяся нулем.
        Найти сумму положительных чисел, после которых следует отрицательное число.

       + 3) Дана последовательность N целых чисел. Найти сумму простых чисел. Prime_numbers()

       + 4) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей. True_Example

        5) Дан массив целых чисел. Найти сумму элементов, у которых последняя и предпоследняя цифры равны.

       +6) Дан массив целых чисел.
        Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
*/
public class Task_1 {
    public static void main(String[] args) {
//        Amount_numbers_1();
//        Sum_Pasitive_Numbers_2();
//        positive_num_2();
//        Prime_numbers_3();
//        True_Example_4();
//        Last_Penultimate_Number_5();
//        task_6();
    }

    private static void task_6() {
        Integer sum = 0;
        Integer temp = 0;
        Integer[] arr = {2, 4, -4, 88, 44, 3, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 9) {
                sum += i;
                for (int j = 0; j < arr.length; j++) {       // Не могу понять как почему второрой раз появляется -4
                    if (arr[j] < 0) {
                        temp = arr[j];
                        System.out.println(temp);
                    }

                }
            }
        }
        System.out.println(sum);
    }


    private static void Last_Penultimate_Number_5() {
        int sum = 0;
        Integer[] arr = {122, 388, 142, 599, 111};
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i] % 10;
            int num2 = (arr[i] % 100) / 10;
            if (num == num2) {
                sum += arr[i];
            }
        }
        System.out.print("Сумма одинаковых эллементов = " + sum);
    }

    private static void Amount_numbers_1() {                 // Количество положительных чисел
        int[] num = {32, 44, -4, 88, 44, 32, 11};
        int COUNT = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] <= 0) {
                break;
            } else {
                COUNT += 1;
            }
        }
        System.out.println(COUNT);


    }


    private static void positive_num_2() {            //Сумма положительных чисел 2 решение
        var positive_count = 0;
        var num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длинну - ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Введите число - ");
        for (int i = 0; i < arr.length; i++) {
            int input = scanner.nextInt();
            arr[i] = input;
        }
        while (num < arr.length) {
            if (arr[num] >= 0) {
                positive_count += 1;
            }
            num += 1;
        }
        System.out.println("Положительных чисел = " + positive_count);
    }

    private static void Sum_Pasitive_Numbers_2() {      //Сумма положительных чисел
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длинну - ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Введите число - ");
        for (int i = 0; i < arr.length; i++) {
            int input = scanner.nextInt();
            arr[i] = input;
            if (arr[i] == 0) {
                break;
            } else {
                if (arr[i] < 0) {
                    sum = arr[i - 1] + arr[i - 2];
                }
            }
        }
        System.out.println("Сумма положительных чисел = " + sum);
    }


    private static void Prime_numbers_3() {         //  Сумма Простых числел
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите какой длинны будет массив");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            boolean Flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    Flag = false;
                    break;
                }
            }
            if (Flag) {
                sum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("sum == " + sum);
    }


    private static void True_Example_4() {  // Верное ли возрастание
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длинну - ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        boolean flag = true;
        System.out.print("Введите число - ");
        for (int i = 1; i < arr.length; i++) {
            int input = scanner.nextInt();
            arr[i] = input;
            System.out.println(arr[i]);
            if (arr[i] <= arr[i - 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Числа возрастают");
        } else {
            System.out.println("Числа не возрастает");
        }
    }


}
