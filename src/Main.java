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
        //task10();
        //task11();
        //task12();
        //task13();
        int c =  bigValue(7,6);
        System.out.println(c);
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

    public static void task11() {
        int value = 104;
        if (value % 10 == 3) {
            System.out.println("Последняя цифра 3");
        } else
            System.out.println("нет");
    }

    /**
     * Рубль - 1, !11
     * Рубля - 2,3,4 и не = 12,13,14
     * Рублей - 5,6,7,8,9,10,11 - 19
     */
    public static void task12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int money = scanner.nextInt();
        if (money % 10 == 1 && money % 100 != 11) {
            System.out.println(money + " - Рубль.");
        } else if ((money % 10 == 2 || money % 10 == 3 || money % 10 == 4)
                && (money % 100 != 12 || money % 100 != 13 || money % 100 != 14)) {
            System.out.println(money + " - Рубля.");
        } else
            System.out.println(money + " - Реблей.");
    }

    public static void task13() {
        int money = 13;
        int money10 = money % 10;
        int money100 = money % 100;
        if (money10 == 0 || (money100 > 4 && money100 < 20)) {
            System.out.println(money + " рублей");
        } else if (money10 == 1) {
            System.out.println(money + " рубль");
        } else
            System.out.println(money + " рубля");
    }

    public static int bigValue(int a, int b) {
        if (a > b) {
            return a;
        } else
            return b;
    }
}
