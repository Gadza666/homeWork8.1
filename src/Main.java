public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(" Task 1 ");

        int[] paymentAmount = {5000, 10000, 1000, 38000, 54000};

        int summary = 0;
        for (int i = 0; i < paymentAmount.length; i++) {
            summary += paymentAmount[i];
        }
        System.out.println(" Сумма трат за месяц составила " + summary + " рублей ");


        System.out.println(" Task 2 ");

        int maxPayment = 0;
        int minPayment = 999999;
        for (int i = 0; i < paymentAmount.length; i++) {
            if ( paymentAmount[i] > maxPayment ) {
                maxPayment = paymentAmount[i];
            }
            if ( paymentAmount[i] < minPayment) {
                minPayment = paymentAmount[i];
            }
        }
        System.out.printf(" Минимальная сумма трат за неделю составила %s рублей. Максимальная сумма трат за неделю составила %s рублей. ", minPayment, maxPayment);

        System.out.println();

        System.out.println(" Task 3 ");

        int averageSummary = 0;
        for (int i = 0; i < paymentAmount.length; i++) {
            averageSummary += paymentAmount[i];
        }
        double fullAveragePayment = averageSummary / paymentAmount.length;

        System.out.printf(" Средняя сумма трат за месяц составила %s рублей" , fullAveragePayment);

        System.out.println();


        System.out.println(" Task 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }
}
