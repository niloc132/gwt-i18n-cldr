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
 * Implementation of DateTimeFormatInfo for the "ca" locale.
 */
public class DateTimeFormatInfoImpl_ca extends DateTimeFormatInfoImpl {

  @Override
  public String[] ampms() {
    return new String[] {
        "a. m.",
        "p. m."
    };
  }

  @Override
  public String dateFormatFull() {
    return "EEEE, d MMMM 'de' y";
  }

  @Override
  public String dateFormatLong() {
    return "d MMMM 'de' y";
  }

  @Override
  public String dateFormatMedium() {
    return "d MMM y";
  }

  @Override
  public String dateFormatShort() {
    return "d/M/yy";
  }

  @Override
  public String dateTimeFull(String timePattern, String datePattern) {
    return datePattern + " 'a' 'les' " + timePattern;
  }

  @Override
  public String dateTimeLong(String timePattern, String datePattern) {
    return datePattern + " 'a' 'les' " + timePattern;
  }

  @Override
  public String dateTimeMedium(String timePattern, String datePattern) {
    return datePattern + ", " + timePattern;
  }

  @Override
  public String[] erasFull() {
    return new String[] {
        "abans de Crist",
        "després de Crist"
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "aC",
        "dC"
    };
  }

  @Override
  public String formatHour24Minute() {
    return "H:mm";
  }

  @Override
  public String formatHour24MinuteSecond() {
    return "H:mm:ss";
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
    return "EEEE, d MMMM";
  }

  @Override
  public String formatMonthNumDay() {
    return "d/M";
  }

  @Override
  public String formatYearMonthAbbrev() {
    return "LLL 'de' y";
  }

  @Override
  public String formatYearMonthAbbrevDay() {
    return "d MMM 'de' y";
  }

  @Override
  public String formatYearMonthFull() {
    return "LLLL 'de' y";
  }

  @Override
  public String formatYearMonthFullDay() {
    return "d MMMM 'de' y";
  }

  @Override
  public String formatYearMonthNum() {
    return "M/y";
  }

  @Override
  public String formatYearMonthNumDay() {
    return "d/M/y";
  }

  @Override
  public String formatYearMonthWeekdayDay() {
    return "EEE, d MMM y";
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
        "de gener",
        "de febrer",
        "de març",
        "d’abril",
        "de maig",
        "de juny",
        "de juliol",
        "d’agost",
        "de setembre",
        "d’octubre",
        "de novembre",
        "de desembre"
    };
  }

  @Override
  public String[] monthsFullStandalone() {
    return new String[] {
        "gener",
        "febrer",
        "març",
        "abril",
        "maig",
        "juny",
        "juliol",
        "agost",
        "setembre",
        "octubre",
        "novembre",
        "desembre"
    };
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "GN",
        "FB",
        "MÇ",
        "AB",
        "MG",
        "JN",
        "JL",
        "AG",
        "ST",
        "OC",
        "NV",
        "DS"
    };
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "de gen.",
        "de febr.",
        "de març",
        "d’abr.",
        "de maig",
        "de juny",
        "de jul.",
        "d’ag.",
        "de set.",
        "d’oct.",
        "de nov.",
        "de des."
    };
  }

  @Override
  public String[] monthsShortStandalone() {
    return new String[] {
        "gen.",
        "febr.",
        "març",
        "abr.",
        "maig",
        "juny",
        "jul.",
        "ag.",
        "set.",
        "oct.",
        "nov.",
        "des."
    };
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "1r trimestre",
        "2n trimestre",
        "3r trimestre",
        "4t trimestre"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "1T",
        "2T",
        "3T",
        "4T"
    };
  }

  @Override
  public String timeFormatFull() {
    return "H:mm:ss zzzz";
  }

  @Override
  public String timeFormatLong() {
    return "H:mm:ss z";
  }

  @Override
  public String timeFormatMedium() {
    return "H:mm:ss";
  }

  @Override
  public String timeFormatShort() {
    return "H:mm";
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "diumenge",
        "dilluns",
        "dimarts",
        "dimecres",
        "dijous",
        "divendres",
        "dissabte"
    };
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "dg",
        "dl",
        "dt",
        "dc",
        "dj",
        "dv",
        "ds"
    };
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "dg.",
        "dl.",
        "dt.",
        "dc.",
        "dj.",
        "dv.",
        "ds."
    };
  }
}
