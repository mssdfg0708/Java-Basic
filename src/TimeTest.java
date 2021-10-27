class Time01 {
    private int hour, minute, second;

    Time01(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() { return hour; }
    public int getMinute() { return minute; }
    public int getSecond() { return second; }

    public void setHour(int hour) {
        if (hour >=0 && hour <24) {
            this.hour = hour;
        }
    }
    public void setMinute(int minute) {
        if (minute >= 0 && minute <60) {
            this.minute = minute;
        }
    }
    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        }
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}

public class TimeTest {
    public static void main(String[] args) {
        Time01 t1 = new Time01(24, 18, 35);
        System.out.println(t1);

        t1.setHour(t1.getHour() + 1);
        System.out.println(t1);
    }
}
