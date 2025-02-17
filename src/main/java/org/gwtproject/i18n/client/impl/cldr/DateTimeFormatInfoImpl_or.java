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
 * Implementation of DateTimeFormatInfo for the "or" locale.
 */
public class DateTimeFormatInfoImpl_or extends DateTimeFormatInfoImpl {

  @Override
  public String dateFormatFull() {
    return "EEEE, MMMM d, y";
  }

  @Override
  public String dateFormatLong() {
    return "MMMM d, y";
  }

  @Override
  public String dateFormatMedium() {
    return "MMM d, y";
  }

  @Override
  public String dateFormatShort() {
    return "M/d/yy";
  }

  @Override
  public String dateTimeFull(String timePattern, String datePattern) {
    return timePattern + " ଠାରେ " + datePattern;
  }

  @Override
  public String dateTimeLong(String timePattern, String datePattern) {
    return timePattern + " ଠାରେ " + datePattern;
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
        "ଖ୍ରୀଷ୍ଟପୂର୍ବ",
        "ଖ୍ରୀଷ୍ଟାବ୍ଦ"
    };
  }

  @Override
  public int firstDayOfTheWeek() {
    return 0;
  }

  @Override
  public String formatMonthFullWeekdayDay() {
    return "EEEE, MMMM d";
  }

  @Override
  public String formatMonthNumDay() {
    return "M/d";
  }

  @Override
  public String formatYearMonthAbbrev() {
    return "MMM y";
  }

  @Override
  public String formatYearMonthAbbrevDay() {
    return "MMM d, y";
  }

  @Override
  public String formatYearMonthFull() {
    return "MMMM y";
  }

  @Override
  public String formatYearMonthFullDay() {
    return "MMMM d, y";
  }

  @Override
  public String formatYearMonthNum() {
    return "M/y";
  }

  @Override
  public String formatYearMonthNumDay() {
    return "M/d/y";
  }

  @Override
  public String formatYearMonthWeekdayDay() {
    return "EEE, MMM d, y";
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
        "ଜାନୁଆରୀ",
        "ଫେବୃଆରୀ",
        "ମାର୍ଚ୍ଚ",
        "ଅପ୍ରେଲ",
        "ମଇ",
        "ଜୁନ",
        "ଜୁଲାଇ",
        "ଅଗଷ୍ଟ",
        "ସେପ୍ଟେମ୍ବର",
        "ଅକ୍ଟୋବର",
        "ନଭେମ୍ବର",
        "ଡିସେମ୍ବର"
    };
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "ଜା",
        "ଫେ",
        "ମା",
        "ଅ",
        "ମଇ",
        "ଜୁ",
        "ଜୁ",
        "ଅ",
        "ସେ",
        "ଅ",
        "ନ",
        "ଡି"
    };
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "ଜାନୁଆରୀ",
        "ଫେବୃଆରୀ",
        "ମାର୍ଚ୍ଚ",
        "ଅପ୍ରେଲ",
        "ମଇ",
        "ଜୁନ",
        "ଜୁଲାଇ",
        "ଅଗଷ୍ଟ",
        "ସେପ୍ଟେମ୍ବର",
        "ଅକ୍ଟୋବର",
        "ନଭେମ୍ବର",
        "ଡିସେମ୍ବର"
    };
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "1ମ ତ୍ରୟମାସ",
        "2ୟ ତ୍ରୟମାସ",
        "3ୟ ତ୍ରୟମାସ",
        "4ର୍ଥ ତ୍ରୟମାସ"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "1ମ ତ୍ରୟମାସ",
        "2ୟ ତ୍ରୟମାସ",
        "3ୟ ତ୍ରୟମାସ",
        "4ର୍ଥ ତ୍ରୟମାସ"
    };
  }

  @Override
  public String timeFormatFull() {
    return "h:mm:ss a zzzz";
  }

  @Override
  public String timeFormatLong() {
    return "h:mm:ss a z";
  }

  @Override
  public String timeFormatMedium() {
    return "h:mm:ss a";
  }

  @Override
  public String timeFormatShort() {
    return "h:mm a";
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "ରବିବାର",
        "ସୋମବାର",
        "ମଙ୍ଗଳବାର",
        "ବୁଧବାର",
        "ଗୁରୁବାର",
        "ଶୁକ୍ରବାର",
        "ଶନିବାର"
    };
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "ର",
        "ସୋ",
        "ମ",
        "ବୁ",
        "ଗୁ",
        "ଶୁ",
        "ଶ"
    };
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "ରବି",
        "ସୋମ",
        "ମଙ୍ଗଳ",
        "ବୁଧ",
        "ଗୁରୁ",
        "ଶୁକ୍ର",
        "ଶନି"
    };
  }

  @Override
  public int weekendStart() {
    return 0;
  }
}
