public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int a = 2_459_000;
        int total = 0;
        int salary = 15_000;
        int i = 0;
        while (total < 2_459_000) {
            i++;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            if (i == 10) {
                System.out.println(i);
                break;
            }
            System.out.print(i + " ");
            i++;
        }

        for (int a = 10; a >= 1; a = a - 1) {
            if (a == 1) {
                System.out.println(a);
                break;
            }
            System.out.print(a + " ");

        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int born = 17;
        int death = 8;
        int dif = born - death;
        for (int i = 1; i <= 10; i++) {
            population += population * dif / 1000;
            System.out.println("Год " + i + " численность населения составляет " + population);
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int sum = 15000;
        int monthNum = 1;
        while (sum <= 12_000_000) {
            sum *= 1.07;
            System.out.printf("Месяц %d , сумма %d \n", monthNum, sum);
            monthNum++;
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int sum = 15000;
        int monthNum = 1;
        while (sum <= 12_000_000) {
            sum *= 1.07;
            if (monthNum % 6 == 0) {
                System.out.printf("Месяц %d , сумма %d \n", monthNum, sum);
            }
            monthNum++;


        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int sum = 15000;
        for (int i = 1; i < 9 * 12; i += 6) {
            int sumBefore = sum;
            sum *= 1 + 0.07 * 6;
            System.out.printf("Месяц %d , сумма %d \n", i, sum - sumBefore);
        }

    }

    public static void task7() {
        System.out.println("Задача 7");
        int firstFriday = 6;
        for (int currentFriday = firstFriday; currentFriday <= 31; currentFriday += 7) {
            System.out.println("Сегодня пятница, " + currentFriday + " ");
        }
    }

        public static void task8() {
            System.out.println("Задача 8");
            int currentYear =2022;
            int beginning = currentYear-200;
            int ending = currentYear+100;
            for (int i = beginning; i<ending;++i) {
                if (i % 79 ==0) {
                    System.out.println(i);
                }
            }

        }

}