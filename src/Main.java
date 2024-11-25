public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("task number 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Task number 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Task number 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Task number 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Task number 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println();
        System.out.println("Task number 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Task number 7");
        for (int i = 1; i <= 512; i = i*2) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Task number 8");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }

        System.out.println();
        System.out.println("Task number 9");
        int secondSalary = 29000;
        int secondTotal = 0;
        for (int i = 1; i <= 12; i++) {
            secondTotal = secondTotal + secondTotal / 100;
            secondTotal = secondTotal + secondSalary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + secondTotal + " рублей.");
        }

        System.out.println();
        System.out.println("Task number 10");
        int numberTwo = 2;
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result = numberTwo * i;
            System.out.println(numberTwo + "*" + i + "=" + result);
        }
    }
}