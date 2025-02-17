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
package org.gwtproject.i18n.client.impl.cldr;
// DO NOT EDIT - GENERATED FROM CLDR AND ICU DATA

/**
 * Implementation of DateTimeFormatInfo for the "fy" locale.
 */
public class DateTimeFormatInfoImpl_fy extends DateTimeFormatInfoImpl {

  @Override
  public String dateFormatFull() {
    return "EEEE d MMMM y";
  }

  @Override
  public String dateFormatLong() {
    return "d MMMM y";
  }

  @Override
  public String dateFormatMedium() {
    return "d MMM y";
  }

  @Override
  public String dateFormatShort() {
    return "dd-MM-yy";
  }

  @Override
  public String dateTimeFull(String timePattern, String datePattern) {
    return datePattern + " 'om' " + timePattern;
  }

  @Override
  public String dateTimeLong(String timePattern, String datePattern) {
    return datePattern + " 'om' " + timePattern;
  }

  @Override
  public String[] erasFull() {
    return new String[] {
        "Foar Kristus",
        "nei Kristus"
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "f.Kr.",
        "n.Kr."
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
    return "EEEE d MMMM";
  }

  @Override
  public String formatMonthNumDay() {
    return "d-M";
  }

  @Override
  public String formatYearMonthAbbrev() {
    return "MMM y";
  }

  @Override
  public String formatYearMonthAbbrevDay() {
    return "d MMM y";
  }

  @Override
  public String formatYearMonthFull() {
    return "MMMM y";
  }

  @Override
  public String formatYearMonthFullDay() {
    return "d MMMM y";
  }

  @Override
  public String formatYearMonthNum() {
    return "M-y";
  }

  @Override
  public String formatYearMonthNumDay() {
    return "d-M-y";
  }

  @Override
  public String formatYearMonthWeekdayDay() {
    return "EEE d MMM y";
  }

  @Override
  public String formatYearQuarterFull() {
    return "QQQQ y";
  }

  @Override
  public String formatYearQuarterShort() {
    return "Q y";
  }

  @Override
  public String[] monthsFull() {
    return new String[] {
        "Jannewaris",
        "Febrewaris",
        "Maart",
        "April",
        "Maaie",
        "Juny",
        "July",
        "Augustus",
        "Septimber",
        "Oktober",
        "Novimber",
        "Desimber"
    };
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "Jan",
        "Feb",
        "Mrt",
        "Apr",
        "Mai",
        "Jun",
        "Jul",
        "Aug",
        "Sep",
        "Okt",
        "Nov",
        "Des"
    };
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "1e fearnsjier",
        "2e fearnsjier",
        "3e fearnsjier",
        "4e fearnsjier"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "K1",
        "K2",
        "K3",
        "K4"
    };
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "snein",
        "moandei",
        "tiisdei",
        "woansdei",
        "tongersdei",
        "freed",
        "sneon"
    };
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "si",
        "mo",
        "ti",
        "wo",
        "to",
        "fr",
        "so"
    };
  }
}
