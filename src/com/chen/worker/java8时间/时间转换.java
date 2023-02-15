package com.chen.worker.java8时间;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class 时间转换 {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now().withNano(0);
        String yyyyMMddHHmmss = now.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        System.out.println("now = " + now);
        System.out.println("yyyyMMddHHmmss = " + yyyyMMddHHmmss);
        System.out.println("==字符串转时间==");
        String timeStr = "20230125191148";
//        String yyyyMMddHHmmss1 = LocalDateTime.parse(timeStr).format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        String yyyyMMddHHmmss1 = LocalDateTime.parse(timeStr).format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        System.out.println("yyyyMMddHHmmss1 = " + yyyyMMddHHmmss1);
//        LocalDateTime parse2 = LocalDateTime.parse("2023-01-25T19:34:46");

    }

}
