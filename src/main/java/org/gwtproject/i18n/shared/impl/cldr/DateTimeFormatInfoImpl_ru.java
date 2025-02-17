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
 * Implementation of DateTimeFormatInfo for the "ru" locale.
 */
public class DateTimeFormatInfoImpl_ru extends DateTimeFormatInfoImpl {

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
    return "d MMM y 'г'.";
  }

  @Override
  public String dateFormatShort() {
    return "dd.MM.y";
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
        "до Рождества Христова",
        "от Рождества Христова"
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "до н. э.",
        "н. э."
    };
  }

  @Override
  public String formatMonthAbbrevDay() {
    return "d MMM";
  }

  @Override
  public String formatMonthFullDay() {
    return "d MMMM";
  }

  @Override
  public String formatMonthFullWeekdayDay() {
    return "cccc, d MMMM";
  }

  @Override
  public String formatMonthNumDay() {
    return "dd.MM";
  }

  @Override
  public String formatYearMonthAbbrev() {
    return "LLL y 'г'.";
  }

  @Override
  public String formatYearMonthAbbrevDay() {
    return "d MMM y 'г'.";
  }

  @Override
  public String formatYearMonthFull() {
    return "LLLL y 'г'.";
  }

  @Override
  public String formatYearMonthFullDay() {
    return "d MMMM y 'г'.";
  }

  @Override
  public String formatYearMonthNum() {
    return "MM.y";
  }

  @Override
  public String formatYearMonthNumDay() {
    return "dd.MM.y";
  }

  @Override
  public String formatYearMonthWeekdayDay() {
    return "EEE, d MMM y 'г'.";
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
        "января",
        "февраля",
        "марта",
        "апреля",
        "мая",
        "июня",
        "июля",
        "августа",
        "сентября",
        "октября",
        "ноября",
        "декабря"
    };
  }

  @Override
  public String[] monthsFullStandalone() {
    return new String[] {
        "январь",
        "февраль",
        "март",
        "апрель",
        "май",
        "июнь",
        "июль",
        "август",
        "сентябрь",
        "октябрь",
        "ноябрь",
        "декабрь"
    };
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "Я",
        "Ф",
        "М",
        "А",
        "М",
        "И",
        "И",
        "А",
        "С",
        "О",
        "Н",
        "Д"
    };
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "янв.",
        "февр.",
        "мар.",
        "апр.",
        "мая",
        "июн.",
        "июл.",
        "авг.",
        "сент.",
        "окт.",
        "нояб.",
        "дек."
    };
  }

  @Override
  public String[] monthsShortStandalone() {
    return new String[] {
        "янв.",
        "февр.",
        "март",
        "апр.",
        "май",
        "июнь",
        "июль",
        "авг.",
        "сент.",
        "окт.",
        "нояб.",
        "дек."
    };
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "1-й квартал",
        "2-й квартал",
        "3-й квартал",
        "4-й квартал"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "1-й кв.",
        "2-й кв.",
        "3-й кв.",
        "4-й кв."
    };
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "воскресенье",
        "понедельник",
        "вторник",
        "среда",
        "четверг",
        "пятница",
        "суббота"
    };
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "вс",
        "пн",
        "вт",
        "ср",
        "чт",
        "пт",
        "сб"
    };
  }

  @Override
  public String[] weekdaysNarrowStandalone() {
    return new String[] {
        "В",
        "П",
        "В",
        "С",
        "Ч",
        "П",
        "С"
    };
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "вс",
        "пн",
        "вт",
        "ср",
        "чт",
        "пт",
        "сб"
    };
  }
}
