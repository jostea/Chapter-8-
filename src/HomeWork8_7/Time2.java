package HomeWork8_7;

public class Time2 {

    private int hour;
    private int minute;
    private int second;

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
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public Time2(Time2 time) {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }


    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }


    void tick() {
        if (getSecond() + 1 > 59) {
            setSecond(0);
            if (getMinute() + 1 > 59) {
                setMinute(0);
                if (getHour() + 1 >= 24) {
                    setHour(0);
                } else
                    setHour(getHour() + 1);
            } else setMinute(getMinute() + 1);
        } else setSecond(getSecond() + 1);


    }


    void incrementMinute() {
        if (getMinute() + 1 > 59) {
            setMinute(0);
            if (getHour() + 1 >= 24) {
                setHour(0);
            } else setHour(getHour() + 1);
        } else setMinute(getMinute() + 1);
    }

    void incrementHour() {
        if (getHour() + 1 >= 24) {
            setHour(0);
        } else setHour(getHour() + 1);
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-60");
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-60");
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
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
