package HomeWork8_8;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(22, 2, 1997);
//        for (int i = 1; i < 10; i++) {
//            date.nextDay();
//            System.out.println(date);
//        }
        System.out.println("___________________");
        System.out.println(date);

        date = new Date(1, 1, 2000);

        for (int i = 1; i < 366; i++) {
            System.out.println(date);

            if (date.getDay() == date.getDaysPerMonth()[date.getMonth()]) {
                System.out.println();
            }
            date.nextDay();
        }

    }
}
