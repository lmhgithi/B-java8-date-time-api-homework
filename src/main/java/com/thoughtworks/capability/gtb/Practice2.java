package com.thoughtworks.capability.gtb;

import java.time.LocalDate;

/**
 * 对任意日期获取下一个工作日, 不考虑节假日
 *
 * @author itutry
 * @create 2020-05-15_17:20
 */
public class Practice2 {

  public static LocalDate getNextWorkDate(LocalDate date) {
    int daysTpNextWorkDay = 7 - date.getDayOfWeek().getValue();
    if (daysTpNextWorkDay > 2) {
      date = date.plusDays(1);
    } else {
      date = date.plusDays(daysTpNextWorkDay + 1);
    }
    return date;
  }
}
