package HomeWork8_7;

public class Time2Test {
    public static void main(String[] args) {

        Time2 time2 = new Time2(0, 0, 59);
        System.out.println("Increment at second");
        System.out.println(time2);
        time2.tick();
        System.out.println(time2+"\n");

        System.out.println("Increment at minute");

        time2 = new Time2(0, 59, 0);
        System.out.println(time2);
        time2.incrementMinute();
        System.out.println(time2+"\n");

        System.out.println("Increment at day");
        time2 = new Time2(23, 59, 59);
        System.out.println(time2);
        time2.tick();
        System.out.println(time2+"\n");

        System.out.println("Increment at hour");
        time2 = new Time2(23, 0, 0);
        System.out.println(time2);
        time2.incrementHour();
        System.out.println(time2);

    }
}
