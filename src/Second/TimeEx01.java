package Second;

import java.time.*;
import java.time.format.*;

public class TimeEx01 {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowDate);
        System.out.println(nowTime);

        LocalDate birthDate = LocalDate.of(1997, 1, 7);
        LocalTime birthTime = LocalTime.of(5, 24,45);
        System.out.println(birthDate);
        System.out.println(birthTime);

        LocalDateTime nowDateTime = LocalDateTime.of(nowDate, nowTime);
        System.out.println(nowDateTime);

        Period period = Period.between(birthDate, nowDate);
        Duration duration = Duration.between(birthTime, nowTime);

        System.out.println(period.toTotalMonths());
        System.out.println(duration.toMinutes());

        LocalDate newYear = LocalDate.parse("2020-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate date = LocalDate.parse("2010-01-01");
        LocalTime time = LocalTime.parse("23:59:59");
        LocalDateTime dateTime = LocalDateTime.parse("2010-01-01T23:59:59");

//        X pattern = X.ofPattern(text) 를 parse(text, pattern) 을 이용하여 time format 에 맞추어 준다
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyyMMdd HHmmss");
        LocalDateTime endOfYear = LocalDateTime.parse("20151231 235959", pattern);

        System.out.println(newYear);
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(endOfYear);
    }
}
