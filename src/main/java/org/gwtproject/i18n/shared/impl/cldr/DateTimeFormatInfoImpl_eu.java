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
 * Implementation of DateTimeFormatInfo for the "eu" locale.
 */
public class DateTimeFormatInfoImpl_eu extends DateTimeFormatInfoImpl {

  @Override
  public String dateFormatFull() {
    return "y('e')'ko' MMMM'ren' d('a'), EEEE";
  }

  @Override
  public String dateFormatLong() {
    return "y('e')'ko' MMMM'ren' d('a')";
  }

  @Override
  public String dateFormatMedium() {
    return "y('e')'ko' MMM d('a')";
  }

  @Override
  public String dateFormatShort() {
    return "yy/M/d";
  }

  @Override
  public String[] erasFull() {
    return new String[] {
        "K.a.",
        "Kristo ondoren"
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "K.a.",
        "K.o."
    };
  }

  @Override
  public String formatMonthNumDay() {
    return "M/d";
  }

  @Override
  public String formatYearMonthFull() {
    return "y('e')'ko' MMMM";
  }

  @Override
  public String formatYearMonthFullDay() {
    return "y('e')'ko' MMMM'ren' d";
  }

  @Override
  public String formatYearMonthNum() {
    return "y/M";
  }

  @Override
  public String formatYearMonthNumDay() {
    return "y/M/d";
  }

  @Override
  public String formatYearQuarterFull() {
    return "y('e')'ko' QQQQ";
  }

  @Override
  public String formatYearQuarterShort() {
    return "y('e')'ko' Q";
  }

  @Override
  public String[] monthsFull() {
    return new String[] {
        "urtarrila",
        "otsaila",
        "martxoa",
        "apirila",
        "maiatza",
        "ekaina",
        "uztaila",
        "abuztua",
        "iraila",
        "urria",
        "azaroa",
        "abendua"
    };
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "U",
        "O",
        "M",
        "A",
        "M",
        "E",
        "U",
        "A",
        "I",
        "U",
        "A",
        "A"
    };
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "urt.",
        "ots.",
        "mar.",
        "api.",
        "mai.",
        "eka.",
        "uzt.",
        "abu.",
        "ira.",
        "urr.",
        "aza.",
        "abe."
    };
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "1. hiruhilekoa",
        "2. hiruhilekoa",
        "3. hiruhilekoa",
        "4. hiruhilekoa"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "1Hh",
        "2Hh",
        "3Hh",
        "4Hh"
    };
  }

  @Override
  public String timeFormatFull() {
    return "HH:mm:ss (zzzz)";
  }

  @Override
  public String timeFormatLong() {
    return "HH:mm:ss (z)";
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "igandea",
        "astelehena",
        "asteartea",
        "asteazkena",
        "osteguna",
        "ostirala",
        "larunbata"
    };
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "I",
        "A",
        "A",
        "A",
        "O",
        "O",
        "L"
    };
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "ig.",
        "al.",
        "ar.",
        "az.",
        "og.",
        "or.",
        "lr."
    };
  }
}
