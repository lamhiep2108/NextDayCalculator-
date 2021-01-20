
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NextDayCalculator {
    public static String findNextDayCalculator(String first_day)
        throws ParseException{
        final SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        final Date date = format.parse(first_day);
        final Calendar calendar  = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR,1);
        return format.format(calendar.getTime());
    }
}
