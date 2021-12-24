package com.ibs.features.java8.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFeature {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date.format(DateTimeFormatter.ISO_DATE));
        String today= LocalDate.of(2021,11,5).format(DateTimeFormatter.ISO_DATE);
        System.out.println(today);
    }
}
