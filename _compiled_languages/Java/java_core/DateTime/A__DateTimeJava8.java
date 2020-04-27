import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;


/**
 * String format reference:
 * https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
 */
class Main {
  public static void main(String[] args) {

    //
    // LocalDate
    //

    // String to obj 
    String date1 = "20201010";
    String pattern1 = "yyyyMMdd";
    LocalDate ld1 = LocalDate.parse(date1, DateTimeFormatter.ofPattern(pattern1));
    System.out.println("ld1 : " + ld1); // 2020-10-10
    

    // Obj to string (LocalDate)
    LocalDate ldtObj2 = LocalDate.of(2015, Month.JANUARY, 25);
    String pattern2 = "yyyyMMdd";
    String dateStr2 = ldtObj2.format(DateTimeFormatter.ofPattern(pattern2));
    System.out.println("dateStr2: " + dateStr2); // 20150125

    
    //
    // LocalDateTime
    //

    // String to obj 
    String date3 = "20201010112222";
    String pattern3 = "yyyyMMddHHmmss";
    LocalDateTime ld3 = LocalDateTime.parse(date3, DateTimeFormatter.ofPattern(pattern3));
    System.out.println("ld3 : " + ld3); // 2020-10-10T11:22:22


    // Obj to string
    LocalDateTime ldtObj4 = LocalDateTime.of(2015, Month.JANUARY, 25, 6, 30);
    String pattern4 = "yyyyMMdd";
    String dateStr4 = ldtObj4.format(DateTimeFormatter.ofPattern(pattern4));
    System.out.println("dateStr4: " + dateStr4); // 20150125
  }
}