package com.asignment3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Helper {
    private static final String DATE_FORMAT_STANDARD = "dd/MM/yyyy";
    public static String convertDateToString(Date date) {
        //cai ham nay  cong viec rat tan man, mat thoi gian
        //vi moi lan code xong lai phai chay lai ca project
        //minh co 1 cach: code tren "java online"
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(DATE_FORMAT_STANDARD);
        LocalDate localDate = date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        return dtf.format(localDate);
    }
    public static String getHourMinuteFromDate(Date date) {
        if(date == null) {
            return "chua tra";
        }
        Calendar calendar = GregorianCalendar.getInstance(); // creates a new calendar instance
        calendar.setTime(date);   // assigns calendar to given date
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        return String.format("%s : %s",
                hour < 10 ? String.format("0%d", hour) : String.format("%d", hour),
                minute < 10 ? String.format("0%d", minute) : String.format("0%d", minute)
        );
    }
    public static Date convertStringToDate(String dateString) {
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT_STANDARD);
        try {
            Date date = formatter.parse(dateString);
            return date;
        } catch (Exception e) {
            return new Date();//neu nhap sai ngay thi lay ngay hom nay
        }
    }
    public static Boolean compare2Dates(Date date1, Date date2) {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        Calendar calendar1 = Calendar.getInstance(timeZone);
        Calendar calendar2 = Calendar.getInstance(timeZone);
        calendar1.setTime(date1);
        calendar2.setTime(date2);
        return  calendar1.get(Calendar.DAY_OF_MONTH) == calendar2.get(Calendar.DAY_OF_MONTH)
                &&calendar1.get(Calendar.MONTH) == calendar2.get(Calendar.MONTH)
                &&calendar1.get(Calendar.YEAR) == calendar2.get(Calendar.YEAR);
    }
}
