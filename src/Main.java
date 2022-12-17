public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int a = 2_459_000;
        int total = 0;
        int salary = 15_000;
        int i =0;
        while (total < 2_459_000) {
            i++;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");


        }
    }
    public static void task2() {
        System.out.println("Задача 2");




}}