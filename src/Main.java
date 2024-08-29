public class Main {
    private final static String CURRENCY = "EUR";

    public static void main(String[] args) {
        String nameProduct1 = "Smartphone";
        double total1 = 12153.41;
        int day1 = 5;
        double salesByDay1 = total1 / day1;

        System.out.printf("%nProduct No 1: %s," +
                "%ntotal sales for %d days is %s %.2f" +
                "%nsales by day is %s %.2f%n", nameProduct1, day1, CURRENCY, total1, CURRENCY, salesByDay1);

        String nameProduct2 = "Laptop";
        double total2 = 15678.97;
        int day2 = 9;
        double salesByDay2 = total2 / day2;

        System.out.printf("%nProduct No 2: %s," +
                "%ntotal sales for %d days is %s %.2f" +
                "%nsales by day is %s %.2f", nameProduct2, day2, CURRENCY, total2, CURRENCY, salesByDay2);



    }
}