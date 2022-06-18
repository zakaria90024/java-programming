# অধ্যায় ১৩ – জাভা ডেট ও টাইম (Java Date and Time)

- Legacy
  - java.util.Date
  - java.util.Calender
  - java.util.SimpleDateFormat
- SimpleDateFormat java 17: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/text/SimpleDateFormat.html

## java.time প্যাকেজ

- Not 365
- 365.242 or 365 day 5 hour 48 minutes 46 second
- https://youtu.be/IJhgZBn-LHg
- Daylight saving time (DST)
- Human Time
- Machine Time
- LocalDate
- LocalTime
- LocalDateTime

## LocalDate

- static LocalDate now();
- static LocalDate of(int year, int month, int dayOfMonth);
- static LocalDate of(int year, Month month, int dayOfMonth);
- LocalDate plusDays(long daysToAdd);
- LocalDate plusWeeks(long weeksToAdd);
- LocalDate plusMonths(long monthsToAdd);
- LocalDate plusYears(long yearsToAdd);
- LocalDate minusDays(long daysToSubtract);
- LocalDate minusWeeks(long weeksToSubtract);
- LocalDate minusMonths(long monthsToSubtract);
- LocalDate minusYears(long yearsToSubtract);

## LocalTime

- static LocalTime of(int hour, int minute);
- static LocalTime of(int hour, int minute, int second);
- static LocalTime of(int hour, int minute, int second, int nameOfSecond);

## LocalDateTime

- https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/LocalDateTime.html

## টাইম জোনের হিসাব (Time zone calculation)

- 24 jone -> 15 degree
- Greenwich mean time (GMT) -> 1878
- GMT+6 -> Dhaka
- GMT-5 -> Toronto
- Coordinated Universal Time (UTC) -> 1963
- UTC format: +-[hh]:[mm], +-[hh][mm], +-[hh]
- 1 hour stay ahead: +01:00, +0100, +01
- Time Zone: Eastern Standard Time (EST), Bangladesh Standard Time (BST)
- ZoneOffset, ZoneId
- OffsetDateTime, ZonedDateTime
- ISO 8601
- https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/OffsetDateTime.html
- https://docs.oracle.com/en/java/javase/17/docs/api//java.base/java/time/ZonedDateTime.html

## ফরম্যাটিং ও পার্সিং (Formatting and parsing)

- LocalDateTime.parse()
- DateTimeFormatter
- https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
- DateTimeFormatter.ofPattern("yyyy MM dd");
- Builder pattern
- EPOCH
- General Conference on Weights and Measures
  - https://en.wikipedia.org/wiki/General_Conference_on_Weights_and_Measures
- Caesium-133
  - In 1 second: 9,192,631,770
- Using Instant calls
  - 1 January 1970
  - +1 Billion year
  - -1 Billion year
- Universe exist 13.77 Billion year
- Human exist 200,000 year
