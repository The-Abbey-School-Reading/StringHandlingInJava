import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringConversionExample {
    public static void main(String[] args) {
        // String to integer
        String strInt = "123";
        int intValue = Integer.parseInt(strInt);
        System.out.println("String to integer: " + intValue);
        
        // String to float
        String strFloat = "123.45";
        float floatValue = Float.parseFloat(strFloat);
        System.out.println("String to float: " + floatValue);
        
        // Integer to string
        int intToStr = 456;
        String strFromInt = Integer.toString(intToStr);
        System.out.println("Integer to string: " + strFromInt);
        
        // Float to string
        float floatToStr = 456.78f;
        String strFromFloat = Float.toString(floatToStr);
        System.out.println("Float to string: " + strFromFloat);
        
        // Date/Time to string
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String strFromDateTime = dateTime.format(formatter);
        System.out.println("Date/Time to string: " + strFromDateTime);
        
        // String to Date/Time
        String strDateTime = "2024-09-14 08:40:02";
        LocalDateTime dateTimeFromString = LocalDateTime.parse(strDateTime, formatter);
        System.out.println("String to Date/Time: " + dateTimeFromString);
    }
}
