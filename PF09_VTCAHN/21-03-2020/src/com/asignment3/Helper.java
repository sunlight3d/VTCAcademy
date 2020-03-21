package com.asignment3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
        Calendar calendar = GregorianCalendar.getInstance(); // creates a new calendar instance
        calendar.setTime(date);   // assigns calendar to given date
        return calendar.get(Calendar.HOUR) + ": " + calendar.get(Calendar.MINUTE);
    }
    public static Date convertStringToDate(String dateString) {
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT_STANDARD);
        try {
            Date date = formatter.parse(dateString);
            return date;
        } catch (ParseException e) {
            return new Date();//neu nhap sai ngay thi lay ngay hom nay
        }
    }
}
