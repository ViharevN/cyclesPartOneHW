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

        //домашнее задание 3
        //задание 1


        System.out.println();
        int cash = 29000;
        int savings = 0;
        for (int i = 1; i <= 12; i++) {
            savings = cash + savings;
            System.out.println("Месяц " + i + " сумма равна " + savings);
        }

        //задание 2

        System.out.println();
        int money = 29000;
        int saves = 0;
        for (int i = 1; i <= 12; i++) {
            saves = saves + saves/100;
            saves = money + saves;
            System.out.println("Месяц " + i + ", сумма равна " + saves);

        }





    }
}