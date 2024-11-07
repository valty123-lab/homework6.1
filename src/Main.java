public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задача1");

        int expenses[] = {2002, 3000, 7000, 15000, 1000};
        int sum = 0;
        for (int i = 0; i < expenses.length; i++) {
            sum = sum + expenses[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + "рублей");

        System.out.println("Задача2");

        int min = expenses[0];
        for (int num : expenses) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей");

        int max = expenses[0];
        for (int num : expenses) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей");

        System.out.println("Задача3");
        double average = 0;
        if (expenses.length > 0)
        {
            double sum1 = 0;
            for (int j = 0; j < expenses.length; j++) {
                sum1 += expenses[j];
            }
            average = sum1 / expenses.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " +  average + " рублей");

        System.out.println("Задача4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
            if (i > 0) {
                System.out.print("");
            }
        }
        System.out.println();


        }
    }






