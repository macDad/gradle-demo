package com.grad.common.util;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

class DateUtilsTest {


    @Test
    void testIsToday(){
        boolean result = DateUtils.isToday(DateTime.now(DateTimeZone.UTC).toDate());
        Assertions.assertEquals(true, result);
    }

    @Test
    void testIsSameDay(){
        boolean result = DateUtils.isSameDay(new GregorianCalendar(2023, Calendar.NOVEMBER, 27, 20, 46).getTime(), new GregorianCalendar(2023, Calendar.NOVEMBER, 27, 20, 46).getTime());
        Assertions.assertEquals(true, result);
    }

    @Test
    void testIsSameDay2(){
        boolean result = DateUtils.isSameDay(new GregorianCalendar(2023, Calendar.NOVEMBER, 27, 20, 46), new GregorianCalendar(2023, Calendar.NOVEMBER, 27, 20, 46));
        Assertions.assertEquals(true, result);
    }
}

