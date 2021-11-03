package First;

import static java.lang.System.out;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

        out.println("Today is " + date.format(today));
        out.println("First.Time is "+ time.format(today));
    }
}
