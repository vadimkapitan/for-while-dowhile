import javax.sound.midi.Soundbank;
import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
        //task8();
        //task9();
        task10();
    }

    public static void task1() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
    }

    public static void task2() {
        System.out.println();
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.println("3 * " + i + " = " + 3 * i);
        }
    }

    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        //System.out.println("Вы ввели число = " + number);
        int i = 0;
        int sum = 0;
        while (i < number) {
            i++;
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void task6() {
        int i = 0;
        while (i < 98) {
            i += 7;
            System.out.print(i + " ");
        }
    }

    public static void task7() {
        int i = 1;
        while (i <= 512) {
            System.out.print(i + " ");
            i = i * 2;
        }
    }

    public static void task8() {
        int i = 8;
        int sum = 0;
        while (i <= 14) {
            sum += i;
            i += 2;
        }
        System.out.println(sum);

        int summa = 0;
        for (int a = 8; a <= 14; a += 2) {
            summa += a;
        }
        System.out.println(summa);
    }

    /*
    Посчитаем произведение 4*8*12*16*20.
    То есть нужно все эти числа перемножить между собой.
     */
    public static void task9() {
        int sum = 1;
        for (int i = 4; i <= 20; i += 4) {
            sum *= i;
        }
        System.out.println(sum);
    }

    public static void task10() {
        int currentYear = 2019;
        for (int year = currentYear; ; year++) {
            if (Year.isLeap(year)) {
                System.out.println("Ближайший високосный год: " + year);
                break;
            }
        }
    }
}