package com.darojunav.practise.javaprograms.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {

    public static void main(String[] args) throws Exception {
        String date = "";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.mmm'Z'");
        Date date1 = formatter.parse(date);

        System.out.println(date1 + "\t" + date1);
    }
}



