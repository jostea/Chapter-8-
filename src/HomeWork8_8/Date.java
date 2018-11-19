package HomeWork8_8;

public class Date {
    private int day;
    private int month;
    private int year;

    private static final int[] daysPerMonth =
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int day, int month, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);
        System.out.println("Date object constructor for date " + this);

    }

    public void nextDay() {
        ++this.day;

        if (day > daysPerMonth[month]) {
            ++month;
            day = 1;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }


    public void setMonth(int month) {
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");
        } else this.month = month;
    }

    public void setDay(int day) {

        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }

        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }
        this.day = day;

    }

    public void setYear(int year) {
        if (year < 0) {
            throw new IllegalArgumentException("Year couldn't be negative;");
        } else this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int[] getDaysPerMonth() {
        return daysPerMonth;
    }

    public String toString() {
        return String.format("%d/%d/%d", day, month, year);
    }
}
