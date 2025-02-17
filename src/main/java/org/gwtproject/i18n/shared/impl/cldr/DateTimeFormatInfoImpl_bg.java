/*
 * Copyright 2012 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.gwtproject.i18n.shared.impl.cldr;
// DO NOT EDIT - GENERATED FROM CLDR AND ICU DATA

/**
 * Implementation of DateTimeFormatInfo for the "bg" locale.
 */
public class DateTimeFormatInfoImpl_bg extends DateTimeFormatInfoImpl {

  @Override
  public String[] ampms() {
    return new String[] {
        "am",
        "pm"
    };
  }

  @Override
  public String dateFormatFull() {
    return "EEEE, d MMMM y 'г'.";
  }

  @Override
  public String dateFormatLong() {
    return "d MMMM y 'г'.";
  }

  @Override
  public String dateFormatMedium() {
    return "d.MM.y 'г'.";
  }

  @Override
  public String dateFormatShort() {
    return "d.MM.yy 'г'.";
  }

  @Override
  public String dateTimeFull(String timePattern, String datePattern) {
    return datePattern + ", " + timePattern;
  }

  @Override
  public String dateTimeLong(String timePattern, String datePattern) {
    return datePattern + ", " + timePattern;
  }

  @Override
  public String dateTimeMedium(String timePattern, String datePattern) {
    return datePattern + ", " + timePattern;
  }

  @Override
  public String dateTimeShort(String timePattern, String datePattern) {
    return datePattern + ", " + timePattern;
  }

  @Override
  public String[] erasFull() {
    return new String[] {
        "преди Христа",
        "след Христа"
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "пр.Хр.",
        "сл.Хр."
    };
  }

  @Override
  public String formatHour12Minute() {
    return "h:mm 'ч'. a";
  }

  @Override
  public String formatHour12MinuteSecond() {
    return "h:mm:ss 'ч'. a";
  }

  @Override
  public String formatHour24Minute() {
    return "H:mm 'ч'.";
  }

  @Override
  public String formatHour24MinuteSecond() {
    return "H:mm:ss 'ч'.";
  }

  @Override
  public String formatMinuteSecond() {
    return "m:ss";
  }

  @Override
  public String formatMonthAbbrev() {
    return "MM";
  }

  @Override
  public String formatMonthAbbrevDay() {
    return "d.MM";
  }

  @Override
  public String formatMonthFullDay() {
    return "d MMMM";
  }

  @Override
  public String formatMonthFullWeekdayDay() {
    return "EEEE, d MMMM";
  }

  @Override
  public String formatMonthNumDay() {
    return "d.MM";
  }

  @Override
  public String formatYear() {
    return "y 'г'.";
  }

  @Override
  public String formatYearMonthAbbrev() {
    return "MM.y 'г'.";
  }

  @Override
  public String formatYearMonthAbbrevDay() {
    return "d.MM.y 'г'.";
  }

  @Override
  public String formatYearMonthFull() {
    return "MMMM y 'г'.";
  }

  @Override
  public String formatYearMonthFullDay() {
    return "d MMMM y 'г'.";
  }

  @Override
  public String formatYearMonthNum() {
    return "MM.y 'г'.";
  }

  @Override
  public String formatYearMonthNumDay() {
    return "d.MM.y 'г'.";
  }

  @Override
  public String formatYearMonthWeekdayDay() {
    return "EEE, d.MM.y 'г'.";
  }

  @Override
  public String formatYearQuarterFull() {
    return "QQQQ y 'г'.";
  }

  @Override
  public String formatYearQuarterShort() {
    return "Q y 'г'.";
  }

  @Override
  public String[] monthsFull() {
    return new String[] {
        "януари",
        "февруари",
        "март",
        "април",
        "май",
        "юни",
        "юли",
        "август",
        "септември",
        "октомври",
        "ноември",
        "декември"
    };
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "я",
        "ф",
        "м",
        "а",
        "м",
        "ю",
        "ю",
        "а",
        "с",
        "о",
        "н",
        "д"
    };
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "яну",
        "фев",
        "март",
        "апр",
        "май",
        "юни",
        "юли",
        "авг",
        "сеп",
        "окт",
        "ное",
        "дек"
    };
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "1. тримесечие",
        "2. тримесечие",
        "3. тримесечие",
        "4. тримесечие"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "1. трим.",
        "2. трим.",
        "3. трим.",
        "4. трим."
    };
  }

  @Override
  public String timeFormatFull() {
    return "H:mm:ss 'ч'. zzzz";
  }

  @Override
  public String timeFormatLong() {
    return "H:mm:ss 'ч'. z";
  }

  @Override
  public String timeFormatMedium() {
    return "H:mm:ss 'ч'.";
  }

  @Override
  public String timeFormatShort() {
    return "H:mm 'ч'.";
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "неделя",
        "понеделник",
        "вторник",
        "сряда",
        "четвъртък",
        "петък",
        "събота"
    };
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "н",
        "п",
        "в",
        "с",
        "ч",
        "п",
        "с"
    };
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "нд",
        "пн",
        "вт",
        "ср",
        "чт",
        "пт",
        "сб"
    };
  }
}
