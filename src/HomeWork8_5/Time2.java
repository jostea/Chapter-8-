package HomeWork8_5;

public class Time2 {

    private int secondsAfterMidnight;

    public Time2() {
        this(0, 0, 0);
    }

    public Time2(int hour) {
        this(hour, 0, 0);
    }

    public Time2(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time2(int hour, int minute, int second) {
        this.secondsAfterMidnight = hour * 3600 + minute * 60 + second;
    }

    public Time2(Time2 time) {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }


    public void setTime(int hour, int minute, int second) {
        secondsAfterMidnight = hour * 3600 + minute * 60 + second;
    }


    public void setHour(int hour) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");

        this.secondsAfterMidnight = (secondsAfterMidnight % 3600) + hour * 3600;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-60");
        this.secondsAfterMidnight = secondsAfterMidnight / 3600 * 3600 + secondsAfterMidnight % 60 + minute * 60;
    }

    public void setSecond(int second) {
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-60");
        this.secondsAfterMidnight = secondsAfterMidnight - secondsAfterMidnight % 60 + second;
    }


    public int getHour() {
        return secondsAfterMidnight / 3600;
    }

    public int getMinute() {
        return secondsAfterMidnight % 3600 / 60;
    }

    public int getSecond() {
        return secondsAfterMidnight % 60;
    }


    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(),
                (getHour() < 12 ? "AM" : "PM"));

    }


}
