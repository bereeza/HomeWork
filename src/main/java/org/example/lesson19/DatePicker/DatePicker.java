package org.example.lesson19.DatePicker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.sql.Date;

public class DatePicker {
    public static Date getCurrentDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = LocalDateTime.now().format(formatter);
        return Date.valueOf(formattedDate);
    }
}