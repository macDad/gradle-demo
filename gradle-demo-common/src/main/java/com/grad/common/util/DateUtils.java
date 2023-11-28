package com.grad.common.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DateUtils {

  public static final String ISO_8601_PATTERN = "yyyy-MM-dd'T'HH:mm:ssZ";

  public static String currentISODateFormat() {
    DateTime dt = DateTime.now(DateTimeZone.UTC);
    DateTimeFormatter patternFormat = DateTimeFormat.forPattern(ISO_8601_PATTERN);
    DateTimeFormatter isoFormat = ISODateTimeFormat.dateTime();
    return dt.toString(isoFormat);
  }

  public static String currentDateFormat(String dateFormat) {
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
    return sdf.format(cal.getTime());
  }

  public static boolean isToday(Date date) {
    return isSameDay(date, Calendar.getInstance().getTime());
  }

  public static boolean isSameDay(Date date1, Date date2) {
    if (date1 == null || date2 == null) {
      throw new IllegalArgumentException("The dates must not be null");
    }
    Calendar cal1 = Calendar.getInstance();
    cal1.setTime(date1);
    Calendar cal2 = Calendar.getInstance();
    cal2.setTime(date2);
    return isSameDay(cal1, cal2);
  }

  public static boolean isSameDay(Calendar cal1, Calendar cal2) {
    if (cal1 == null || cal2 == null) {
      throw new IllegalArgumentException("The dates must not be null");
    }
    return (cal1.get(Calendar.ERA) == cal2.get(Calendar.ERA)
        && cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
        && cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR));
  }
}
