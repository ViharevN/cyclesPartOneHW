public class Main {
    public static void main(String[] args) {
        //задание 1

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //задание 2

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //задание 3
        for (int i = 0; i <= 17; i+=2) {
            System.out.println(i);
        }
        //задание 4

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //домашнее задание -2
        //задание 1
        System.out.println();

        for (int i = 1904; i <= 2096; i +=4) {
            System.out.println(i + " год является високосным");
        }

        //задание 2
        System.out.println();

        for (int i = 7; i <= 98; i+=7) {
            System.out.print(i + " ");
        }

        //задание 3
        System.out.println();

        for (int i = 1; i <= 512; i*=2) {
            System.out.print(i + " ");
        }
    }
}